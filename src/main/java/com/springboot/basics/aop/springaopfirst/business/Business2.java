package com.springboot.basics.aop.springaopfirst.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.basics.aop.springaopfirst.data.Dao2;

@Service
public class Business2 {
	@Autowired
	private Dao2 dao2;
	public String calculateSomething()
	{
		return(dao2.retrieveSomething());
	}

}
