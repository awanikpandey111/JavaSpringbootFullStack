package com.inJUnit;

public class MyMath {
	public int calcSum(int[] nums) {
		int sum=0;
		for(int it:nums) {
			sum+=it;
		}
		return sum;
	}
}
