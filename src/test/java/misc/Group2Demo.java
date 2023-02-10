package misc;

import org.testng.annotations.Test;

public class Group2Demo {
	@Test(priority=2, groups={"functional","regression"}, description="Group2 class test is to retrieve the env values")
	public static void getEnvValue() {
		
		String env_variable = System.getProperty("ENV_VALUES");
		System.out.println("Env variable value of Group2Demo is: "+env_variable);
		
	}
	
	@Test(groups={"functional","regression","xyz"}, priority=3, description="Group2 class test is to retrieve the property values")
	public static void getPropValue() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Property variable of Group2Demo value is: "+prop_variable);
		
	}
	
	@Test(priority=4, description="Group2 class test is to retrieve the parameter values", groups="sanity")
	public static void getParamValue2() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Parameter variable of Group2Demo value is: "+prop_variable);
		
	}
	
	@Test(priority=1, description="Group2 class test is to retrieve the parameter values", groups="functional", dependsOnGroups="xyz")
	public static void getParamValue() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Parameter variable of Group2Demo value is: "+prop_variable);
		
	}
	
	@Test(groups={"functional","sanity"}, priority=5, description="Group2 class test is to retrieve the property values")
	public static void getPropValue2() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Property variable of Group2Demo value is: "+prop_variable);
		
	}
}

