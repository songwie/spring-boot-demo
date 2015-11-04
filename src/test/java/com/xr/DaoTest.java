package com.xr;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.xr.base.dao.CommonDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RootApplication.class)
@WebAppConfiguration
public class DaoTest extends CommonDAO{


	@Test
	//@Transactional
	public void  test(){
		List data = this.getList("select * from t_demo limit 10 " );
		System.err.println(data);;

		String[] fieldList = new String[]{"idd","iddd"};
		data = this.getList("select id,id idd from t_demo limit 10 ",fieldList );
		System.err.println(data);;
	}

}
