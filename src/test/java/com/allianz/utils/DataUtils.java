package com.allianz.utils;

import org.testng.annotations.DataProvider;

public class DataUtils  {
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


}
