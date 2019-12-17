/**
 * @Title: UserService.java
 * @Package com.osxm.springbootjwt.service
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月14日
 * @version V1.0
 */
package com.osxm.springbootjwt.service;

import java.util.List;

import com.osxm.springbootjwt.entity.User;

/**
  * @ClassName: UserService
  * @Description: TODO
  * @author oscarchen
  */
public interface UserService {

	/**
	 * 通过Id获取用户
	 * @param id
	 * @return
	 */
	public User get(String id);
	
	public List<User>  list();
}
