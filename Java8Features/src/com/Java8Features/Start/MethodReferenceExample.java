package com.Java8Features.Start;

public class MethodReferenceExample {

	public static void main(String[] args) {
		iUser iUser = User :: new;
		User user = iUser.getUser("java8");
		System.out.println(user.getName());
	}

}

@FunctionalInterface
interface iUser{
	User getUser(String name);
}

class User {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
