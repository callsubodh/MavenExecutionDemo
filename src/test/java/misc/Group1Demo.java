package misc;

import org.testng.annotations.Test;

public class Group1Demo {
	@Test(priority=2, groups={"functional","regression"}, description="Group1 class test is to retrieve the env values")
	public static void getEnvValue() {
		
		String env_variable = System.getenv("ENV_VALUES");
		System.out.println("Env variable of Group1Demo value is: "+env_variable);
		
	}
	
	@Test(groups={"functional","regression"}, priority=3, description="Group1 class test is to retrieve the property values")
	public static void getPropValue() {
		
		String prop_variable = System.getProperty("browser");
		System.out.println("Property variable of Group1Demo value is: "+prop_variable);
		
	}
	
	@Test(priority=4, description="Group1 class test is to retrieve the parameter values", groups="sanity")
	public static void getParamValue2() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Parameter variable of Group1Demo value is: "+prop_variable);
		
	}
	
	@Test(priority=1, description="Group1 class test is to retrieve the parameter values", groups="functional", dependsOnGroups = {"sanity"})
	public static void getParamValue() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Parameter variable of Group1Demo value is: "+prop_variable);
		
	}
	
	@Test(groups={"functional","sanity"}, priority=5, description="Group1 class test is to retrieve the property values")
	public static void getPropValue2() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Property variable of Group1Demo value is: "+prop_variable);
		
	}
}

