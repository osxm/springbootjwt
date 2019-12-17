/**
 * @Title: MD5UtilTest.java
 * @Package com.osxm.springbootjwt.util
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月17日
 * @version V1.0
 */
package com.osxm.springbootjwt.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
  * @ClassName: MD5UtilTest
  * @Description: TODO
  * @author oscarchen
  */
public class MD5UtilTest {

	@Test
	public void encrypt() {
		String password = "1";
		String encryptPass = MD5Util.encrypt(password);
		Assertions.assertEquals("c4ca4238a0b923820dcc509a6f75849b", encryptPass);
	}
}
