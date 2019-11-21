/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : ry

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-11-21 15:38:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gen_table
-- ----------------------------
DROP TABLE IF EXISTS `gen_table`;
CREATE TABLE `gen_table` (
  `table_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `table_name` varchar(200) DEFAULT '' COMMENT '表名称',
  `table_comment` varchar(500) DEFAULT '' COMMENT '表描述',
  `class_name` varchar(100) DEFAULT '' COMMENT '实体类名称',
  `tpl_category` varchar(200) DEFAULT 'crud' COMMENT '使用的模板（crud单表操作 tree树表操作）',
  `package_name` varchar(100) DEFAULT NULL COMMENT '生成包路径',
  `module_name` varchar(30) DEFAULT NULL COMMENT '生成模块名',
  `business_name` varchar(30) DEFAULT NULL COMMENT '生成业务名',
  `function_name` varchar(50) DEFAULT NULL COMMENT '生成功能名',
  `function_author` varchar(50) DEFAULT NULL COMMENT '生成功能作者',
  `options` varchar(1000) DEFAULT NULL COMMENT '其它生成选项',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`table_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='代码生成业务表';

-- ----------------------------
-- Records of gen_table
-- ----------------------------
INSERT INTO `gen_table` VALUES ('1', 'kh_wechat_customer', '微信客户表', 'WechatCustomer', 'crud', 'com.ruoyi.web.wxcustomer', 'WechatCustomer', 'WechatCustomer', '微信客户', 'yzh', '{\"treeName\":\"\",\"treeParentCode\":\"\",\"treeCode\":\"\"}', 'admin', '2019-10-22 16:23:42', '', '2019-10-23 20:43:07', '');
INSERT INTO `gen_table` VALUES ('2', 'kh_after_sale_member', '售后情况表', 'KhAfterSaleMember', 'crud', 'com.ruoyi.web.wxcustomer', 'afterSaleMember', 'afterSale', '售后情况', 'WBG', '{\"treeName\":\"\",\"treeParentCode\":\"\",\"treeCode\":\"\"}', 'admin', '2019-10-23 20:06:31', '', '2019-10-23 20:42:29', '');
INSERT INTO `gen_table` VALUES ('4', 'kh_deliver_goods', '发样/成交情况表', 'KhDeliverGoods', 'crud', 'com.ruoyi.system', 'system', 'goods', '发样/成交情况', 'ruoyi', '{\"treeName\":\"\",\"treeParentCode\":\"\",\"treeCode\":\"\"}', 'admin', '2019-11-06 20:21:46', '', '2019-11-06 20:29:31', '');
INSERT INTO `gen_table` VALUES ('5', 'kh_daily_summary', '总结表', 'KhDailySummary', 'crud', 'com.ruoyi.wxcustomer', 'wxcustomer', 'summary', '工作总结', 'ruoyi', '{\"treeName\":\"\",\"treeParentCode\":\"\",\"treeCode\":\"\"}', 'admin', '2019-11-19 11:54:47', '', '2019-11-19 17:06:32', '');
INSERT INTO `gen_table` VALUES ('6', 'kh_qa_library', '问答库', 'KhQaLibrary', 'crud', 'com.ruoyi.wxcustomer', 'wxcustomer', 'qalibrary', '问答库', 'ruoyi', '{\"treeName\":\"\",\"treeParentCode\":\"\",\"treeCode\":\"\"}', 'admin', '2019-11-20 15:59:05', '', '2019-11-20 16:03:50', '');

-- ----------------------------
-- Table structure for gen_table_column
-- ----------------------------
DROP TABLE IF EXISTS `gen_table_column`;
CREATE TABLE `gen_table_column` (
  `column_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `table_id` varchar(64) DEFAULT NULL COMMENT '归属表编号',
  `column_name` varchar(200) DEFAULT NULL COMMENT '列名称',
  `column_comment` varchar(500) DEFAULT NULL COMMENT '列描述',
  `column_type` varchar(100) DEFAULT NULL COMMENT '列类型',
  `java_type` varchar(500) DEFAULT NULL COMMENT 'JAVA类型',
  `java_field` varchar(200) DEFAULT NULL COMMENT 'JAVA字段名',
  `is_pk` char(1) DEFAULT NULL COMMENT '是否主键（1是）',
  `is_increment` char(1) DEFAULT NULL COMMENT '是否自增（1是）',
  `is_required` char(1) DEFAULT NULL COMMENT '是否必填（1是）',
  `is_insert` char(1) DEFAULT NULL COMMENT '是否为插入字段（1是）',
  `is_edit` char(1) DEFAULT NULL COMMENT '是否编辑字段（1是）',
  `is_list` char(1) DEFAULT NULL COMMENT '是否列表字段（1是）',
  `is_query` char(1) DEFAULT NULL COMMENT '是否查询字段（1是）',
  `query_type` varchar(200) DEFAULT 'EQ' COMMENT '查询方式（等于、不等于、大于、小于、范围）',
  `html_type` varchar(200) DEFAULT NULL COMMENT '显示类型（文本框、文本域、下拉框、复选框、单选框、日期控件）',
  `dict_type` varchar(200) DEFAULT '' COMMENT '字典类型',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`column_id`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8 COMMENT='代码生成业务表字段';

-- ----------------------------
-- Records of gen_table_column
-- ----------------------------
INSERT INTO `gen_table_column` VALUES ('1', '1', 'customer_id', '客户ID', 'varchar(64)', 'String', 'customerId', '1', '0', null, '1', null, null, null, 'EQ', 'input', '', '1', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('2', '1', 'phone_number', '电话号', 'varchar(64)', 'String', 'phoneNumber', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '2', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('3', '1', 'weixin_number', '微信号', 'varchar(64)', 'String', 'weixinNumber', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '3', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('4', '1', 'customer_name', '客户姓名', 'varchar(64)', 'String', 'customerName', '0', '0', null, '1', '1', '1', '1', 'LIKE', 'input', '', '4', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('5', '1', 'gender', '性别', 'varchar(4)', 'String', 'gender', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '5', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('6', '1', 'character', '性格', 'varchar(255)', 'String', 'character', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '6', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('7', '1', 'creator_id', '创建人id（对接业务员）', 'varchar(64)', 'String', 'creatorId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '7', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('8', '1', 'creator', '对接业务员', 'varchar(255)', 'String', 'creator', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '8', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('9', '1', 'province_id', '客户地址-省id', 'varchar(64)', 'String', 'provinceId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '9', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('10', '1', 'province', '客户地址-省', 'varchar(255)', 'String', 'province', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '10', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('11', '1', 'city_id', '客户地址-市id', 'varchar(64)', 'String', 'cityId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '11', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('12', '1', 'city', '客户地址-市', 'varchar(255)', 'String', 'city', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '12', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('13', '1', 'area_id', '客户地址-区id', 'varchar(64)', 'String', 'areaId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '13', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('14', '1', 'area', '客户地址-区', 'varchar(255)', 'String', 'area', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '14', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('15', '1', 'customer_address', '客户地址详细', 'varchar(255)', 'String', 'customerAddress', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '15', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('16', '1', 'shop_name', '店名', 'varchar(255)', 'String', 'shopName', '0', '0', null, '1', '1', '1', '1', 'LIKE', 'input', '', '16', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('17', '1', 'appointment_time', '预约沟通时间', 'datetime', 'Date', 'appointmentTime', '0', '0', null, '1', '1', '1', '1', 'EQ', 'datetime', '', '17', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('18', '1', 'customer_type_id', '客户类型id', 'varchar(64)', 'String', 'customerTypeId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '18', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('19', '1', 'customer_type', '客户类型（0：日化店  1：母婴店  2：美容院）', 'varchar(64)', 'String', 'customerType', '0', '0', null, '1', '1', '1', '1', 'EQ', 'select', 'customer_type', '19', 'admin', '2019-10-22 16:23:42', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('20', '1', 'shop_assistant_number', '店员数', 'int(11)', 'Long', 'shopAssistantNumber', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '20', 'admin', '2019-10-22 16:23:43', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('21', '1', 'store_scale', '店铺规模', 'varchar(255)', 'String', 'storeScale', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '21', 'admin', '2019-10-22 16:23:43', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('22', '1', 'creation_time', '创建时间', 'datetime', 'Date', 'creationTime', '0', '0', null, '1', '1', '1', '1', 'EQ', 'datetime', '', '22', 'admin', '2019-10-22 16:23:43', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('23', '1', 'demand_product', '需求产品', 'varchar(512)', 'String', 'demandProduct', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '23', 'admin', '2019-10-22 16:23:43', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('24', '1', 'remark', '备注', 'varchar(1024)', 'String', 'remark', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '24', 'admin', '2019-10-22 16:23:43', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('25', '1', 'is_delivery', '是否发样（0：否 1：是） 默认0', 'varchar(2)', 'String', 'isDelivery', '0', '0', null, '1', null, '1', '1', 'EQ', 'select', 'is_delivery', '25', 'admin', '2019-10-22 16:23:43', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('26', '1', 'is_sales', '是否销售（0：否 1：是）默认0', 'varchar(2)', 'String', 'isSales', '0', '0', null, '1', null, '1', '1', 'EQ', 'select', 'is_delivery', '26', 'admin', '2019-10-22 16:23:43', null, '2019-10-23 20:43:07');
INSERT INTO `gen_table_column` VALUES ('27', '2', 'id', 'id', 'varchar(64)', 'String', 'id', '1', '0', null, '1', null, null, null, 'EQ', 'input', '', '1', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('28', '2', 'customer_id', '客户编号', 'varchar(64)', 'String', 'customerId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '2', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('29', '2', 'follow_result_type', '跟进结果类型', 'varchar(12)', 'String', 'followResultType', '0', '0', null, '1', '1', '1', '1', 'EQ', 'select', 'follow_result_type', '3', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('30', '2', 'deal_amount', '成交金额', 'decimal(12,2)', 'Double', 'dealAmount', '0', '0', null, '1', '1', '1', '1', 'BETWEEN', 'input', '', '4', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('31', '2', 'send_sample_list', '发样/成交清单', 'varchar(1024)', 'String', 'sendSampleList', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '5', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('32', '2', 'gifts_list', '赠品清单', 'varchar(1024)', 'String', 'giftsList', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '6', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('33', '2', 'deal_time', '成交日期', 'datetime', 'Date', 'dealTime', '0', '0', null, '1', '1', '1', '1', 'BETWEEN', 'datetime', '', '7', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('34', '2', 'trouble_spots', '问题点', 'varchar(1024)', 'String', 'troubleSpots', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '8', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('35', '2', 'intention_point', '意向点', 'varchar(1024)', 'String', 'intentionPoint', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '9', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('36', '2', 'follow_times', '跟进次数', 'int(11)', 'Long', 'followTimes', '0', '0', null, '1', '1', '1', null, 'EQ', 'input', '', '10', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('37', '2', 'follow_result', '跟进情况', 'varchar(1024)', 'String', 'followResult', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '11', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('38', '2', 'duration_hour', '通话时长-时', 'int(255)', 'Long', 'durationHour', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '12', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('39', '2', 'duration_minute', '通话时长-分', 'int(255)', 'Long', 'durationMinute', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '13', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('40', '2', 'duration_second', '通话时长-秒', 'int(255)', 'Long', 'durationSecond', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '14', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('41', '2', 'next_follow_time', '下次跟进时间', 'datetime', 'Date', 'nextFollowTime', '0', '0', null, '1', '1', null, null, 'EQ', 'datetime', '', '15', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('42', '2', 'next_follow_mentality', '下次跟进思路', 'varchar(1024)', 'String', 'nextFollowMentality', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '16', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('43', '2', 'creator_id', '对接业务员id', 'varchar(64)', 'String', 'creatorId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '17', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('44', '2', 'creator', '对接业务员', 'varchar(255)', 'String', 'creator', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '18', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('45', '2', 'sender', '发件人', 'varchar(255)', 'String', 'sender', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '19', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('46', '2', 'sender_phone', '发件人电话', 'varchar(255)', 'String', 'senderPhone', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '20', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('47', '2', 'sender_address', '发件人地址', 'varchar(255)', 'String', 'senderAddress', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '21', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('48', '2', 'send_time', '发货日期', 'datetime', 'Date', 'sendTime', '0', '0', null, '1', '1', null, null, 'EQ', 'datetime', '', '22', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('49', '2', 'courier_number', '快递单号', 'varchar(64)', 'String', 'courierNumber', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '23', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('50', '2', 'logistics_company', '物流公司', 'varchar(64)', 'String', 'logisticsCompany', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '24', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('51', '2', 'collecting_amount', '代收金额', 'decimal(11,2)', 'Double', 'collectingAmount', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '25', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('52', '2', 'insurance_amount', '保价金额', 'decimal(11,2)', 'Double', 'insuranceAmount', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '26', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('53', '2', 'postage', '邮费', 'int(11)', 'Long', 'postage', '0', '0', null, '1', '1', null, null, 'EQ', 'input', '', '27', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('54', '2', 'is_deal', '是否成交（0，是 1否）', 'varchar(4)', 'String', 'isDeal', '0', '0', '1', '1', '1', '1', '1', 'EQ', 'select', 'is_delivery', '28', 'admin', '2019-10-23 20:06:31', null, '2019-10-23 20:42:29');
INSERT INTO `gen_table_column` VALUES ('82', '4', 'id', 'null', 'varchar(64)', 'String', 'id', '1', '0', null, '1', null, null, null, 'EQ', 'input', '', '1', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('83', '4', 'customer_id', 'null', 'varchar(64)', 'String', 'customerId', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '2', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('84', '4', 'follow_result_type', '跟进结果类型', 'varchar(12)', 'String', 'followResultType', '0', '0', null, '1', '1', '1', '1', 'EQ', 'select', '', '3', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('85', '4', 'deal_amount', '成交金额（发样和沟通为空）', 'decimal(12,2)', 'Double', 'dealAmount', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '4', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('86', '4', 'send_sample_list', '发样/成交清单', 'varchar(1024)', 'String', 'sendSampleList', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '5', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('87', '4', 'gifts_list', '赠品清单', 'varchar(1024)', 'String', 'giftsList', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '6', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('88', '4', 'deal_time', '成交日期', 'datetime', 'Date', 'dealTime', '0', '0', null, '1', '1', '1', '1', 'EQ', 'datetime', '', '7', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('89', '4', 'trouble_spots', '问题点', 'varchar(1024)', 'String', 'troubleSpots', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '8', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('90', '4', 'intention_point', '意向点', 'varchar(1024)', 'String', 'intentionPoint', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '9', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('91', '4', 'follow_times', '跟进次数', 'int(11)', 'Long', 'followTimes', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '10', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('92', '4', 'follow_result', '跟进情况', 'varchar(1024)', 'String', 'followResult', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '11', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('93', '4', 'duration_hour', '通话时长-时', 'int(255)', 'Long', 'durationHour', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '12', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('94', '4', 'duration_minute', '通话时长-分', 'int(255)', 'Long', 'durationMinute', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '13', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('95', '4', 'duration_second', '通话时长-秒', 'int(255)', 'Long', 'durationSecond', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '14', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('96', '4', 'next_follow_time', '下次跟进时间', 'datetime', 'Date', 'nextFollowTime', '0', '0', null, '1', '1', '1', '1', 'EQ', 'datetime', '', '15', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('97', '4', 'next_follow_mentality', '下次跟进思路', 'varchar(1024)', 'String', 'nextFollowMentality', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '16', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('98', '4', 'creator_id', '创建人id（对接业务员）', 'varchar(64)', 'String', 'creatorId', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '17', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('99', '4', 'creator', '创建人（对接业务员）', 'varchar(255)', 'String', 'creator', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '18', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('100', '4', 'sender', '发件人', 'varchar(255)', 'String', 'sender', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '19', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('101', '4', 'sender_phone', '发件人电话', 'varchar(255)', 'String', 'senderPhone', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '20', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('102', '4', 'sender_address', '发件人地址', 'varchar(255)', 'String', 'senderAddress', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '21', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('103', '4', 'send_time', '发货日期', 'datetime', 'Date', 'sendTime', '0', '0', null, '1', '1', '1', '1', 'EQ', 'datetime', '', '22', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('104', '4', 'courier_number', '快递单号', 'varchar(64)', 'String', 'courierNumber', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '23', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('105', '4', 'logistics_company', '物流公司', 'varchar(64)', 'String', 'logisticsCompany', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '24', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('106', '4', 'collecting_amount', '代收金额', 'decimal(11,2)', 'Double', 'collectingAmount', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '25', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('107', '4', 'insurance_amount', '保价金额', 'decimal(11,2)', 'Double', 'insuranceAmount', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '26', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('108', '4', 'postage', '邮费', 'int(11)', 'Long', 'postage', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '27', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('109', '4', 'ORDER_NUMBER', '订单号', 'varchar(128)', 'String', 'orderNumber', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '28', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('110', '4', 'is_delete', 'null', 'char(2)', 'String', 'isDelete', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '29', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('111', '4', 'alternate_field_1', '备用字段1', 'varchar(512)', 'String', 'alternateField1', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '30', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('112', '4', 'alternate_field_2', '备用字段2', 'varchar(512)', 'String', 'alternateField2', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '31', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('113', '4', 'alternate_field_3', '备用字段3', 'varchar(512)', 'String', 'alternateField3', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '32', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('114', '4', 'alternate_field_4', '备用字段4', 'varchar(512)', 'String', 'alternateField4', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '33', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('115', '4', 'alternate_field_5', '备用字段5', 'varchar(512)', 'String', 'alternateField5', '0', '0', null, '1', '1', '1', '1', 'EQ', 'textarea', '', '34', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('116', '4', 'Intention_degree', '意向度', 'varchar(12)', 'String', 'intentionDegree', '0', '0', null, '1', '1', '1', '1', 'EQ', 'select', 'Intention_degree', '35', 'admin', '2019-11-06 20:21:46', null, '2019-11-06 20:29:31');
INSERT INTO `gen_table_column` VALUES ('117', '5', 'id', 'ID', 'varchar(64)', 'String', 'id', '1', '0', null, '1', null, null, null, 'EQ', 'input', '', '1', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('118', '5', 'today_data', '今日数据', 'varchar(2048)', 'String', 'todayData', '0', '0', '1', '1', '1', null, null, 'EQ', 'textarea', '', '2', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('119', '5', 'today_problems', '今日问题', 'varchar(2048)', 'String', 'todayProblems', '0', '0', '1', '1', '1', null, null, 'EQ', 'textarea', '', '3', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('120', '5', 'improved_method', '改进方法', 'varchar(2048)', 'String', 'improvedMethod', '0', '0', '1', '1', '1', null, null, 'EQ', 'textarea', '', '4', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('121', '5', 'tomorrow_plan', '明日计划', 'varchar(2048)', 'String', 'tomorrowPlan', '0', '0', '1', '1', '1', null, null, 'EQ', 'textarea', '', '5', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('122', '5', 'summary_type', '总结类型', 'varchar(12)', 'String', 'summaryType', '0', '0', '1', '1', '1', '1', '1', 'EQ', 'select', 'summary_type', '6', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('123', '5', 'conclusion_time', '总结时间', 'datetime', 'Date', 'conclusionTime', '0', '0', '1', '1', '1', '1', '1', 'EQ', 'datetime', '', '7', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('124', '5', 'creator_id', '创建人id', 'varchar(64)', 'String', 'creatorId', '0', '0', null, '1', null, null, null, 'EQ', 'input', '', '8', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('125', '5', 'creator', '创建人', 'varchar(64)', 'String', 'creator', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '9', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('126', '5', 'creation_time', '创建时间', 'datetime', 'Date', 'creationTime', '0', '0', null, '1', null, '1', '1', 'EQ', 'datetime', '', '10', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('127', '5', 'alternate_field_1', '备用字段1', 'varchar(512)', 'String', 'alternateField1', '0', '0', null, '1', null, null, null, 'EQ', 'textarea', '', '11', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('128', '5', 'alternate_field_2', '备用字段2', 'varchar(512)', 'String', 'alternateField2', '0', '0', null, '1', null, null, null, 'EQ', 'textarea', '', '12', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('129', '5', 'alternate_field_3', '备用字段3', 'varchar(512)', 'String', 'alternateField3', '0', '0', null, '1', null, null, null, 'EQ', 'textarea', '', '13', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('130', '5', 'alternate_field_4', '备用字段4', 'varchar(512)', 'String', 'alternateField4', '0', '0', null, '1', null, null, null, 'EQ', 'textarea', '', '14', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('131', '5', 'alternate_field_5', '备用字段5', 'varchar(512)', 'String', 'alternateField5', '0', '0', null, '1', null, null, null, 'EQ', 'textarea', '', '15', 'admin', '2019-11-19 11:54:47', null, '2019-11-19 17:06:32');
INSERT INTO `gen_table_column` VALUES ('132', '6', 'id', 'id', 'varchar(64)', 'String', 'id', '1', '0', null, '1', null, null, null, 'EQ', 'input', '', '1', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('133', '6', 'problem', '问题', 'varchar(2048)', 'String', 'problem', '0', '0', '1', '1', '1', '1', '1', 'LIKE', 'textarea', '', '2', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('134', '6', 'answer', '回答', 'varchar(2048)', 'String', 'answer', '0', '0', '1', '1', '1', '1', '1', 'LIKE', 'textarea', '', '3', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('135', '6', 'remark', '备注', 'varchar(2048)', 'String', 'remark', '0', '0', null, '1', '1', null, null, 'EQ', 'textarea', '', '4', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('136', '6', 'creator_id', '创建人id', 'varchar(64)', 'String', 'creatorId', '0', '0', null, null, null, null, null, 'EQ', 'input', '', '5', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('137', '6', 'creator', '创建人', 'varchar(64)', 'String', 'creator', '0', '0', null, '1', '1', '1', '1', 'EQ', 'input', '', '6', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('138', '6', 'creation_time', '创建时间', 'datetime', 'Date', 'creationTime', '0', '0', null, '1', '1', '1', '1', 'EQ', 'datetime', '', '7', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('139', '6', 'alternate_field_1', '备用字段1', 'varchar(512)', 'String', 'alternateField1', '0', '0', null, null, null, null, null, 'EQ', 'textarea', '', '8', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');
INSERT INTO `gen_table_column` VALUES ('140', '6', 'alternate_field_2', '备用字段2', 'varchar(512)', 'String', 'alternateField2', '0', '0', null, null, null, null, null, 'EQ', 'textarea', '', '9', 'admin', '2019-11-20 15:59:05', null, '2019-11-20 16:03:50');

-- ----------------------------
-- Table structure for kh_after_sale_member
-- ----------------------------
DROP TABLE IF EXISTS `kh_after_sale_member`;
CREATE TABLE `kh_after_sale_member` (
  `id` varchar(64) NOT NULL,
  `customer_id` varchar(64) DEFAULT NULL,
  `follow_result_type` varchar(12) DEFAULT NULL COMMENT '跟进结果类型',
  `deal_amount` decimal(12,2) DEFAULT NULL COMMENT '成交金额（发样和沟通为空）',
  `send_sample_list` varchar(1024) DEFAULT NULL COMMENT '发样/成交清单',
  `gifts_list` varchar(1024) DEFAULT NULL COMMENT '赠品清单',
  `deal_time` datetime DEFAULT NULL COMMENT '成交日期',
  `trouble_spots` varchar(1024) DEFAULT NULL COMMENT '问题点',
  `intention_point` varchar(1024) DEFAULT NULL COMMENT '意向点',
  `follow_times` int(11) DEFAULT NULL COMMENT '跟进次数',
  `follow_result` varchar(1024) DEFAULT NULL COMMENT '跟进情况',
  `duration_hour` int(255) DEFAULT NULL COMMENT '通话时长-时',
  `duration_minute` int(255) DEFAULT NULL COMMENT '通话时长-分',
  `duration_second` int(255) DEFAULT NULL COMMENT '通话时长-秒',
  `next_follow_time` datetime DEFAULT NULL COMMENT '下次跟进时间',
  `next_follow_mentality` varchar(1024) DEFAULT NULL COMMENT '下次跟进思路',
  `creator_id` varchar(64) DEFAULT NULL COMMENT '创建人id（对接业务员）',
  `creator` varchar(255) DEFAULT NULL COMMENT '创建人（对接业务员）',
  `sender` varchar(255) DEFAULT NULL COMMENT '发件人',
  `sender_phone` varchar(255) DEFAULT NULL COMMENT '发件人电话',
  `sender_address` varchar(255) DEFAULT NULL COMMENT '发件人地址',
  `send_time` datetime DEFAULT NULL COMMENT '发货日期',
  `courier_number` varchar(64) DEFAULT NULL COMMENT '快递单号',
  `logistics_company` varchar(64) DEFAULT NULL COMMENT '物流公司',
  `collecting_amount` decimal(11,2) DEFAULT NULL COMMENT '代收金额',
  `insurance_amount` decimal(11,2) DEFAULT NULL COMMENT '保价金额',
  `postage` int(11) DEFAULT NULL COMMENT '邮费',
  `is_deal` varchar(4) NOT NULL COMMENT '是否成交（0，是 1否）',
  `ORDER_NUMBER` varchar(128) DEFAULT NULL COMMENT '订单号',
  `is_delete` char(255) DEFAULT '0',
  `Intention_degree` varchar(12) DEFAULT NULL COMMENT '意向度',
  `alternate_field_1` varchar(512) DEFAULT NULL COMMENT '备用字段1',
  `alternate_field_2` varchar(512) DEFAULT NULL COMMENT '备用字段2',
  `alternate_field_3` varchar(512) DEFAULT NULL COMMENT '备用字段3',
  `alternate_field_4` varchar(512) DEFAULT NULL COMMENT '备用字段4',
  `alternate_field_5` varchar(512) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='售后情况表';

-- ----------------------------
-- Records of kh_after_sale_member
-- ----------------------------
INSERT INTO `kh_after_sale_member` VALUES ('123', '440706', '1', '1.00', '1', '1', '2019-11-03 09:20:41', '1', '1', '1', '1', '1', '1', '1', '2019-11-03 09:20:53', '1', '1', '1', '1', '1', '1', '2019-11-03 09:21:00', '1', '1', '1.00', '1.00', '1', '1', '0', '1', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for kh_daily_summary
-- ----------------------------
DROP TABLE IF EXISTS `kh_daily_summary`;
CREATE TABLE `kh_daily_summary` (
  `id` varchar(64) NOT NULL COMMENT 'ID',
  `today_data` varchar(2048) DEFAULT NULL COMMENT '今日数据',
  `today_problems` varchar(2048) DEFAULT NULL COMMENT '今日问题',
  `improved_method` varchar(2048) DEFAULT NULL COMMENT '改进方法',
  `tomorrow_plan` varchar(2048) DEFAULT NULL COMMENT '明日计划',
  `summary_type` varchar(12) DEFAULT NULL COMMENT '总结类型',
  `conclusion_time` datetime DEFAULT NULL COMMENT '总结时间',
  `creator_id` varchar(64) DEFAULT NULL COMMENT '创建人id',
  `creator` varchar(64) DEFAULT NULL COMMENT '创建人',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `alternate_field_1` varchar(512) DEFAULT NULL COMMENT '备用字段1',
  `alternate_field_2` varchar(512) DEFAULT NULL COMMENT '备用字段2',
  `alternate_field_3` varchar(512) DEFAULT NULL COMMENT '备用字段3',
  `alternate_field_4` varchar(512) DEFAULT NULL COMMENT '备用字段4',
  `alternate_field_5` varchar(512) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='总结表';

-- ----------------------------
-- Records of kh_daily_summary
-- ----------------------------
INSERT INTO `kh_daily_summary` VALUES ('a840666b3c3249c29dde00706a8dc909', '21121', 'qweqe1', 'qeq', 'qwe', '1', '2019-11-20 00:00:00', '1', '若依', '2019-11-20 20:47:42', null, null, null, null, null);

-- ----------------------------
-- Table structure for kh_deliver_goods
-- ----------------------------
DROP TABLE IF EXISTS `kh_deliver_goods`;
CREATE TABLE `kh_deliver_goods` (
  `id` varchar(64) NOT NULL,
  `customer_id` varchar(64) DEFAULT NULL,
  `follow_result_type` varchar(12) DEFAULT NULL COMMENT '跟进结果类型',
  `deal_amount` decimal(12,2) DEFAULT NULL COMMENT '成交金额（发样和沟通为空）',
  `send_sample_list` varchar(1024) DEFAULT NULL COMMENT '发样/成交清单',
  `gifts_list` varchar(1024) DEFAULT NULL COMMENT '赠品清单',
  `deal_time` datetime DEFAULT NULL COMMENT '成交日期',
  `trouble_spots` varchar(1024) DEFAULT NULL COMMENT '问题点',
  `intention_point` varchar(1024) DEFAULT NULL COMMENT '意向点',
  `follow_times` int(11) DEFAULT NULL COMMENT '跟进次数',
  `follow_result` varchar(1024) DEFAULT NULL COMMENT '跟进情况',
  `duration_hour` int(255) DEFAULT NULL COMMENT '通话时长-时',
  `duration_minute` int(255) DEFAULT NULL COMMENT '通话时长-分',
  `duration_second` int(255) DEFAULT NULL COMMENT '通话时长-秒',
  `next_follow_time` datetime DEFAULT NULL COMMENT '下次跟进时间',
  `next_follow_mentality` varchar(1024) DEFAULT NULL COMMENT '下次跟进思路',
  `creator_id` varchar(64) DEFAULT NULL COMMENT '创建人id（对接业务员）',
  `creator` varchar(255) DEFAULT NULL COMMENT '创建人（对接业务员）',
  `sender` varchar(255) DEFAULT NULL COMMENT '发件人',
  `sender_phone` varchar(255) DEFAULT NULL COMMENT '发件人电话',
  `sender_address` varchar(255) DEFAULT NULL COMMENT '发件人地址',
  `send_time` datetime DEFAULT NULL COMMENT '发货日期',
  `courier_number` varchar(64) DEFAULT NULL COMMENT '快递单号',
  `logistics_company` varchar(64) DEFAULT NULL COMMENT '物流公司',
  `collecting_amount` decimal(11,2) DEFAULT NULL COMMENT '代收金额',
  `insurance_amount` decimal(11,2) DEFAULT NULL COMMENT '保价金额',
  `postage` int(11) DEFAULT NULL COMMENT '邮费',
  `ORDER_NUMBER` varchar(128) DEFAULT NULL COMMENT '订单号',
  `is_delete` char(2) DEFAULT '0',
  `alternate_field_1` varchar(512) DEFAULT NULL COMMENT '备用字段1',
  `alternate_field_2` varchar(512) DEFAULT NULL COMMENT '备用字段2',
  `alternate_field_3` varchar(512) DEFAULT NULL COMMENT '备用字段3',
  `alternate_field_4` varchar(512) DEFAULT NULL COMMENT '备用字段4',
  `alternate_field_5` varchar(512) DEFAULT NULL COMMENT '备用字段5',
  `Intention_degree` varchar(12) DEFAULT NULL COMMENT '意向度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发样/成交情况表';

-- ----------------------------
-- Records of kh_deliver_goods
-- ----------------------------
INSERT INTO `kh_deliver_goods` VALUES ('123', '123', '1', '1.00', '1', '1', '2019-11-03 09:20:41', '1', '1', '1', '1', '1', '1', '1', '2019-11-03 09:20:53', '1', '1', '1', '1', '1', '1', '2019-11-06 00:00:00', '1', '1', '1.00', '1.00', '1', '123', '1', null, null, null, null, null, null);
INSERT INTO `kh_deliver_goods` VALUES ('20ce77ba5adb-4f3f-ab33-26339e27c7be', '5d18d321bfa5444e9b88d7d8fe08d2a8', '1', null, null, null, '2019-11-06 00:00:00', null, null, '1', '还可以', '11', '22', '123', '2019-11-07 00:00:00', null, '1', '若依', '11', '123131', '1231', '2019-11-05 00:00:00', '12312', '1123', '12312.00', '1231.00', '123123', 'GT_20191106170245', '0', null, null, null, null, null, null);
INSERT INTO `kh_deliver_goods` VALUES ('2cf37cc2da70-44b3-b0c6-2b3bf30681fb', '123', '2', null, null, null, '2019-11-07 00:00:00', null, null, '2', '1123', null, null, null, null, null, '1', '若依', null, null, null, null, null, null, null, null, null, 'FY_20191107205800', '0', null, null, null, null, null, null);
INSERT INTO `kh_deliver_goods` VALUES ('47a2d8a8bf42-465e-8332-5a1634098c26', '5d18d321bfa5444e9b88d7d8fe08d2a8', '3', null, null, null, '2019-11-13 17:45:00', null, null, '2', '1231', '0', '0', '0', '2019-10-30 21:10:07', null, '1', '若依', null, null, null, null, null, null, null, null, null, 'CJ_20191107210217', '0', null, null, null, null, null, null);
INSERT INTO `kh_deliver_goods` VALUES ('b8e413cdb07e-4ee9-be89-70685869e7fa', '123', '1', null, null, null, '2019-11-06 00:00:00', null, null, '1', '12312', '1', '2', '3', null, null, '1', '若依', null, null, null, null, null, null, null, null, null, 'GT_20191107205729', '0', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for kh_qa_library
-- ----------------------------
DROP TABLE IF EXISTS `kh_qa_library`;
CREATE TABLE `kh_qa_library` (
  `id` varchar(64) NOT NULL COMMENT 'id',
  `problem` varchar(2048) DEFAULT NULL COMMENT '问题',
  `answer` varchar(2048) DEFAULT NULL COMMENT '回答',
  `remark` varchar(2048) DEFAULT NULL COMMENT '备注',
  `creator_id` varchar(64) DEFAULT NULL COMMENT '创建人id',
  `creator` varchar(64) DEFAULT NULL COMMENT '创建人',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `alternate_field_1` varchar(512) DEFAULT NULL COMMENT '备用字段1',
  `alternate_field_2` varchar(512) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='问答库';

-- ----------------------------
-- Records of kh_qa_library
-- ----------------------------
INSERT INTO `kh_qa_library` VALUES ('461c6d32d7b24744a113b23b46562b22', '撒大声道', '大声地', null, '1', '若依', null, null, null);

-- ----------------------------
-- Table structure for kh_wechat_customer
-- ----------------------------
DROP TABLE IF EXISTS `kh_wechat_customer`;
CREATE TABLE `kh_wechat_customer` (
  `customer_id` varchar(64) NOT NULL,
  `phone_number` varchar(64) DEFAULT NULL COMMENT '电话号',
  `weixin_number` varchar(64) DEFAULT NULL COMMENT '微信号',
  `customer_name` varchar(64) DEFAULT NULL COMMENT '客户姓名',
  `gender` varchar(4) DEFAULT NULL COMMENT '性别',
  `kh_character` varchar(255) DEFAULT NULL COMMENT '性格',
  `creator_id` varchar(64) DEFAULT NULL COMMENT '创建人id（对接业务员）',
  `creator` varchar(255) DEFAULT NULL COMMENT '创建人（对接业务员）',
  `province_id` varchar(64) DEFAULT NULL COMMENT '客户地址-省id',
  `province` varchar(255) DEFAULT NULL COMMENT '客户地址-省',
  `city_id` varchar(64) DEFAULT NULL COMMENT '客户地址-市id',
  `city` varchar(255) DEFAULT NULL COMMENT '客户地址-市',
  `area_id` varchar(64) DEFAULT NULL COMMENT '客户地址-区id',
  `area` varchar(255) DEFAULT NULL COMMENT '客户地址-区',
  `customer_address` varchar(255) DEFAULT NULL COMMENT '客户地址详细',
  `shop_name` varchar(255) DEFAULT NULL COMMENT '店名',
  `appointment_time` datetime DEFAULT NULL COMMENT '预约沟通时间',
  `customer_type` varchar(64) DEFAULT NULL COMMENT '客户类型（0：日化店  1：母婴店  2：美容院）',
  `shop_assistant_number` int(11) DEFAULT NULL COMMENT '店员数',
  `store_scale` varchar(255) DEFAULT NULL COMMENT '店铺规模',
  `creation_time` datetime DEFAULT NULL COMMENT '创建时间',
  `demand_product` varchar(512) DEFAULT NULL COMMENT '需求产品',
  `remark` varchar(1024) DEFAULT NULL COMMENT '备注',
  `is_delivery` varchar(2) DEFAULT '0' COMMENT '是否发样（0：否 1：是） 默认0',
  `is_sales` varchar(2) DEFAULT '0' COMMENT '是否销售（0：否 1：是）默认0',
  `customer_num` int(2) DEFAULT NULL,
  `sale_name` varchar(64) DEFAULT NULL COMMENT '售后人',
  `sale_id` varchar(128) DEFAULT NULL COMMENT '售后人ID',
  `is_delete` char(2) DEFAULT '0',
  `alternate_field_1` varchar(512) DEFAULT NULL COMMENT '备用字段1',
  `alternate_field_2` varchar(512) DEFAULT NULL COMMENT '备用字段2',
  `alternate_field_3` varchar(512) DEFAULT NULL COMMENT '备用字段3',
  `alternate_field_4` varchar(512) DEFAULT NULL COMMENT '备用字段4',
  `alternate_field_5` varchar(512) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kh_wechat_customer
-- ----------------------------
INSERT INTO `kh_wechat_customer` VALUES ('123', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2019-11-02 19:23:42', '1', '1', '1', '2019-11-02 19:23:49', '1', '1', '1', '1', null, '若依', '1', '0', null, null, null, null, null);
INSERT INTO `kh_wechat_customer` VALUES ('5d18d321bfa5444e9b88d7d8fe08d2a8', '16056132', null, '测试1', null, null, '1', '若依', '130000', '河北省', '130100', '石家庄市', '130102', '长安区', null, null, null, null, null, null, '2019-11-06 17:02:45', null, null, '0', '0', null, '2222', '3', '0', null, null, null, null, null);

-- ----------------------------
-- Table structure for qrtz_blob_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_blob_triggers`;
CREATE TABLE `qrtz_blob_triggers` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `blob_data` blob,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `qrtz_blob_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_blob_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_calendars
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_calendars`;
CREATE TABLE `qrtz_calendars` (
  `sched_name` varchar(120) NOT NULL,
  `calendar_name` varchar(200) NOT NULL,
  `calendar` blob NOT NULL,
  PRIMARY KEY (`sched_name`,`calendar_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_calendars
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_cron_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_cron_triggers`;
CREATE TABLE `qrtz_cron_triggers` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `cron_expression` varchar(200) NOT NULL,
  `time_zone_id` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `qrtz_cron_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_cron_triggers
-- ----------------------------
INSERT INTO `qrtz_cron_triggers` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME1', 'DEFAULT', '0/10 * * * * ?', 'Asia/Shanghai');
INSERT INTO `qrtz_cron_triggers` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME2', 'DEFAULT', '0/15 * * * * ?', 'Asia/Shanghai');
INSERT INTO `qrtz_cron_triggers` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME3', 'DEFAULT', '0/20 * * * * ?', 'Asia/Shanghai');

-- ----------------------------
-- Table structure for qrtz_fired_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_fired_triggers`;
CREATE TABLE `qrtz_fired_triggers` (
  `sched_name` varchar(120) NOT NULL,
  `entry_id` varchar(95) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `instance_name` varchar(200) NOT NULL,
  `fired_time` bigint(13) NOT NULL,
  `sched_time` bigint(13) NOT NULL,
  `priority` int(11) NOT NULL,
  `state` varchar(16) NOT NULL,
  `job_name` varchar(200) DEFAULT NULL,
  `job_group` varchar(200) DEFAULT NULL,
  `is_nonconcurrent` varchar(1) DEFAULT NULL,
  `requests_recovery` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`sched_name`,`entry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_fired_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_job_details
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_job_details`;
CREATE TABLE `qrtz_job_details` (
  `sched_name` varchar(120) NOT NULL,
  `job_name` varchar(200) NOT NULL,
  `job_group` varchar(200) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `job_class_name` varchar(250) NOT NULL,
  `is_durable` varchar(1) NOT NULL,
  `is_nonconcurrent` varchar(1) NOT NULL,
  `is_update_data` varchar(1) NOT NULL,
  `requests_recovery` varchar(1) NOT NULL,
  `job_data` blob,
  PRIMARY KEY (`sched_name`,`job_name`,`job_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_job_details
-- ----------------------------
INSERT INTO `qrtz_job_details` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME1', 'DEFAULT', null, 'com.ruoyi.quartz.util.QuartzDisallowConcurrentExecution', '0', '1', '0', '0', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000F5441534B5F50524F504552544945537372001E636F6D2E72756F79692E71756172747A2E646F6D61696E2E5379734A6F6200000000000000010200084C000A636F6E63757272656E747400124C6A6176612F6C616E672F537472696E673B4C000E63726F6E45787072657373696F6E71007E00094C000C696E766F6B6554617267657471007E00094C00086A6F6247726F757071007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C00076A6F624E616D6571007E00094C000D6D697366697265506F6C69637971007E00094C000673746174757371007E000978720027636F6D2E72756F79692E636F6D6D6F6E2E636F72652E646F6D61696E2E42617365456E7469747900000000000000010200074C0008637265617465427971007E00094C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C0006706172616D7371007E00034C000672656D61726B71007E00094C000B73656172636856616C756571007E00094C0008757064617465427971007E00094C000A75706461746554696D6571007E000C787074000561646D696E7372000E6A6176612E7574696C2E44617465686A81014B59741903000078707708000001622CDE29E078707400007070707400013174000E302F3130202A202A202A202A203F74001172795461736B2E72794E6F506172616D7374000744454641554C547372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B02000078700000000000000001740018E7B3BBE7BB9FE9BB98E8AEA4EFBC88E697A0E58F82EFBC8974000133740001317800);
INSERT INTO `qrtz_job_details` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME2', 'DEFAULT', null, 'com.ruoyi.quartz.util.QuartzDisallowConcurrentExecution', '0', '1', '0', '0', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000F5441534B5F50524F504552544945537372001E636F6D2E72756F79692E71756172747A2E646F6D61696E2E5379734A6F6200000000000000010200084C000A636F6E63757272656E747400124C6A6176612F6C616E672F537472696E673B4C000E63726F6E45787072657373696F6E71007E00094C000C696E766F6B6554617267657471007E00094C00086A6F6247726F757071007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C00076A6F624E616D6571007E00094C000D6D697366697265506F6C69637971007E00094C000673746174757371007E000978720027636F6D2E72756F79692E636F6D6D6F6E2E636F72652E646F6D61696E2E42617365456E7469747900000000000000010200074C0008637265617465427971007E00094C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C0006706172616D7371007E00034C000672656D61726B71007E00094C000B73656172636856616C756571007E00094C0008757064617465427971007E00094C000A75706461746554696D6571007E000C787074000561646D696E7372000E6A6176612E7574696C2E44617465686A81014B59741903000078707708000001622CDE29E078707400007070707400013174000E302F3135202A202A202A202A203F74001572795461736B2E7279506172616D7328277279272974000744454641554C547372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B02000078700000000000000002740018E7B3BBE7BB9FE9BB98E8AEA4EFBC88E69C89E58F82EFBC8974000133740001317800);
INSERT INTO `qrtz_job_details` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME3', 'DEFAULT', null, 'com.ruoyi.quartz.util.QuartzDisallowConcurrentExecution', '0', '1', '0', '0', 0xACED0005737200156F72672E71756172747A2E4A6F62446174614D61709FB083E8BFA9B0CB020000787200266F72672E71756172747A2E7574696C732E537472696E674B65794469727479466C61674D61708208E8C3FBC55D280200015A0013616C6C6F77735472616E7369656E74446174617872001D6F72672E71756172747A2E7574696C732E4469727479466C61674D617013E62EAD28760ACE0200025A000564697274794C00036D617074000F4C6A6176612F7574696C2F4D61703B787001737200116A6176612E7574696C2E486173684D61700507DAC1C31660D103000246000A6C6F6164466163746F724900097468726573686F6C6478703F4000000000000C7708000000100000000174000F5441534B5F50524F504552544945537372001E636F6D2E72756F79692E71756172747A2E646F6D61696E2E5379734A6F6200000000000000010200084C000A636F6E63757272656E747400124C6A6176612F6C616E672F537472696E673B4C000E63726F6E45787072657373696F6E71007E00094C000C696E766F6B6554617267657471007E00094C00086A6F6247726F757071007E00094C00056A6F6249647400104C6A6176612F6C616E672F4C6F6E673B4C00076A6F624E616D6571007E00094C000D6D697366697265506F6C69637971007E00094C000673746174757371007E000978720027636F6D2E72756F79692E636F6D6D6F6E2E636F72652E646F6D61696E2E42617365456E7469747900000000000000010200074C0008637265617465427971007E00094C000A63726561746554696D657400104C6A6176612F7574696C2F446174653B4C0006706172616D7371007E00034C000672656D61726B71007E00094C000B73656172636856616C756571007E00094C0008757064617465427971007E00094C000A75706461746554696D6571007E000C787074000561646D696E7372000E6A6176612E7574696C2E44617465686A81014B59741903000078707708000001622CDE29E078707400007070707400013174000E302F3230202A202A202A202A203F74003872795461736B2E72794D756C7469706C65506172616D7328277279272C20747275652C20323030304C2C203331362E3530442C203130302974000744454641554C547372000E6A6176612E6C616E672E4C6F6E673B8BE490CC8F23DF0200014A000576616C7565787200106A6176612E6C616E672E4E756D62657286AC951D0B94E08B02000078700000000000000003740018E7B3BBE7BB9FE9BB98E8AEA4EFBC88E5A49AE58F82EFBC8974000133740001317800);

-- ----------------------------
-- Table structure for qrtz_locks
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_locks`;
CREATE TABLE `qrtz_locks` (
  `sched_name` varchar(120) NOT NULL,
  `lock_name` varchar(40) NOT NULL,
  PRIMARY KEY (`sched_name`,`lock_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_locks
-- ----------------------------
INSERT INTO `qrtz_locks` VALUES ('RuoyiScheduler', 'STATE_ACCESS');
INSERT INTO `qrtz_locks` VALUES ('RuoyiScheduler', 'TRIGGER_ACCESS');

-- ----------------------------
-- Table structure for qrtz_paused_trigger_grps
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_paused_trigger_grps`;
CREATE TABLE `qrtz_paused_trigger_grps` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  PRIMARY KEY (`sched_name`,`trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_paused_trigger_grps
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_scheduler_state
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_scheduler_state`;
CREATE TABLE `qrtz_scheduler_state` (
  `sched_name` varchar(120) NOT NULL,
  `instance_name` varchar(200) NOT NULL,
  `last_checkin_time` bigint(13) NOT NULL,
  `checkin_interval` bigint(13) NOT NULL,
  PRIMARY KEY (`sched_name`,`instance_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_scheduler_state
-- ----------------------------
INSERT INTO `qrtz_scheduler_state` VALUES ('RuoyiScheduler', 'SC-2018020209501574305208156', '1574317819669', '15000');

-- ----------------------------
-- Table structure for qrtz_simple_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simple_triggers`;
CREATE TABLE `qrtz_simple_triggers` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `repeat_count` bigint(7) NOT NULL,
  `repeat_interval` bigint(12) NOT NULL,
  `times_triggered` bigint(10) NOT NULL,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `qrtz_simple_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_simple_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_simprop_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simprop_triggers`;
CREATE TABLE `qrtz_simprop_triggers` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `str_prop_1` varchar(512) DEFAULT NULL,
  `str_prop_2` varchar(512) DEFAULT NULL,
  `str_prop_3` varchar(512) DEFAULT NULL,
  `int_prop_1` int(11) DEFAULT NULL,
  `int_prop_2` int(11) DEFAULT NULL,
  `long_prop_1` bigint(20) DEFAULT NULL,
  `long_prop_2` bigint(20) DEFAULT NULL,
  `dec_prop_1` decimal(13,4) DEFAULT NULL,
  `dec_prop_2` decimal(13,4) DEFAULT NULL,
  `bool_prop_1` varchar(1) DEFAULT NULL,
  `bool_prop_2` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  CONSTRAINT `qrtz_simprop_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `trigger_name`, `trigger_group`) REFERENCES `qrtz_triggers` (`sched_name`, `trigger_name`, `trigger_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_simprop_triggers
-- ----------------------------

-- ----------------------------
-- Table structure for qrtz_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_triggers`;
CREATE TABLE `qrtz_triggers` (
  `sched_name` varchar(120) NOT NULL,
  `trigger_name` varchar(200) NOT NULL,
  `trigger_group` varchar(200) NOT NULL,
  `job_name` varchar(200) NOT NULL,
  `job_group` varchar(200) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `next_fire_time` bigint(13) DEFAULT NULL,
  `prev_fire_time` bigint(13) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `trigger_state` varchar(16) NOT NULL,
  `trigger_type` varchar(8) NOT NULL,
  `start_time` bigint(13) NOT NULL,
  `end_time` bigint(13) DEFAULT NULL,
  `calendar_name` varchar(200) DEFAULT NULL,
  `misfire_instr` smallint(2) DEFAULT NULL,
  `job_data` blob,
  PRIMARY KEY (`sched_name`,`trigger_name`,`trigger_group`),
  KEY `sched_name` (`sched_name`,`job_name`,`job_group`),
  CONSTRAINT `qrtz_triggers_ibfk_1` FOREIGN KEY (`sched_name`, `job_name`, `job_group`) REFERENCES `qrtz_job_details` (`sched_name`, `job_name`, `job_group`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qrtz_triggers
-- ----------------------------
INSERT INTO `qrtz_triggers` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME1', 'DEFAULT', 'TASK_CLASS_NAME1', 'DEFAULT', null, '1574305210000', '-1', '5', 'PAUSED', 'CRON', '1574305209000', '0', null, '2', '');
INSERT INTO `qrtz_triggers` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME2', 'DEFAULT', 'TASK_CLASS_NAME2', 'DEFAULT', null, '1574305215000', '-1', '5', 'PAUSED', 'CRON', '1574305209000', '0', null, '2', '');
INSERT INTO `qrtz_triggers` VALUES ('RuoyiScheduler', 'TASK_CLASS_NAME3', 'DEFAULT', 'TASK_CLASS_NAME3', 'DEFAULT', null, '1574305220000', '-1', '5', 'PAUSED', 'CRON', '1574305210000', '0', null, '2', '');

-- ----------------------------
-- Table structure for sys_config
-- ----------------------------
DROP TABLE IF EXISTS `sys_config`;
CREATE TABLE `sys_config` (
  `config_id` int(5) NOT NULL AUTO_INCREMENT COMMENT '参数主键',
  `config_name` varchar(100) DEFAULT '' COMMENT '参数名称',
  `config_key` varchar(100) DEFAULT '' COMMENT '参数键名',
  `config_value` varchar(500) DEFAULT '' COMMENT '参数键值',
  `config_type` char(1) DEFAULT 'N' COMMENT '系统内置（Y是 N否）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`config_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='参数配置表';

-- ----------------------------
-- Records of sys_config
-- ----------------------------
INSERT INTO `sys_config` VALUES ('1', '主框架页-默认皮肤样式名称', 'sys.index.skinName', 'skin-blue', 'Y', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '蓝色 skin-blue、绿色 skin-green、紫色 skin-purple、红色 skin-red、黄色 skin-yellow');
INSERT INTO `sys_config` VALUES ('2', '用户管理-账号初始密码', 'sys.user.initPassword', '123456', 'Y', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '初始化密码 123456');

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `dept_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `parent_id` bigint(20) DEFAULT '0' COMMENT '父部门id',
  `ancestors` varchar(50) DEFAULT '' COMMENT '祖级列表',
  `dept_name` varchar(30) DEFAULT '' COMMENT '部门名称',
  `order_num` int(4) DEFAULT '0' COMMENT '显示顺序',
  `leader` varchar(20) DEFAULT NULL COMMENT '负责人',
  `phone` varchar(11) DEFAULT NULL COMMENT '联系电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `status` char(1) DEFAULT '0' COMMENT '部门状态（0正常 1停用）',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of sys_dept
-- ----------------------------
INSERT INTO `sys_dept` VALUES ('100', '0', '0', '美肌卫士', '0', '若依', '15888888888', 'ry@qq.com', '0', '0', 'admin', '2018-03-16 11:33:00', 'admin', '2019-10-22 16:07:13');
INSERT INTO `sys_dept` VALUES ('102', '100', '0,100', '售后组', '2', '', '', '', '0', '0', 'admin', '2018-03-16 11:33:00', 'admin', '2019-10-22 16:07:13');
INSERT INTO `sys_dept` VALUES ('110', '100', '0,100', '发样成交组', '1', null, null, null, '0', '0', 'admin', '2019-10-22 16:05:54', '', null);
INSERT INTO `sys_dept` VALUES ('111', '100', '0,100', '库房组', '3', null, null, null, '0', '0', 'admin', '2019-10-22 16:07:01', '', null);

-- ----------------------------
-- Table structure for sys_dict_data
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_data`;
CREATE TABLE `sys_dict_data` (
  `dict_code` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '字典编码',
  `dict_sort` int(4) DEFAULT '0' COMMENT '字典排序',
  `dict_label` varchar(100) DEFAULT '' COMMENT '字典标签',
  `dict_value` varchar(100) DEFAULT '' COMMENT '字典键值',
  `dict_type` varchar(100) DEFAULT '' COMMENT '字典类型',
  `css_class` varchar(100) DEFAULT NULL COMMENT '样式属性（其他样式扩展）',
  `list_class` varchar(100) DEFAULT NULL COMMENT '表格回显样式',
  `is_default` char(1) DEFAULT 'N' COMMENT '是否默认（Y是 N否）',
  `status` char(1) DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dict_code`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COMMENT='字典数据表';

-- ----------------------------
-- Records of sys_dict_data
-- ----------------------------
INSERT INTO `sys_dict_data` VALUES ('1', '1', '男', '0', 'sys_user_sex', '', '', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '性别男');
INSERT INTO `sys_dict_data` VALUES ('2', '2', '女', '1', 'sys_user_sex', '', '', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '性别女');
INSERT INTO `sys_dict_data` VALUES ('3', '3', '未知', '2', 'sys_user_sex', '', '', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '性别未知');
INSERT INTO `sys_dict_data` VALUES ('4', '1', '显示', '0', 'sys_show_hide', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '显示菜单');
INSERT INTO `sys_dict_data` VALUES ('5', '2', '隐藏', '1', 'sys_show_hide', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '隐藏菜单');
INSERT INTO `sys_dict_data` VALUES ('6', '1', '正常', '0', 'sys_normal_disable', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES ('7', '2', '停用', '1', 'sys_normal_disable', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '停用状态');
INSERT INTO `sys_dict_data` VALUES ('8', '1', '正常', '0', 'sys_job_status', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES ('9', '2', '暂停', '1', 'sys_job_status', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '停用状态');
INSERT INTO `sys_dict_data` VALUES ('10', '1', '默认', 'DEFAULT', 'sys_job_group', '', '', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '默认分组');
INSERT INTO `sys_dict_data` VALUES ('11', '2', '系统', 'SYSTEM', 'sys_job_group', '', '', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统分组');
INSERT INTO `sys_dict_data` VALUES ('12', '1', '是', 'Y', 'sys_yes_no', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统默认是');
INSERT INTO `sys_dict_data` VALUES ('13', '2', '否', 'N', 'sys_yes_no', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统默认否');
INSERT INTO `sys_dict_data` VALUES ('14', '1', '通知', '1', 'sys_notice_type', '', 'warning', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '通知');
INSERT INTO `sys_dict_data` VALUES ('15', '2', '公告', '2', 'sys_notice_type', '', 'success', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '公告');
INSERT INTO `sys_dict_data` VALUES ('16', '1', '正常', '0', 'sys_notice_status', '', 'primary', 'Y', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES ('17', '2', '关闭', '1', 'sys_notice_status', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '关闭状态');
INSERT INTO `sys_dict_data` VALUES ('18', '1', '新增', '1', 'sys_oper_type', '', 'info', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '新增操作');
INSERT INTO `sys_dict_data` VALUES ('19', '2', '修改', '2', 'sys_oper_type', '', 'info', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '修改操作');
INSERT INTO `sys_dict_data` VALUES ('20', '3', '删除', '3', 'sys_oper_type', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '删除操作');
INSERT INTO `sys_dict_data` VALUES ('21', '4', '授权', '4', 'sys_oper_type', '', 'primary', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '授权操作');
INSERT INTO `sys_dict_data` VALUES ('22', '5', '导出', '5', 'sys_oper_type', '', 'warning', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '导出操作');
INSERT INTO `sys_dict_data` VALUES ('23', '6', '导入', '6', 'sys_oper_type', '', 'warning', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '导入操作');
INSERT INTO `sys_dict_data` VALUES ('24', '7', '强退', '7', 'sys_oper_type', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '强退操作');
INSERT INTO `sys_dict_data` VALUES ('25', '8', '生成代码', '8', 'sys_oper_type', '', 'warning', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '生成操作');
INSERT INTO `sys_dict_data` VALUES ('26', '9', '清空数据', '9', 'sys_oper_type', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '清空操作');
INSERT INTO `sys_dict_data` VALUES ('27', '1', '成功', '0', 'sys_common_status', '', 'primary', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '正常状态');
INSERT INTO `sys_dict_data` VALUES ('28', '2', '失败', '1', 'sys_common_status', '', 'danger', 'N', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '停用状态');
INSERT INTO `sys_dict_data` VALUES ('29', '1', '否', '0', 'is_delivery', '', '', 'Y', '0', 'admin', '2019-10-22 17:21:09', 'admin', '2019-10-22 17:24:24', '');
INSERT INTO `sys_dict_data` VALUES ('30', '2', '是', '1', 'is_delivery', '', '', 'Y', '0', 'admin', '2019-10-22 17:21:20', 'admin', '2019-10-22 17:24:36', '');
INSERT INTO `sys_dict_data` VALUES ('31', '1', '日化店', '0', 'customer_type', '', '', 'Y', '0', 'admin', '2019-10-22 17:23:21', 'admin', '2019-10-22 17:24:12', '');
INSERT INTO `sys_dict_data` VALUES ('32', '2', '母婴店', '1', 'customer_type', '', '', 'Y', '0', 'admin', '2019-10-22 17:23:38', 'admin', '2019-10-22 17:24:47', '');
INSERT INTO `sys_dict_data` VALUES ('33', '3', '美容院', '2', 'customer_type', null, null, 'Y', '0', 'admin', '2019-10-22 17:25:01', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('34', '1', '沟通', '1', 'follow_result_type', null, null, 'Y', '0', 'admin', '2019-10-23 20:23:34', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('35', '2', '发样', '2', 'follow_result_type', null, null, 'Y', '0', 'admin', '2019-10-23 20:23:45', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('36', '3', '成交', '3', 'follow_result_type', null, null, 'Y', '0', 'admin', '2019-10-23 20:23:55', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('37', '1', '高', '1', 'Intention_degree', null, null, 'Y', '0', 'admin', '2019-11-06 20:23:01', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('38', '2', '中', '2', 'Intention_degree', null, null, 'Y', '0', 'admin', '2019-11-06 20:23:10', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('39', '3', '低', '3', 'Intention_degree', null, null, 'Y', '0', 'admin', '2019-11-06 20:23:17', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('40', '1', '每日总结', '1', 'summary_type', null, null, 'Y', '0', 'admin', '2019-11-19 11:50:48', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('41', '2', '每周总结', '2', 'summary_type', null, null, 'Y', '0', 'admin', '2019-11-19 11:51:07', '', null, null);
INSERT INTO `sys_dict_data` VALUES ('42', '3', '每月总结', '3', 'summary_type', null, null, 'Y', '0', 'admin', '2019-11-19 11:51:19', '', null, null);

-- ----------------------------
-- Table structure for sys_dict_type
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_type`;
CREATE TABLE `sys_dict_type` (
  `dict_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '字典主键',
  `dict_name` varchar(100) DEFAULT '' COMMENT '字典名称',
  `dict_type` varchar(100) DEFAULT '' COMMENT '字典类型',
  `status` char(1) DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dict_id`),
  UNIQUE KEY `dict_type` (`dict_type`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='字典类型表';

-- ----------------------------
-- Records of sys_dict_type
-- ----------------------------
INSERT INTO `sys_dict_type` VALUES ('1', '用户性别', 'sys_user_sex', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '用户性别列表');
INSERT INTO `sys_dict_type` VALUES ('2', '菜单状态', 'sys_show_hide', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '菜单状态列表');
INSERT INTO `sys_dict_type` VALUES ('3', '系统开关', 'sys_normal_disable', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统开关列表');
INSERT INTO `sys_dict_type` VALUES ('4', '任务状态', 'sys_job_status', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '任务状态列表');
INSERT INTO `sys_dict_type` VALUES ('5', '任务分组', 'sys_job_group', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '任务分组列表');
INSERT INTO `sys_dict_type` VALUES ('6', '系统是否', 'sys_yes_no', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统是否列表');
INSERT INTO `sys_dict_type` VALUES ('7', '通知类型', 'sys_notice_type', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '通知类型列表');
INSERT INTO `sys_dict_type` VALUES ('8', '通知状态', 'sys_notice_status', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '通知状态列表');
INSERT INTO `sys_dict_type` VALUES ('9', '操作类型', 'sys_oper_type', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '操作类型列表');
INSERT INTO `sys_dict_type` VALUES ('10', '系统状态', 'sys_common_status', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '登录状态列表');
INSERT INTO `sys_dict_type` VALUES ('11', '是否发样/成交', 'is_delivery', '0', 'admin', '2019-10-22 17:20:21', '', null, null);
INSERT INTO `sys_dict_type` VALUES ('12', '客户类型', 'customer_type', '0', 'admin', '2019-10-22 17:23:06', '', null, '（0：日化店  1：母婴店  2：美容院）');
INSERT INTO `sys_dict_type` VALUES ('13', '跟进结果类型', 'follow_result_type', '0', 'admin', '2019-10-23 20:22:55', '', null, null);
INSERT INTO `sys_dict_type` VALUES ('14', '意向度', 'Intention_degree', '0', 'admin', '2019-11-06 20:22:44', '', null, null);
INSERT INTO `sys_dict_type` VALUES ('15', '总结类型', 'summary_type', '0', 'admin', '2019-11-19 11:35:55', '', null, null);

-- ----------------------------
-- Table structure for sys_job
-- ----------------------------
DROP TABLE IF EXISTS `sys_job`;
CREATE TABLE `sys_job` (
  `job_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务ID',
  `job_name` varchar(64) NOT NULL DEFAULT '' COMMENT '任务名称',
  `job_group` varchar(64) NOT NULL DEFAULT 'DEFAULT' COMMENT '任务组名',
  `invoke_target` varchar(500) NOT NULL COMMENT '调用目标字符串',
  `cron_expression` varchar(255) DEFAULT '' COMMENT 'cron执行表达式',
  `misfire_policy` varchar(20) DEFAULT '3' COMMENT '计划执行错误策略（1立即执行 2执行一次 3放弃执行）',
  `concurrent` char(1) DEFAULT '1' COMMENT '是否并发执行（0允许 1禁止）',
  `status` char(1) DEFAULT '0' COMMENT '状态（0正常 1暂停）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT '' COMMENT '备注信息',
  PRIMARY KEY (`job_id`,`job_name`,`job_group`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='定时任务调度表';

-- ----------------------------
-- Records of sys_job
-- ----------------------------
INSERT INTO `sys_job` VALUES ('1', '系统默认（无参）', 'DEFAULT', 'ryTask.ryNoParams', '0/10 * * * * ?', '3', '1', '1', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_job` VALUES ('2', '系统默认（有参）', 'DEFAULT', 'ryTask.ryParams(\'ry\')', '0/15 * * * * ?', '3', '1', '1', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_job` VALUES ('3', '系统默认（多参）', 'DEFAULT', 'ryTask.ryMultipleParams(\'ry\', true, 2000L, 316.50D, 100)', '0/20 * * * * ?', '3', '1', '1', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');

-- ----------------------------
-- Table structure for sys_job_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_job_log`;
CREATE TABLE `sys_job_log` (
  `job_log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '任务日志ID',
  `job_name` varchar(64) NOT NULL COMMENT '任务名称',
  `job_group` varchar(64) NOT NULL COMMENT '任务组名',
  `invoke_target` varchar(500) NOT NULL COMMENT '调用目标字符串',
  `job_message` varchar(500) DEFAULT NULL COMMENT '日志信息',
  `status` char(1) DEFAULT '0' COMMENT '执行状态（0正常 1失败）',
  `exception_info` varchar(2000) DEFAULT '' COMMENT '异常信息',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`job_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='定时任务调度日志表';

-- ----------------------------
-- Records of sys_job_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_logininfor
-- ----------------------------
DROP TABLE IF EXISTS `sys_logininfor`;
CREATE TABLE `sys_logininfor` (
  `info_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '访问ID',
  `login_name` varchar(50) DEFAULT '' COMMENT '登录账号',
  `ipaddr` varchar(50) DEFAULT '' COMMENT '登录IP地址',
  `login_location` varchar(255) DEFAULT '' COMMENT '登录地点',
  `browser` varchar(50) DEFAULT '' COMMENT '浏览器类型',
  `os` varchar(50) DEFAULT '' COMMENT '操作系统',
  `status` char(1) DEFAULT '0' COMMENT '登录状态（0成功 1失败）',
  `msg` varchar(255) DEFAULT '' COMMENT '提示消息',
  `login_time` datetime DEFAULT NULL COMMENT '访问时间',
  PRIMARY KEY (`info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8 COMMENT='系统访问记录';

-- ----------------------------
-- Records of sys_logininfor
-- ----------------------------
INSERT INTO `sys_logininfor` VALUES ('1', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-23 22:39:07');
INSERT INTO `sys_logininfor` VALUES ('2', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-24 21:37:39');
INSERT INTO `sys_logininfor` VALUES ('3', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-24 21:37:42');
INSERT INTO `sys_logininfor` VALUES ('4', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-24 21:52:59');
INSERT INTO `sys_logininfor` VALUES ('5', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-24 21:53:02');
INSERT INTO `sys_logininfor` VALUES ('6', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-24 22:09:20');
INSERT INTO `sys_logininfor` VALUES ('7', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-27 08:36:36');
INSERT INTO `sys_logininfor` VALUES ('8', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-27 09:26:16');
INSERT INTO `sys_logininfor` VALUES ('9', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-27 11:07:39');
INSERT INTO `sys_logininfor` VALUES ('10', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-27 18:39:58');
INSERT INTO `sys_logininfor` VALUES ('11', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:44');
INSERT INTO `sys_logininfor` VALUES ('12', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:45');
INSERT INTO `sys_logininfor` VALUES ('13', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:45');
INSERT INTO `sys_logininfor` VALUES ('14', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:46');
INSERT INTO `sys_logininfor` VALUES ('15', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:47');
INSERT INTO `sys_logininfor` VALUES ('16', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:47');
INSERT INTO `sys_logininfor` VALUES ('17', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:48');
INSERT INTO `sys_logininfor` VALUES ('18', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:48');
INSERT INTO `sys_logininfor` VALUES ('19', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:50');
INSERT INTO `sys_logininfor` VALUES ('20', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-27 22:14:51');
INSERT INTO `sys_logininfor` VALUES ('21', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-30 09:09:58');
INSERT INTO `sys_logininfor` VALUES ('22', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-10-30 09:40:37');
INSERT INTO `sys_logininfor` VALUES ('23', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-10-31 09:33:23');
INSERT INTO `sys_logininfor` VALUES ('24', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-01 09:14:29');
INSERT INTO `sys_logininfor` VALUES ('25', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '退出成功', '2019-11-01 17:21:33');
INSERT INTO `sys_logininfor` VALUES ('26', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-01 17:21:45');
INSERT INTO `sys_logininfor` VALUES ('27', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-01 17:21:47');
INSERT INTO `sys_logininfor` VALUES ('28', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-01 17:21:53');
INSERT INTO `sys_logininfor` VALUES ('29', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-01 17:21:55');
INSERT INTO `sys_logininfor` VALUES ('30', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-01 17:22:03');
INSERT INTO `sys_logininfor` VALUES ('31', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-01 17:22:10');
INSERT INTO `sys_logininfor` VALUES ('32', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-01 21:02:25');
INSERT INTO `sys_logininfor` VALUES ('33', 'admin', '127.0.0.1', '内网IP', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-01 21:02:30');
INSERT INTO `sys_logininfor` VALUES ('34', 'admin', '119.129.86.139', '广东 广州', 'Internet Explorer 11', 'Windows 10', '0', '登录成功', '2019-11-05 22:31:04');
INSERT INTO `sys_logininfor` VALUES ('35', 'admin', '223.104.64.245', '广东 广州', 'Chrome Mobile', 'Android Mobile', '1', '验证码错误', '2019-11-05 22:31:51');
INSERT INTO `sys_logininfor` VALUES ('36', 'admin', '223.104.64.245', '广东 广州', 'Chrome Mobile', 'Android Mobile', '0', '登录成功', '2019-11-05 22:31:59');
INSERT INTO `sys_logininfor` VALUES ('37', 'admin', '113.65.155.170', '广东 广州', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-06 09:42:48');
INSERT INTO `sys_logininfor` VALUES ('38', 'admin', '113.65.155.170', '广东 广州', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-06 09:42:51');
INSERT INTO `sys_logininfor` VALUES ('39', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-06 17:09:57');
INSERT INTO `sys_logininfor` VALUES ('40', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-06 17:25:33');
INSERT INTO `sys_logininfor` VALUES ('41', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-06 19:01:56');
INSERT INTO `sys_logininfor` VALUES ('42', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-07 19:44:44');
INSERT INTO `sys_logininfor` VALUES ('43', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-07 20:50:01');
INSERT INTO `sys_logininfor` VALUES ('44', 'admin', '59.41.74.127', '广东 广州', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-07 21:10:25');
INSERT INTO `sys_logininfor` VALUES ('45', 'admin', '112.96.170.36', '广东 佛山', 'Apple WebKit', 'Mac OS X (iPhone)', '0', '登录成功', '2019-11-07 21:46:32');
INSERT INTO `sys_logininfor` VALUES ('46', 'admin', '112.96.37.96', '广东 珠海', 'Apple WebKit', 'Mac OS X (iPhone)', '1', '验证码错误', '2019-11-08 15:47:24');
INSERT INTO `sys_logininfor` VALUES ('47', 'admin', '112.96.37.96', '广东 珠海', 'Apple WebKit', 'Mac OS X (iPhone)', '0', '登录成功', '2019-11-08 15:47:28');
INSERT INTO `sys_logininfor` VALUES ('48', 'admin', '113.111.212.167', '广东 广州', 'Chrome', 'Windows 7', '0', '登录成功', '2019-11-09 08:54:26');
INSERT INTO `sys_logininfor` VALUES ('49', 'admin', '183.5.96.104', '广东 广州', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-09 11:52:41');
INSERT INTO `sys_logininfor` VALUES ('50', 'admin', '113.98.117.138', '广东 广州', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-09 14:32:51');
INSERT INTO `sys_logininfor` VALUES ('51', 'admin', '113.98.117.138', '广东 广州', 'Chrome', 'Windows 10', '0', '退出成功', '2019-11-09 14:43:14');
INSERT INTO `sys_logininfor` VALUES ('52', 'admin', '113.98.117.138', '广东 广州', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-09 14:43:21');
INSERT INTO `sys_logininfor` VALUES ('53', 'admin', '113.111.212.167', '广东 广州', 'Chrome', 'Windows 7', '0', '登录成功', '2019-11-09 17:53:26');
INSERT INTO `sys_logininfor` VALUES ('54', 'admin', '223.104.1.98', '广东 汕头', 'Chrome Mobile', 'Android Mobile', '0', '登录成功', '2019-11-10 13:13:15');
INSERT INTO `sys_logininfor` VALUES ('55', 'admin', '58.62.115.135', '广东 广州', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-10 19:27:25');
INSERT INTO `sys_logininfor` VALUES ('56', 'admin', '119.129.115.172', '广东 广州', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-10 19:47:35');
INSERT INTO `sys_logininfor` VALUES ('57', 'admin', '119.129.115.172', '广东 广州', 'Chrome', 'Windows 10', '1', '验证码错误', '2019-11-10 19:47:51');
INSERT INTO `sys_logininfor` VALUES ('58', 'admin', '119.129.115.172', '广东 广州', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-10 20:01:00');
INSERT INTO `sys_logininfor` VALUES ('59', 'admin', '119.129.115.172', '广东 广州', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-10 20:28:57');
INSERT INTO `sys_logininfor` VALUES ('60', 'admin', '61.140.70.194', 'XX XX', 'Chrome', 'Windows 10', '0', '登录成功', '2019-11-11 09:09:31');
INSERT INTO `sys_logininfor` VALUES ('61', 'admin', '61.140.70.194', '广东 广州', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-11 09:43:49');
INSERT INTO `sys_logininfor` VALUES ('62', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-18 20:04:55');
INSERT INTO `sys_logininfor` VALUES ('63', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-19 11:32:31');
INSERT INTO `sys_logininfor` VALUES ('64', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-19 11:34:22');
INSERT INTO `sys_logininfor` VALUES ('65', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-19 16:32:46');
INSERT INTO `sys_logininfor` VALUES ('66', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-19 16:41:52');
INSERT INTO `sys_logininfor` VALUES ('67', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-19 19:30:56');
INSERT INTO `sys_logininfor` VALUES ('68', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-20 15:58:26');
INSERT INTO `sys_logininfor` VALUES ('69', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-20 16:52:07');
INSERT INTO `sys_logininfor` VALUES ('70', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-20 17:36:37');
INSERT INTO `sys_logininfor` VALUES ('71', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-20 20:19:27');
INSERT INTO `sys_logininfor` VALUES ('72', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-20 20:44:16');
INSERT INTO `sys_logininfor` VALUES ('73', 'admin', '127.0.0.1', '内网IP', 'Firefox 7', 'Windows 10', '0', '登录成功', '2019-11-21 11:03:44');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) NOT NULL COMMENT '菜单名称',
  `parent_id` bigint(20) DEFAULT '0' COMMENT '父菜单ID',
  `order_num` int(4) DEFAULT '0' COMMENT '显示顺序',
  `url` varchar(200) DEFAULT '#' COMMENT '请求地址',
  `target` varchar(20) DEFAULT '' COMMENT '打开方式（menuItem页签 menuBlank新窗口）',
  `menu_type` char(1) DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
  `visible` char(1) DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
  `perms` varchar(100) DEFAULT NULL COMMENT '权限标识',
  `icon` varchar(100) DEFAULT '#' COMMENT '菜单图标',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1127 DEFAULT CHARSET=utf8 COMMENT='菜单权限表';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '系统管理', '0', '1', '#', '', 'M', '0', '', 'fa fa-gear', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统管理目录');
INSERT INTO `sys_menu` VALUES ('2', '系统监控', '0', '2', '#', '', 'M', '0', '', 'fa fa-video-camera', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统监控目录');
INSERT INTO `sys_menu` VALUES ('3', '系统工具', '0', '3', '#', 'menuItem', 'M', '0', '', 'fa fa-bars', 'admin', '2018-03-16 11:33:00', 'admin', '2019-11-19 11:35:01', '系统工具目录');
INSERT INTO `sys_menu` VALUES ('100', '用户管理', '1', '1', '/system/user', '', 'C', '0', 'system:user:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '用户管理菜单');
INSERT INTO `sys_menu` VALUES ('101', '角色管理', '1', '2', '/system/role', '', 'C', '0', 'system:role:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '角色管理菜单');
INSERT INTO `sys_menu` VALUES ('102', '菜单管理', '1', '3', '/system/menu', '', 'C', '0', 'system:menu:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '菜单管理菜单');
INSERT INTO `sys_menu` VALUES ('103', '部门管理', '1', '4', '/system/dept', '', 'C', '0', 'system:dept:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '部门管理菜单');
INSERT INTO `sys_menu` VALUES ('104', '岗位管理', '1', '5', '/system/post', '', 'C', '0', 'system:post:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '岗位管理菜单');
INSERT INTO `sys_menu` VALUES ('105', '字典管理', '1', '6', '/system/dict', '', 'C', '0', 'system:dict:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '字典管理菜单');
INSERT INTO `sys_menu` VALUES ('106', '参数设置', '1', '7', '/system/config', '', 'C', '0', 'system:config:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '参数设置菜单');
INSERT INTO `sys_menu` VALUES ('107', '通知公告', '1', '8', '/system/notice', '', 'C', '0', 'system:notice:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '通知公告菜单');
INSERT INTO `sys_menu` VALUES ('108', '日志管理', '1', '9', '#', '', 'M', '0', '', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '日志管理菜单');
INSERT INTO `sys_menu` VALUES ('109', '在线用户', '2', '1', '/monitor/online', '', 'C', '0', 'monitor:online:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '在线用户菜单');
INSERT INTO `sys_menu` VALUES ('110', '定时任务', '2', '2', '/monitor/job', '', 'C', '0', 'monitor:job:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '定时任务菜单');
INSERT INTO `sys_menu` VALUES ('111', '数据监控', '2', '3', '/monitor/data', '', 'C', '0', 'monitor:data:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '数据监控菜单');
INSERT INTO `sys_menu` VALUES ('112', '服务监控', '2', '3', '/monitor/server', '', 'C', '0', 'monitor:server:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '服务监控菜单');
INSERT INTO `sys_menu` VALUES ('113', '表单构建', '3', '1', '/tool/build', '', 'C', '0', 'tool:build:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '表单构建菜单');
INSERT INTO `sys_menu` VALUES ('114', '代码生成', '3', '2', '/tool/gen', '', 'C', '0', 'tool:gen:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '代码生成菜单');
INSERT INTO `sys_menu` VALUES ('115', '系统接口', '3', '3', '/tool/swagger', '', 'C', '0', 'tool:swagger:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统接口菜单');
INSERT INTO `sys_menu` VALUES ('500', '操作日志', '108', '1', '/monitor/operlog', '', 'C', '0', 'monitor:operlog:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '操作日志菜单');
INSERT INTO `sys_menu` VALUES ('501', '登录日志', '108', '2', '/monitor/logininfor', '', 'C', '0', 'monitor:logininfor:view', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '登录日志菜单');
INSERT INTO `sys_menu` VALUES ('1000', '用户查询', '100', '1', '#', '', 'F', '0', 'system:user:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1001', '用户新增', '100', '2', '#', '', 'F', '0', 'system:user:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1002', '用户修改', '100', '3', '#', '', 'F', '0', 'system:user:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1003', '用户删除', '100', '4', '#', '', 'F', '0', 'system:user:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1004', '用户导出', '100', '5', '#', '', 'F', '0', 'system:user:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1005', '用户导入', '100', '6', '#', '', 'F', '0', 'system:user:import', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1006', '重置密码', '100', '7', '#', '', 'F', '0', 'system:user:resetPwd', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1007', '角色查询', '101', '1', '#', '', 'F', '0', 'system:role:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1008', '角色新增', '101', '2', '#', '', 'F', '0', 'system:role:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1009', '角色修改', '101', '3', '#', '', 'F', '0', 'system:role:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1010', '角色删除', '101', '4', '#', '', 'F', '0', 'system:role:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1011', '角色导出', '101', '5', '#', '', 'F', '0', 'system:role:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1012', '菜单查询', '102', '1', '#', '', 'F', '0', 'system:menu:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1013', '菜单新增', '102', '2', '#', '', 'F', '0', 'system:menu:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1014', '菜单修改', '102', '3', '#', '', 'F', '0', 'system:menu:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1015', '菜单删除', '102', '4', '#', '', 'F', '0', 'system:menu:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1016', '部门查询', '103', '1', '#', '', 'F', '0', 'system:dept:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1017', '部门新增', '103', '2', '#', '', 'F', '0', 'system:dept:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1018', '部门修改', '103', '3', '#', '', 'F', '0', 'system:dept:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1019', '部门删除', '103', '4', '#', '', 'F', '0', 'system:dept:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1020', '岗位查询', '104', '1', '#', '', 'F', '0', 'system:post:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1021', '岗位新增', '104', '2', '#', '', 'F', '0', 'system:post:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1022', '岗位修改', '104', '3', '#', '', 'F', '0', 'system:post:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1023', '岗位删除', '104', '4', '#', '', 'F', '0', 'system:post:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1024', '岗位导出', '104', '5', '#', '', 'F', '0', 'system:post:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1025', '字典查询', '105', '1', '#', '', 'F', '0', 'system:dict:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1026', '字典新增', '105', '2', '#', '', 'F', '0', 'system:dict:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1027', '字典修改', '105', '3', '#', '', 'F', '0', 'system:dict:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1028', '字典删除', '105', '4', '#', '', 'F', '0', 'system:dict:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1029', '字典导出', '105', '5', '#', '', 'F', '0', 'system:dict:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1030', '参数查询', '106', '1', '#', '', 'F', '0', 'system:config:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1031', '参数新增', '106', '2', '#', '', 'F', '0', 'system:config:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1032', '参数修改', '106', '3', '#', '', 'F', '0', 'system:config:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1033', '参数删除', '106', '4', '#', '', 'F', '0', 'system:config:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1034', '参数导出', '106', '5', '#', '', 'F', '0', 'system:config:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1035', '公告查询', '107', '1', '#', '', 'F', '0', 'system:notice:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1036', '公告新增', '107', '2', '#', '', 'F', '0', 'system:notice:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1037', '公告修改', '107', '3', '#', '', 'F', '0', 'system:notice:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1038', '公告删除', '107', '4', '#', '', 'F', '0', 'system:notice:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1039', '操作查询', '500', '1', '#', '', 'F', '0', 'monitor:operlog:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1040', '操作删除', '500', '2', '#', '', 'F', '0', 'monitor:operlog:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1041', '详细信息', '500', '3', '#', '', 'F', '0', 'monitor:operlog:detail', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1042', '日志导出', '500', '4', '#', '', 'F', '0', 'monitor:operlog:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1043', '登录查询', '501', '1', '#', '', 'F', '0', 'monitor:logininfor:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1044', '登录删除', '501', '2', '#', '', 'F', '0', 'monitor:logininfor:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1045', '日志导出', '501', '3', '#', '', 'F', '0', 'monitor:logininfor:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1046', '在线查询', '109', '1', '#', '', 'F', '0', 'monitor:online:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1047', '批量强退', '109', '2', '#', '', 'F', '0', 'monitor:online:batchForceLogout', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1048', '单条强退', '109', '3', '#', '', 'F', '0', 'monitor:online:forceLogout', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1049', '任务查询', '110', '1', '#', '', 'F', '0', 'monitor:job:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1050', '任务新增', '110', '2', '#', '', 'F', '0', 'monitor:job:add', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1051', '任务修改', '110', '3', '#', '', 'F', '0', 'monitor:job:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1052', '任务删除', '110', '4', '#', '', 'F', '0', 'monitor:job:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1053', '状态修改', '110', '5', '#', '', 'F', '0', 'monitor:job:changeStatus', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1054', '任务详细', '110', '6', '#', '', 'F', '0', 'monitor:job:detail', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1055', '任务导出', '110', '7', '#', '', 'F', '0', 'monitor:job:export', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1056', '生成查询', '114', '1', '#', '', 'F', '0', 'tool:gen:list', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1057', '生成修改', '114', '2', '#', '', 'F', '0', 'tool:gen:edit', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1058', '生成删除', '114', '3', '#', '', 'F', '0', 'tool:gen:remove', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1059', '生成代码', '114', '4', '#', '', 'F', '0', 'tool:gen:code', '#', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_menu` VALUES ('1062', '发样客户管理', '1088', '2', '/wxcustomer/deliverGoods', 'menuItem', 'C', '0', 'deliverGoods:deliverGoods:view', '#', 'admin', '2018-03-01 00:00:00', 'admin', '2019-11-03 13:11:57', '发样/成交情况菜单');
INSERT INTO `sys_menu` VALUES ('1063', '查询', '1062', '1', '#', 'menuItem', 'F', '0', 'deliverGoods:deliverGoods:list', '#', 'admin', '2018-03-01 00:00:00', 'admin', '2019-11-02 23:40:51', '');
INSERT INTO `sys_menu` VALUES ('1066', '删除', '1062', '2', '#', 'menuItem', 'F', '0', 'deliverGoods:deliverGoods:remove', '#', 'admin', '2018-03-01 00:00:00', 'admin', '2019-11-10 20:05:27', '');
INSERT INTO `sys_menu` VALUES ('1074', '微信客户管理', '1088', '1', '/wxcustomer/WechatCustomer', 'menuItem', 'C', '0', 'WechatCustomer:WechatCustomer:view', '#', 'admin', '2018-03-01 00:00:00', 'admin', '2019-11-02 11:06:50', '微信客户菜单');
INSERT INTO `sys_menu` VALUES ('1075', '微信客户查询', '1074', '1', '#', '', 'F', '0', 'WechatCustomer:WechatCustomer:list', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1076', '微信客户新增', '1074', '2', '#', '', 'F', '0', 'WechatCustomer:WechatCustomer:add', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1077', '微信客户修改', '1074', '3', '#', '', 'F', '0', 'WechatCustomer:WechatCustomer:edit', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1078', '微信客户删除', '1074', '4', '#', '', 'F', '0', 'WechatCustomer:WechatCustomer:remove', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1079', '微信客户导出', '1074', '5', '#', '', 'F', '0', 'WechatCustomer:WechatCustomer:export', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1087', '成交客户管理', '1088', '3', '/wxcustomer/deal', 'menuItem', 'C', '0', 'deal:deal:view', '#', 'admin', '2019-11-02 09:28:58', 'admin', '2019-11-07 20:59:58', '');
INSERT INTO `sys_menu` VALUES ('1088', '微信客户', '0', '0', '#', 'menuItem', 'M', '0', null, 'fa fa-cube', 'admin', '2019-11-02 11:06:12', '', null, '');
INSERT INTO `sys_menu` VALUES ('1089', '业绩统计', '1088', '4', '#', 'menuItem', 'M', '0', '', '#', 'admin', '2019-11-02 11:37:55', 'admin', '2019-11-02 11:40:26', '');
INSERT INTO `sys_menu` VALUES ('1090', '每日微信跟进登记表', '1089', '1', '/wxcustomer/wxRegisterStatistics', 'menuItem', 'C', '0', 'wxRegisterStatistics:wxRegister:view', '#', 'admin', '2019-11-02 11:41:23', 'admin', '2019-11-02 20:52:59', '');
INSERT INTO `sys_menu` VALUES ('1091', '跟进顾客资料表', '1089', '2', '/wxcustomer/customerDataStatistics', 'menuItem', 'C', '0', 'customerDataStatistics:customerData:view', '#', 'admin', '2019-11-02 11:41:39', 'admin', '2019-11-02 20:53:23', '');
INSERT INTO `sys_menu` VALUES ('1092', '查询', '1087', '1', '#', 'menuItem', 'F', '0', 'deal:deal:list', '#', 'admin', '2019-11-03 02:14:40', 'admin', '2019-11-07 21:00:12', '');
INSERT INTO `sys_menu` VALUES ('1093', '删除', '1087', '2', '#', 'menuItem', 'F', '0', 'deal:deal:remove', '#', 'admin', '2019-11-03 02:15:36', 'admin', '2019-11-07 21:00:23', '');
INSERT INTO `sys_menu` VALUES ('1094', '发货', '1062', '3', '#', 'menuItem', 'F', '0', 'deal:deal:send', '#', 'admin', '2019-11-10 20:05:18', '', null, '');
INSERT INTO `sys_menu` VALUES ('1095', '分配售后人员', '1087', '3', '#', 'menuItem', 'F', '0', 'deal:deal:giveSale', '#', 'admin', '2019-11-10 20:05:58', '', null, '');
INSERT INTO `sys_menu` VALUES ('1096', '发货', '1087', '4', '#', 'menuItem', 'F', '0', 'deal:deal:send', '#', 'admin', '2019-11-10 20:06:34', '', null, '');
INSERT INTO `sys_menu` VALUES ('1115', '工作总结', '1088', '5', '/wxcustomer/summary', '', 'C', '0', 'wxcustomer:summary:view', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '工作总结菜单');
INSERT INTO `sys_menu` VALUES ('1116', '工作总结查询', '1115', '1', '#', '', 'F', '0', 'wxcustomer:summary:list', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1117', '工作总结新增', '1115', '2', '#', '', 'F', '0', 'wxcustomer:summary:add', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1118', '工作总结修改', '1115', '3', '#', '', 'F', '0', 'wxcustomer:summary:edit', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1119', '工作总结删除', '1115', '4', '#', '', 'F', '0', 'wxcustomer:summary:remove', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1120', '工作总结导出', '1115', '5', '#', '', 'F', '0', 'wxcustomer:summary:export', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1121', '问答库', '1088', '6', '/wxcustomer/qalibrary', '', 'C', '0', 'wxcustomer:qalibrary:view', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '问答库菜单');
INSERT INTO `sys_menu` VALUES ('1122', '问答库查询', '1121', '1', '#', '', 'F', '0', 'wxcustomer:qalibrary:list', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1123', '问答库新增', '1121', '2', '#', '', 'F', '0', 'wxcustomer:qalibrary:add', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1124', '问答库修改', '1121', '3', '#', '', 'F', '0', 'wxcustomer:qalibrary:edit', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1125', '问答库删除', '1121', '4', '#', '', 'F', '0', 'wxcustomer:qalibrary:remove', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');
INSERT INTO `sys_menu` VALUES ('1126', '问答库导出', '1121', '5', '#', '', 'F', '0', 'wxcustomer:qalibrary:export', '#', 'admin', '2018-03-01 00:00:00', 'ry', '2018-03-01 00:00:00', '');

-- ----------------------------
-- Table structure for sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `sys_notice`;
CREATE TABLE `sys_notice` (
  `notice_id` int(4) NOT NULL AUTO_INCREMENT COMMENT '公告ID',
  `notice_title` varchar(50) NOT NULL COMMENT '公告标题',
  `notice_type` char(1) NOT NULL COMMENT '公告类型（1通知 2公告）',
  `notice_content` varchar(2000) DEFAULT NULL COMMENT '公告内容',
  `status` char(1) DEFAULT '0' COMMENT '公告状态（0正常 1关闭）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`notice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通知公告表';

-- ----------------------------
-- Records of sys_notice
-- ----------------------------

-- ----------------------------
-- Table structure for sys_oper_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_oper_log`;
CREATE TABLE `sys_oper_log` (
  `oper_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志主键',
  `title` varchar(50) DEFAULT '' COMMENT '模块标题',
  `business_type` int(2) DEFAULT '0' COMMENT '业务类型（0其它 1新增 2修改 3删除）',
  `method` varchar(100) DEFAULT '' COMMENT '方法名称',
  `operator_type` int(1) DEFAULT '0' COMMENT '操作类别（0其它 1后台用户 2手机端用户）',
  `oper_name` varchar(50) DEFAULT '' COMMENT '操作人员',
  `dept_name` varchar(50) DEFAULT '' COMMENT '部门名称',
  `oper_url` varchar(255) DEFAULT '' COMMENT '请求URL',
  `oper_ip` varchar(50) DEFAULT '' COMMENT '主机地址',
  `oper_location` varchar(255) DEFAULT '' COMMENT '操作地点',
  `oper_param` varchar(2000) DEFAULT '' COMMENT '请求参数',
  `status` int(1) DEFAULT '0' COMMENT '操作状态（0正常 1异常）',
  `error_msg` varchar(2000) DEFAULT '' COMMENT '错误消息',
  `oper_time` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`oper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志记录';

-- ----------------------------
-- Records of sys_oper_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_post
-- ----------------------------
DROP TABLE IF EXISTS `sys_post`;
CREATE TABLE `sys_post` (
  `post_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '岗位ID',
  `post_code` varchar(64) NOT NULL COMMENT '岗位编码',
  `post_name` varchar(50) NOT NULL COMMENT '岗位名称',
  `post_sort` int(4) NOT NULL COMMENT '显示顺序',
  `status` char(1) NOT NULL COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='岗位信息表';

-- ----------------------------
-- Records of sys_post
-- ----------------------------
INSERT INTO `sys_post` VALUES ('1', 'ceo', '董事长', '1', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_post` VALUES ('2', 'se', '项目经理', '2', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_post` VALUES ('3', 'hr', '人力资源', '3', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');
INSERT INTO `sys_post` VALUES ('4', 'user', '普通员工', '4', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(30) NOT NULL COMMENT '角色名称',
  `role_key` varchar(100) NOT NULL COMMENT '角色权限字符串',
  `role_sort` int(4) NOT NULL COMMENT '显示顺序',
  `data_scope` char(1) DEFAULT '1' COMMENT '数据范围（1：全部数据权限 2：自定数据权限 3：本部门数据权限 4：本部门及以下数据权限）',
  `status` char(1) NOT NULL COMMENT '角色状态（0正常 1停用）',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='角色信息表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '管理员', 'admin', '1', '1', '0', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '管理员');
INSERT INTO `sys_role` VALUES ('2', '普通角色', 'common', '2', '2', '0', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '普通角色');
INSERT INTO `sys_role` VALUES ('3', '发样成交组组员', 'FYCJZZY', '3', '1', '0', '0', 'admin', '2019-10-22 15:54:24', 'admin', '2019-11-21 11:30:21', '');
INSERT INTO `sys_role` VALUES ('4', '发样成交组组长', 'FYCJZZZ', '2', '1', '0', '0', 'admin', '2019-10-22 15:54:44', 'admin', '2019-11-21 11:28:12', '');
INSERT INTO `sys_role` VALUES ('5', '库房管理员', 'KFGLY', '6', '1', '0', '0', 'admin', '2019-10-22 15:54:58', 'admin', '2019-10-22 15:56:30', '');
INSERT INTO `sys_role` VALUES ('6', '售后组组长', 'SHZZZ', '4', '1', '0', '0', 'admin', '2019-10-22 15:55:14', '', null, null);
INSERT INTO `sys_role` VALUES ('7', '售后组组员', 'SHZZY', '5', '1', '0', '0', 'admin', '2019-10-22 15:55:26', '', null, null);
INSERT INTO `sys_role` VALUES ('8', '公司领导', 'GSLD', '7', '1', '0', '0', 'admin', '2019-10-22 15:56:00', 'admin', '2019-10-22 15:56:37', '');

-- ----------------------------
-- Table structure for sys_role_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_dept`;
CREATE TABLE `sys_role_dept` (
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `dept_id` bigint(20) NOT NULL COMMENT '部门ID',
  PRIMARY KEY (`role_id`,`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色和部门关联表';

-- ----------------------------
-- Records of sys_role_dept
-- ----------------------------
INSERT INTO `sys_role_dept` VALUES ('2', '100');
INSERT INTO `sys_role_dept` VALUES ('2', '101');
INSERT INTO `sys_role_dept` VALUES ('2', '105');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `menu_id` bigint(20) NOT NULL COMMENT '菜单ID',
  PRIMARY KEY (`role_id`,`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色和菜单关联表';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('2', '1');
INSERT INTO `sys_role_menu` VALUES ('2', '2');
INSERT INTO `sys_role_menu` VALUES ('2', '3');
INSERT INTO `sys_role_menu` VALUES ('2', '100');
INSERT INTO `sys_role_menu` VALUES ('2', '101');
INSERT INTO `sys_role_menu` VALUES ('2', '102');
INSERT INTO `sys_role_menu` VALUES ('2', '103');
INSERT INTO `sys_role_menu` VALUES ('2', '104');
INSERT INTO `sys_role_menu` VALUES ('2', '105');
INSERT INTO `sys_role_menu` VALUES ('2', '106');
INSERT INTO `sys_role_menu` VALUES ('2', '107');
INSERT INTO `sys_role_menu` VALUES ('2', '108');
INSERT INTO `sys_role_menu` VALUES ('2', '109');
INSERT INTO `sys_role_menu` VALUES ('2', '110');
INSERT INTO `sys_role_menu` VALUES ('2', '111');
INSERT INTO `sys_role_menu` VALUES ('2', '112');
INSERT INTO `sys_role_menu` VALUES ('2', '113');
INSERT INTO `sys_role_menu` VALUES ('2', '114');
INSERT INTO `sys_role_menu` VALUES ('2', '115');
INSERT INTO `sys_role_menu` VALUES ('2', '500');
INSERT INTO `sys_role_menu` VALUES ('2', '501');
INSERT INTO `sys_role_menu` VALUES ('2', '1000');
INSERT INTO `sys_role_menu` VALUES ('2', '1001');
INSERT INTO `sys_role_menu` VALUES ('2', '1002');
INSERT INTO `sys_role_menu` VALUES ('2', '1003');
INSERT INTO `sys_role_menu` VALUES ('2', '1004');
INSERT INTO `sys_role_menu` VALUES ('2', '1005');
INSERT INTO `sys_role_menu` VALUES ('2', '1006');
INSERT INTO `sys_role_menu` VALUES ('2', '1007');
INSERT INTO `sys_role_menu` VALUES ('2', '1008');
INSERT INTO `sys_role_menu` VALUES ('2', '1009');
INSERT INTO `sys_role_menu` VALUES ('2', '1010');
INSERT INTO `sys_role_menu` VALUES ('2', '1011');
INSERT INTO `sys_role_menu` VALUES ('2', '1012');
INSERT INTO `sys_role_menu` VALUES ('2', '1013');
INSERT INTO `sys_role_menu` VALUES ('2', '1014');
INSERT INTO `sys_role_menu` VALUES ('2', '1015');
INSERT INTO `sys_role_menu` VALUES ('2', '1016');
INSERT INTO `sys_role_menu` VALUES ('2', '1017');
INSERT INTO `sys_role_menu` VALUES ('2', '1018');
INSERT INTO `sys_role_menu` VALUES ('2', '1019');
INSERT INTO `sys_role_menu` VALUES ('2', '1020');
INSERT INTO `sys_role_menu` VALUES ('2', '1021');
INSERT INTO `sys_role_menu` VALUES ('2', '1022');
INSERT INTO `sys_role_menu` VALUES ('2', '1023');
INSERT INTO `sys_role_menu` VALUES ('2', '1024');
INSERT INTO `sys_role_menu` VALUES ('2', '1025');
INSERT INTO `sys_role_menu` VALUES ('2', '1026');
INSERT INTO `sys_role_menu` VALUES ('2', '1027');
INSERT INTO `sys_role_menu` VALUES ('2', '1028');
INSERT INTO `sys_role_menu` VALUES ('2', '1029');
INSERT INTO `sys_role_menu` VALUES ('2', '1030');
INSERT INTO `sys_role_menu` VALUES ('2', '1031');
INSERT INTO `sys_role_menu` VALUES ('2', '1032');
INSERT INTO `sys_role_menu` VALUES ('2', '1033');
INSERT INTO `sys_role_menu` VALUES ('2', '1034');
INSERT INTO `sys_role_menu` VALUES ('2', '1035');
INSERT INTO `sys_role_menu` VALUES ('2', '1036');
INSERT INTO `sys_role_menu` VALUES ('2', '1037');
INSERT INTO `sys_role_menu` VALUES ('2', '1038');
INSERT INTO `sys_role_menu` VALUES ('2', '1039');
INSERT INTO `sys_role_menu` VALUES ('2', '1040');
INSERT INTO `sys_role_menu` VALUES ('2', '1041');
INSERT INTO `sys_role_menu` VALUES ('2', '1042');
INSERT INTO `sys_role_menu` VALUES ('2', '1043');
INSERT INTO `sys_role_menu` VALUES ('2', '1044');
INSERT INTO `sys_role_menu` VALUES ('2', '1045');
INSERT INTO `sys_role_menu` VALUES ('2', '1046');
INSERT INTO `sys_role_menu` VALUES ('2', '1047');
INSERT INTO `sys_role_menu` VALUES ('2', '1048');
INSERT INTO `sys_role_menu` VALUES ('2', '1049');
INSERT INTO `sys_role_menu` VALUES ('2', '1050');
INSERT INTO `sys_role_menu` VALUES ('2', '1051');
INSERT INTO `sys_role_menu` VALUES ('2', '1052');
INSERT INTO `sys_role_menu` VALUES ('2', '1053');
INSERT INTO `sys_role_menu` VALUES ('2', '1054');
INSERT INTO `sys_role_menu` VALUES ('2', '1055');
INSERT INTO `sys_role_menu` VALUES ('2', '1056');
INSERT INTO `sys_role_menu` VALUES ('2', '1057');
INSERT INTO `sys_role_menu` VALUES ('2', '1058');
INSERT INTO `sys_role_menu` VALUES ('2', '1059');
INSERT INTO `sys_role_menu` VALUES ('3', '1062');
INSERT INTO `sys_role_menu` VALUES ('3', '1063');
INSERT INTO `sys_role_menu` VALUES ('3', '1066');
INSERT INTO `sys_role_menu` VALUES ('3', '1074');
INSERT INTO `sys_role_menu` VALUES ('3', '1075');
INSERT INTO `sys_role_menu` VALUES ('3', '1076');
INSERT INTO `sys_role_menu` VALUES ('3', '1077');
INSERT INTO `sys_role_menu` VALUES ('3', '1078');
INSERT INTO `sys_role_menu` VALUES ('3', '1087');
INSERT INTO `sys_role_menu` VALUES ('3', '1088');
INSERT INTO `sys_role_menu` VALUES ('3', '1089');
INSERT INTO `sys_role_menu` VALUES ('3', '1090');
INSERT INTO `sys_role_menu` VALUES ('3', '1092');
INSERT INTO `sys_role_menu` VALUES ('3', '1093');
INSERT INTO `sys_role_menu` VALUES ('3', '1094');
INSERT INTO `sys_role_menu` VALUES ('3', '1096');
INSERT INTO `sys_role_menu` VALUES ('3', '1115');
INSERT INTO `sys_role_menu` VALUES ('3', '1116');
INSERT INTO `sys_role_menu` VALUES ('3', '1117');
INSERT INTO `sys_role_menu` VALUES ('3', '1118');
INSERT INTO `sys_role_menu` VALUES ('3', '1119');
INSERT INTO `sys_role_menu` VALUES ('3', '1121');
INSERT INTO `sys_role_menu` VALUES ('3', '1122');
INSERT INTO `sys_role_menu` VALUES ('4', '1062');
INSERT INTO `sys_role_menu` VALUES ('4', '1063');
INSERT INTO `sys_role_menu` VALUES ('4', '1066');
INSERT INTO `sys_role_menu` VALUES ('4', '1074');
INSERT INTO `sys_role_menu` VALUES ('4', '1075');
INSERT INTO `sys_role_menu` VALUES ('4', '1076');
INSERT INTO `sys_role_menu` VALUES ('4', '1077');
INSERT INTO `sys_role_menu` VALUES ('4', '1078');
INSERT INTO `sys_role_menu` VALUES ('4', '1079');
INSERT INTO `sys_role_menu` VALUES ('4', '1087');
INSERT INTO `sys_role_menu` VALUES ('4', '1088');
INSERT INTO `sys_role_menu` VALUES ('4', '1089');
INSERT INTO `sys_role_menu` VALUES ('4', '1090');
INSERT INTO `sys_role_menu` VALUES ('4', '1091');
INSERT INTO `sys_role_menu` VALUES ('4', '1092');
INSERT INTO `sys_role_menu` VALUES ('4', '1093');
INSERT INTO `sys_role_menu` VALUES ('4', '1094');
INSERT INTO `sys_role_menu` VALUES ('4', '1095');
INSERT INTO `sys_role_menu` VALUES ('4', '1096');
INSERT INTO `sys_role_menu` VALUES ('4', '1115');
INSERT INTO `sys_role_menu` VALUES ('4', '1116');
INSERT INTO `sys_role_menu` VALUES ('4', '1117');
INSERT INTO `sys_role_menu` VALUES ('4', '1118');
INSERT INTO `sys_role_menu` VALUES ('4', '1119');
INSERT INTO `sys_role_menu` VALUES ('4', '1120');
INSERT INTO `sys_role_menu` VALUES ('4', '1121');
INSERT INTO `sys_role_menu` VALUES ('4', '1122');
INSERT INTO `sys_role_menu` VALUES ('4', '1123');
INSERT INTO `sys_role_menu` VALUES ('4', '1124');
INSERT INTO `sys_role_menu` VALUES ('4', '1125');
INSERT INTO `sys_role_menu` VALUES ('4', '1126');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `dept_id` bigint(20) DEFAULT NULL COMMENT '部门ID',
  `login_name` varchar(30) NOT NULL COMMENT '登录账号',
  `user_name` varchar(30) NOT NULL COMMENT '用户昵称',
  `user_type` varchar(2) DEFAULT '00' COMMENT '用户类型（00系统用户）',
  `email` varchar(50) DEFAULT '' COMMENT '用户邮箱',
  `phonenumber` varchar(11) DEFAULT '' COMMENT '手机号码',
  `sex` char(1) DEFAULT '0' COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(100) DEFAULT '' COMMENT '头像路径',
  `password` varchar(50) DEFAULT '' COMMENT '密码',
  `salt` varchar(20) DEFAULT '' COMMENT '盐加密',
  `status` char(1) DEFAULT '0' COMMENT '帐号状态（0正常 1停用）',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `login_ip` varchar(50) DEFAULT '' COMMENT '最后登陆IP',
  `login_date` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', '103', 'admin', '若依', '00', 'ry@163.com', '15888888888', '1', '', '29c67a30398638269fe600f73a054934', '111111', '0', '0', '127.0.0.1', '2019-11-21 11:03:45', 'admin', '2018-03-16 11:33:00', 'ry', '2019-11-21 11:03:44', '管理员');
INSERT INTO `sys_user` VALUES ('2', '105', 'ry', '若依', '00', 'ry@qq.com', '15666666666', '1', '', '8e6d98b90472783cc73c17047ddccf36', '222222', '0', '0', '127.0.0.1', '2018-03-16 11:33:00', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '测试员');
INSERT INTO `sys_user` VALUES ('3', '102', '2222', '2222', '00', '198454654@qq.com', '13060823544', '0', '', 'dd7f40db0ac6003ff045a23ed86955c9', '4ba3fe', '0', '0', '', null, 'admin', '2019-11-21 11:23:30', '', null, null);

-- ----------------------------
-- Table structure for sys_user_online
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_online`;
CREATE TABLE `sys_user_online` (
  `sessionId` varchar(50) NOT NULL DEFAULT '' COMMENT '用户会话id',
  `login_name` varchar(50) DEFAULT '' COMMENT '登录账号',
  `dept_name` varchar(50) DEFAULT '' COMMENT '部门名称',
  `ipaddr` varchar(50) DEFAULT '' COMMENT '登录IP地址',
  `login_location` varchar(255) DEFAULT '' COMMENT '登录地点',
  `browser` varchar(50) DEFAULT '' COMMENT '浏览器类型',
  `os` varchar(50) DEFAULT '' COMMENT '操作系统',
  `status` varchar(10) DEFAULT '' COMMENT '在线状态on_line在线off_line离线',
  `start_timestamp` datetime DEFAULT NULL COMMENT 'session创建时间',
  `last_access_time` datetime DEFAULT NULL COMMENT 'session最后访问时间',
  `expire_time` int(5) DEFAULT '0' COMMENT '超时时间，单位为分钟',
  PRIMARY KEY (`sessionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='在线用户记录';

-- ----------------------------
-- Records of sys_user_online
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user_post
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_post`;
CREATE TABLE `sys_user_post` (
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `post_id` bigint(20) NOT NULL COMMENT '岗位ID',
  PRIMARY KEY (`user_id`,`post_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户与岗位关联表';

-- ----------------------------
-- Records of sys_user_post
-- ----------------------------
INSERT INTO `sys_user_post` VALUES ('1', '1');
INSERT INTO `sys_user_post` VALUES ('2', '2');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户和角色关联表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '2');
INSERT INTO `sys_user_role` VALUES ('3', '7');
