package com.qk.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qk.model.Application;

@Repository  
public interface DemoRepository extends JpaRepository<Application,String>{
	Application findByName(String Name);
	
	List<Application> findAll();
}
