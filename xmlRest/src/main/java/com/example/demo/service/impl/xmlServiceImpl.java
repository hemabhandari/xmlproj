package com.example.demo.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Data;
import com.example.demo.repository.xmlRepository;
import com.example.demo.service.xmlService;
 
public class xmlServiceImpl implements xmlService{
	
	@Autowired
	private xmlRepository xmlRepository;

	public void setXmlRepository(xmlRepository xmlRepository) {
		this.xmlRepository = xmlRepository;
	}
	
	@Override
	public List<Data> retrieveDatas() {
		List<Data> data = xmlRepository.findAll();
		  return data;
		  }

	@Override
	public Data getData(Long dataId) {
		 Optional<Data> optData= xmlRepository.findById(dataId);
		 return optData.get();
	}

	@Override
	public void saveData(Data data) {
		xmlRepository.save(data);		
	}

	@Override
	public void deleteData(Long dataId) {
		xmlRepository.deleteById(dataId);
	}

	@Override
	public void updateData(Data data) {
		xmlRepository.save(data);
	}
}
