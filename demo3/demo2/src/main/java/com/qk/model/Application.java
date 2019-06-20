package com.qk.model;

import java.io.Serializable;

import javax.persistence.*;  
@Entity
@Table(name="application")
public class Application implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="code")
	private String code;
	@Column(name="desg")
	private String desg;
	
	
	public Application(){
		
		
	}
	
	public Application(int id, String name, String code, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.desg = desg;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}

}
