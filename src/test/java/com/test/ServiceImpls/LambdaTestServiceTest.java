package com.test.ServiceImpls;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.test.seviceInterfaces.LambdaTestService;

public class LambdaTestServiceTest {

	LambdaTestService lts;
	
	@Test
	public void testService()
	{
		lts=new LambdaTestServiceImpl();
		int output=lts.addition(1, 2);
		System.out.println("output="+output);
		assertNotNull(lts);
	}
}
