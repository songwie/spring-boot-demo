package com.xr.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="t_demo")
public class DemoEntity {

	@Id
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
