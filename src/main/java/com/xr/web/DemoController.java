package com.xr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xr.entity.DemoEntity;
import com.xr.service.DemoService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/test")
	@ResponseBody
	public List<DemoEntity> test(){
		
		List<DemoEntity> list = demoService.test();
		
		return list;
	}

}
