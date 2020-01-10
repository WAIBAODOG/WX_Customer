/**   
 * Copyright © 2019 By TISSON. All rights reserved.
 * @Title: ConnUtil.java
 * @Package com.ruoyi.wxcustomer.util
 * @Description: TODO(用一句话描述该文件做什么)
 * @author  HuaSheng
 * @date 2020年1月9日 上午11:20:37
 * @version v1.0  
 */
package com.ruoyi.wxcustomer.util;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
* @ClassName: ConnUtil
* @Description: 测试链接工具
* @author HuaSheng
* @date 2020年1月9日 上午11:20:37
*
*/
public class ConnUtil {
	/**
	 * 判断ip、端口是否可连接
	 * @param host
	 * @param port
	 * @return
	 */
	public static boolean isHostConnectable(String host, int port) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(host, port),300);
        } catch (IOException e) {
          //  e.printStackTrace();
            return false;
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
               // e.printStackTrace();
            }
        }
        return true;
    }
	/**
	 * 判断ip是否可以连接 timeOut是超时时间
	 */
	public static boolean isHostReachable(String host, Integer timeOut) {
        try {
            return InetAddress.getByName(host).isReachable(timeOut);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
