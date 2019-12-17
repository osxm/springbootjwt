/**
 * @Title: ResponseUtil.java
 * @Package com.osxm.badou.base
 * @Description: TODO
 * @author oscarchen
 * @date 2019年10月25日
 * @version V1.0
 */
package com.osxm.springbootjwt.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.osxm.springbootjwt.model.ResponseModel;

/**
 * @ClassName: ResponseUtil
 * @Description: TODO
 * @author oscarchen
 */
public class ResponseUtil {
	
	public static void returnJsonMessage(HttpServletResponse response, ResponseModel<String> responseModel)
			throws Exception {
		response.setContentType("application/json; charset=utf-8");
		PrintWriter writer = response.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		writer.print(mapper.writeValueAsString(responseModel));
		writer.close();
		response.flushBuffer();
	}
}
