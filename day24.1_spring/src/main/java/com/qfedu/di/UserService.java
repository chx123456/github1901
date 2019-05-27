package com.qfedu.di;

public class UserService {
	public UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser() {
		userDao.add();
	}

}
