package com.xr.service;

import com.xr.outservice.DemoRegistryService;

public class DemoRegistryServiceImpl implements DemoRegistryService {
	public String hello(String key)  {
		System.err.println("hello return "+key);
		return "hello return "+key;
	}
}

