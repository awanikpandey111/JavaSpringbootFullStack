package com.basicSpring.spring1.example.C1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Component
@Primary
public class MongoDBDataService implements DataService{
	@Override
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55};
	}
}
