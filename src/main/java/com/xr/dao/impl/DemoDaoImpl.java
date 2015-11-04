package com.xr.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xr.base.dao.CommonDAO;
import com.xr.dao.interfaces.DemoDao;


@Component
public class DemoDaoImpl extends CommonDAO {
	
	@Autowired
	private DemoDao crud;
	
	public void  test(){
		List data = this.getList("select * from t_demo limit 10 " );
		System.err.println(data);;

		String[] fieldList = new String[]{"idd","iddd"};
		data = this.getList("select id,id idd from t_demo limit 10 ",fieldList );
		System.err.println(data);;
	}

	public DemoDao getCrud() {
		return crud;
	}
	public void setCrud(DemoDao crud) {
		this.crud = crud;
	}
}
