package com.qk.Service;

import java.util.List;

import com.qk.dto.ApplicationDTO;
import com.qk.model.Application;


public interface AppService {

//void list(List<Application> application);

	


//List<Application> findAll();



void add(List<ApplicationDTO> applicationDTO);



void list(List<ApplicationDTO> applicationDTOs);



List<Application> findAll();




}
