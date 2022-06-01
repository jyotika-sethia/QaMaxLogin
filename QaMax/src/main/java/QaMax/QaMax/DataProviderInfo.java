package QaMax.QaMax;

import org.testng.annotations.DataProvider;

public class DataProviderInfo {
	@DataProvider(name="information")
	public Object[][] data()
	{
		 Object[][] pass =new Object[3][2];
		 pass[0][0]="jyyo123";
		 pass[0][1]="Alpha1@3";
		 
		 pass[1][0]="jyo123";
		 pass[1][1]="Alpha1@3";
		 
		 pass[2][0]="jyo123";
		 pass[2][1]="Alha123";
		 
		 return pass;
	}

}
