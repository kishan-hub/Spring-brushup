package com.mapping.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.HandlerExecutionChain;

public abstract interface HandlerMapping {
   
	public abstract HandlerExecutionChain getHandler(HttpServletRequest req) throws Exception;
}
