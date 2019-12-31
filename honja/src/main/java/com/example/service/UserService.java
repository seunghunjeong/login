package com.example.service;

import java.util.Date;

import com.example.domain.UserVO;

public interface UserService {

	void keepLogin(String uid, String sessionId, Date next) throws Exception;
	UserVO checkLoginBefore(String value) throws Exception;
}
