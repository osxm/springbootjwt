/**
 * @Title: AuthController.java
 * @Package com.osxm.springbootjwt.controller
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月14日
 * @version V1.0
 */
package com.osxm.springbootjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.osxm.springbootjwt.entity.User;
import com.osxm.springbootjwt.model.ResponseModel;
import com.osxm.springbootjwt.model.UserModel;
import com.osxm.springbootjwt.service.UserService;
import com.osxm.springbootjwt.util.JWTUtil;
import com.osxm.springbootjwt.util.MD5Util;
import com.osxm.springbootjwt.util.ResponseHelper;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

/**
 * @ClassName: AuthController
 * @Description: TODO
 * @author oscarchen
 */
@RestController
public class AuthController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "mess", value = "博客内容",
                required = false, paramType = "query", dataType = "String")
    })
	public ResponseModel<String> login(@RequestBody UserModel userModel) {
		User userFromDb = userService.get(userModel.getId());
		ResponseModel<String> responseModel = null;
		if (userFromDb != null) {
			if(MD5Util.encrypt(userModel.getPassword()).equals(userFromDb.getPassword())) {
				String token = JWTUtil.sign(userModel.getId(), userModel.getPassword());
				responseModel = ResponseHelper.buildResponseModel(token);
			}else {
				responseModel = ResponseHelper.authFailure("Password is invalid.");
			}
		} else {
			responseModel = ResponseHelper.authFailure("User "+userModel.getId()+" does not exist.");
		}
		return responseModel;
	}

}
