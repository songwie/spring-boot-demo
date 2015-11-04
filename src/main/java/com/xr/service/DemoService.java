package com.xr.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xr.dao.impl.DemoDaoImpl;
import com.xr.dao.interfaces.DemoDao;
import com.xr.entity.DemoEntity;


@Service
public class DemoService {
	
	@Autowired
	DemoDaoImpl dao;
	
	@Transactional
	public List<DemoEntity> test(){
		System.err.println("ssssssssss");
		
		DemoEntity data = new DemoEntity();
		data.setId(Math.round(1000));
		
		dao.getCrud().save(data);
		dao.getCrud().flush();
		
		List<DemoEntity> list = dao.getCrud().findAll();
		
		dao.execute("delete from t_demo");
		
		dao.test();
		
		return list;
	}

}
