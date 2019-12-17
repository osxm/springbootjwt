package com.osxm.springbootjwt.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * <p>
 * 
 * </p>
 *
 * @author OSXM
 * @since 2019-11-28
 */
@Entity
public class User extends RootEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@Id
	@Column(name = "ID", length = 40, nullable = false)
	private String id;

	/**
	 * 用户名
	 */

	private String name;

	/**
	 * 用户类型：
	 */

	private String type;

	/**
	 * 昵称
	 */

	private String nickName;

	/**
	 * 用户密码
	 */

	private String password;

	/**
	 * 密码盐
	 */

	private String salt;

	/**
	 * 用户头像
	 */

	private String avatar;

	/**
	 * 出生年月
	 */

	private LocalDate birthDay;

	/**
	 * 身份证号码
	 */

	private String idCard;

	/**
	 * 性别
	 */

	private String sex;

	/**
	 * 邮箱
	 */

	private String email;

	/**
	 * 手机号码
	 */

	private String phone;

	/**
	 * 用户状态
	 */

	private String state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name=" + name + ", type=" + type + ", nickName=" + nickName + ", password="
				+ password + ", salt=" + salt + ", avatar=" + avatar + ", birthDay=" + birthDay + ", idCard=" + idCard
				+ ", sex=" + sex + ", email=" + email + ", phone=" + phone + ", state=" + state + "}";
	}
}
