package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Data;
import com.example.demo.service.xmlService;

@RestController
public class xmlRestController {

	@Autowired
	private xmlService xmlService;

	public void setxmlService(xmlService xmlService) {
		this.xmlService = xmlService;
	}

	@GetMapping("/api/data")
	public List<Data> getDatas() {
		List<Data> data = xmlService.retrieveDatas();
		return data;
	}

	@GetMapping("/api/data/{dataId}")
	public Data getData(@PathVariable(name = "dataId") Long dataId) {
		return xmlService.getData(dataId);
	}

	@PostMapping("/api/data")
	public void saveData(Data data) {
		xmlService.saveData(data);
		System.out.println("Data Saved Successfully");
	}

	@DeleteMapping("/api/data/{dataId}")
	public void deleteData(@PathVariable(name = "dataId") Long dataId) {
		xmlService.deleteData(dataId);
		System.out.println("Data Deleted Successfully");
	}

	@PutMapping("/api/data/{dataId}")
	public void updateData(@RequestBody Data data, @PathVariable(name = "dataId") Long dataId) {
		Data d = xmlService.getData(dataId);
		if (d != null) {
			xmlService.updateData(data);
		}

	}
}
