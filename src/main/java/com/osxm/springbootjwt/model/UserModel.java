/**
 * @Title: UserModel.java
 * @Package com.osxm.springbootjwt.model
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月17日
 * @version V1.0
 */
package com.osxm.springbootjwt.model;

/**
 * @ClassName: UserModel
 * @Description: TODO
 * @author oscarchen
 */
public class UserModel {
	private String id;

	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
