package com.example.persistence;

import java.util.Date;

import com.example.domain.UserVO;

public interface UserDAO {
	void keepLogin(String uid, String sessionId, Date sessionLimit) throws Exception;
	UserVO checkUserWithSessionKey(String value) throws Exception;
}
