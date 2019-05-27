package com.qfedu.ioc;

public class UserFactory {
	public static User createUser() {
		User u = new User();
		u.setAge(20);
		u.setName("laoliu");
		return u;
	}

}
