package com.iotek.service;

import com.iotek.entity.User;

public interface UserService {

	public User queryUser(String username, String psw);
}
