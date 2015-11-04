package com.xr.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xr.entity.DemoEntity;


@Repository
public interface DemoDao extends JpaRepository<DemoEntity, Serializable> {
	 

}
