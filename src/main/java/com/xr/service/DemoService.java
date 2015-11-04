package com.xr.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.DemoDao;
import com.xr.entity.DemoEntity;


@Service
public class DemoService {
	
	@Autowired
	DemoDao dao;
	
	@Transactional
	public List<DemoEntity> test(){
		System.err.println("ssssssssss");
		
		DemoEntity data = new DemoEntity();
		data.setId(Math.round(1000));
		
		dao.save(data);
		
		return dao.findAll();
	}

}
