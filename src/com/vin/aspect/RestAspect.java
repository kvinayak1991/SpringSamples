package com.vin.aspect;


import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RestAspect {
	
	@Autowired
	private HttpServletRequest request;
	
	@Before("execution(* com.vin.controller.HelloController.*(..))")
	public void getNameAdvice(){
//		System.out.println(request.getHeader("sessionid"));//if valid then only call Controller
//		System.out.println("GetParam::::"+request.getHeaderNames());
		System.out.println("Executing Advice on com.vin.controller.HelloController.*");
	}
}
