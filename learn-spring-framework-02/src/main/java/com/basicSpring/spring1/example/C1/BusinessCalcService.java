package com.basicSpring.spring1.example.C1;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
public class BusinessCalcService {
	private DataService dataService;
	
	public BusinessCalcService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData())
				.max().orElse(0);
	}
}
