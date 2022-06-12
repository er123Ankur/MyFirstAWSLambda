package com.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.test.ServiceImpls.LambdaTestServiceImpl;
import com.test.seviceInterfaces.LambdaTestService;

public class LambdaTestClass {

	LambdaTestService lts;
	public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        lts=new LambdaTestServiceImpl();
	    //sfdf
        lts.addition(1, 2);
        return "Hello World - add=" + lts.addition(1, 2)+",input String="+input;
    }
	
}
