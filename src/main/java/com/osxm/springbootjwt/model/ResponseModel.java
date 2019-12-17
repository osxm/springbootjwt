/**
 * @Title: ResponseModel.java
 * @Package com.osxm.springbootjwt.model
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月14日
 * @version V1.0
 */
package com.osxm.springbootjwt.model;

import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @ClassName: ResponseModel
 * @Description: TODO
 * @author oscarchen
 */
public class ResponseModel<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int status;

	private T result;

	private String message;

	private String code;

	public ResponseModel() {
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getResponse();
		response.setCharacterEncoding("UTF-8");
	}

	public String getMessage() {
		return this.message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public T getResult() {
		return this.result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public String toString() {
		return "ResponseModel [status=" + this.status + ", result=" + this.result + ", message=" + this.message
				+ ", code=" + this.code + "]";
	}
}