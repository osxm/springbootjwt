/**
 * @Title: UserController.java
 * @Package com.osxm.springbootjwt.controller
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月17日
 * @version V1.0
 */
package com.osxm.springbootjwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osxm.springbootjwt.entity.User;
import com.osxm.springbootjwt.service.UserService;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author oscarchen
 */
@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/users")
	public List<User> list() {
		return service.list();
	}
}
