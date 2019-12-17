/**
 * @Title: AuthenticationInterceptor.java
 * @Package com.osxm.springbootjwt.aop
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月17日
 * @version V1.0
 */
package com.osxm.springbootjwt.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.osxm.springbootjwt.service.UserService;
import com.osxm.springbootjwt.util.JWTUtil;
import com.osxm.springbootjwt.util.ResponseHelper;

/**
 * @ClassName: AuthenticationInterceptor
 * @Description: TODO
 * @author oscarchen
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

	@Autowired
	private UserService userService;

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object object) throws Exception {
		String token = httpServletRequest.getHeader("token");
		String errMsg = null;
		// 非映射方法直接通过,比如静态资源
		if (!(object instanceof HandlerMethod)) {
			return true;
		}
		//
		if (token == null) {
			errMsg = "No token, please login first.";
		} else {
			String userId = JWTUtil.getUserId(token);
			if (userId != null && userService.get(userId) != null) {
				errMsg = "Invalid token, please get valid token.";
			}
		}
		if (errMsg != null) {
			ResponseHelper.authFailure(errMsg);
			return false;
		}
		return true;
	}
}
