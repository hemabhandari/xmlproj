package com.example.demo.service;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Data;

public interface xmlService {

 public List<Data> retrieveDatas();
  
 public Data getData(Long dataId);
  
 public void saveData(Data data);
  
 public void deleteData(Long dataId);
  
 public void updateData(Data data);
}


