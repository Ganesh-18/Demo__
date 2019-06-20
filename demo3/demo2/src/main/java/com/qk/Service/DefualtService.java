package com.qk.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.qk.Repository.DemoRepository;
import com.qk.dto.ApplicationDTO;
import com.qk.model.Application;
//import com.qk.Repository.Repository;
@Service
public class DefualtService implements AppService {

	
 @Autowired
  private DemoRepository repository;

	@Override
	public void add(List<ApplicationDTO> applicationDTOs) {
		for(ApplicationDTO dto : applicationDTOs) {
			Application application = new Application();
			application.setName(dto.getName());
			application.setCode(dto.getCode());
			application.setDesg(dto.getDesg());
			repository.saveAndFlush(application);
		}
	}
@Override
public void list(List<ApplicationDTO> applicationDTOs){
	
List<ApplicationDTO> app2 =new ArrayList<>();
	for(ApplicationDTO app3:app2){
	((ApplicationDTO) app2).setName(app3.getName());
	((ApplicationDTO) app2).setCode(app3.getCode());
	((ApplicationDTO) app2).setDesg(app3.getDesg());
	
	}
	System.out.println(app2);
}

@Override
public List<Application> findAll() {
	List<Application> appl=repository.findAll();
	System.out.println("test @@@@@@@@@@@@@@@s");
	System.out.println(appl);
		return appl;
	}
}
