create database if not exists springbootjwt default charset = utf8;
use springbootjwt;

CREATE TABLE USER
(
	-- 用户ID
	ID varchar(60) NOT NULL COMMENT '用户ID',
	-- 用户名
	NAME varchar(60) COMMENT '用户名',
	-- 用户类型：
	-- 分为普通用户和机构账号两种
	TYPE varchar(20) COMMENT '用户类型：
分为普通用户和机构账号两种',
	-- 昵称
	NICK_NAME varchar(60) COMMENT '昵称',
	-- 用户密码
	PASSWORD varchar(40) COMMENT '用户密码',
	-- 密码盐
	SALT varchar(100) COMMENT '密码盐',
	-- 用户头像
	AVATAR varchar(100) COMMENT '用户头像',
	-- 出生年月
	BIRTH_DAY date COMMENT '出生年月',
	-- 身份证号码
	ID_CARD varchar(30) COMMENT '身份证号码',
	-- 性别
	SEX varchar(10) COMMENT '性别',
	-- 邮箱
	EMAIL varchar(60) COMMENT '邮箱',
	-- 手机号码
	PHONE varchar(30) COMMENT '手机号码',
	-- 用户状态
	STATE varchar(10) COMMENT '用户状态',
	-- 创建时间
	SYS_CREATE_TIME datetime COMMENT '创建时间',
	-- 更新时间
	SYS_UPDATE_TIME datetime COMMENT '更新时间',
	-- 创建人
	SYS_CREATOR varchar(20) COMMENT '创建人',
	-- 更新人
	SYS_UPDATER varchar(20) COMMENT '更新人',
	PRIMARY KEY (ID),
	UNIQUE (ID)
);

INSERT INTO `user`(ID,NAME,PASSWORD) VALUES ('admin','Admin','c4ca4238a0b923820dcc509a6f75849b'); --密码1