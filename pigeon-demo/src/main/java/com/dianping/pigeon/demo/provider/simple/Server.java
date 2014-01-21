/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.provider.simple;

import com.dianping.pigeon.demo.ConfigLoader;
import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.demo.UserService;
import com.dianping.pigeon.demo.provider.EchoServiceDefaultImpl;
import com.dianping.pigeon.demo.provider.UserServiceDefaultImpl;
import com.dianping.pigeon.remoting.ServiceFactory;

public class Server {

	public static void main(String[] args) throws Exception {
		ConfigLoader.init();
		
		ServiceFactory.publishService(EchoService.class, new EchoServiceDefaultImpl());
		
		ServiceFactory.publishService(UserService.class, new UserServiceDefaultImpl());
		
		System.in.read();
	}

}