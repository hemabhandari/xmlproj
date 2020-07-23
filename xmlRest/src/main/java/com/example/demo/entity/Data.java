package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Data")
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Data_Source")
	private String Data_Source;

	@Column(name = "Data_Value")
	private Integer Data_Value;
	
	@Column(name = "Data_Tag1")
	private String Data_Tag1;

	@Column(name = "Data_Tag2")
	private String Data_Tag2;

	@Column(name = "Data_Tag3")
	private String Data_Tag3;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData_Source() {
		return Data_Source;
	}

	public void setData_Source(String data_Source) {
		Data_Source = data_Source;
	}

	public Integer getData_Value() {
		return Data_Value;
	}

	public void setData_Value(Integer data_Value) {
		Data_Value = data_Value;
	}

	public String getData_Tag1() {
		return Data_Tag1;
	}

	public void setData_Tag1(String data_Tag1) {
		Data_Tag1 = data_Tag1;
	}

	public String getData_Tag2() {
		return Data_Tag2;
	}

	public void setData_Tag2(String data_Tag2) {
		Data_Tag2 = data_Tag2;
	}

	public String getData_Tag3() {
		return Data_Tag3;
	}

	public void setData_Tag3(String data_Tag3) {
		Data_Tag3 = data_Tag3;
	}

}
