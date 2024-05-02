package com.allianz.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZDemoTest {
	
	@DataProvider
	public Object[][] validdata(){
	Object[][]data = new String[3][2];
	
	
data[0][0]="Saul";
data[0][1]="Saul";

data[1][0]="Saul";
data[1][1]="Saul";

data[2][0]="Saul";
data[2][1]="Saul";
return data;
	}

	@Test (dataProvider="validdata")
public void data(String uder, String pass) {
	System.out.println(uder+": "+pass);
}

	}


