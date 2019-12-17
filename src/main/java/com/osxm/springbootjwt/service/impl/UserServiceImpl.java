/**
 * @Title: UserServiceImpl.java
 * @Package com.osxm.springbootjwt.service
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月14日
 * @version V1.0
 */
package com.osxm.springbootjwt.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.osxm.springbootjwt.entity.User;
import com.osxm.springbootjwt.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author oscarchen
 */
@Service
public class UserServiceImpl implements UserService {

	@PersistenceContext
	protected EntityManager em;

	public User get(String id) {
		return em.find(User.class, id);
	}
	
	public List<User> list(){
		return em.createQuery("from User", User.class).getResultList();
	}
}
