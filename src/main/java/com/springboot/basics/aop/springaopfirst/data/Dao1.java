package com.springboot.basics.aop.springaopfirst.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
	public String retrieveSomething()
	{
		return "dao1";
	}
}
