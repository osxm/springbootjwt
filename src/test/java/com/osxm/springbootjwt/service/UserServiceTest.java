/**
 * @Title: UserServiceTest.java
 * @Package com.osxm.springbootjwt.service
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月17日
 * @version V1.0
 */
package com.osxm.springbootjwt.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
  * @ClassName: UserServiceTest
  * @Description: TODO
  * @author oscarchen
  */
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService service;
	
	@Test
	public void get() {
		service.get("admin");
	}
}
