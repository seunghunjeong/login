package com.example.service;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.domain.UserVO;
import com.example.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	@Inject
	UserDAO dao;
	@Override
	public void keepLogin(String uid, String sessionId, Date sessionLimit) throws Exception {
		dao.keepLogin(uid, sessionId, sessionLimit);
	}

	@Override
	public UserVO checkLoginBefore(String value) throws Exception {
		return dao.checkUserWithSessionKey(value);
	}

}
