package com.xr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.xr.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RootApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

	@Autowired
	DemoService demoService;
	
	@Test
	public void contextLoads() {
		demoService.test();
	}

}
