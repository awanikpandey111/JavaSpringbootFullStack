package com.inJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math=new MyMath();
	@Test
	void calSumThreeMemberArray() {
	//Absenece of failure is success
		//Test condition or assert
		System.out.println(math.calcSum(new int[] {1,2,3}));
		assertEquals(6, math.calcSum(new int[] {1,2,3}));
	}
	@Test 
	void calcSumEmptyArray() {
	//Absenece of failure is success
		//Test condition or assert
		int res=math.calcSum(new int[] {});
		System.out.println(res);
		int expected=0;
		assertEquals(expected, res);
	}

}
