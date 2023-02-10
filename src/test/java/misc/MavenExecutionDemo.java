package misc;
import org.testng.annotations.Test;

public class MavenExecutionDemo {
	
	@Test(priority=2, groups={"functional","regression"}, description="This test is to retrieve the env values")
	public static void getEnvValue() {
		
		String env_variable = System.getenv("ENV_VALUE");
		System.out.println("Env variable value is: "+env_variable);
		
	}
	
	@Test(groups={"functional","regression"}, priority=3, description="This test is to retrieve the property values")
	public static void getPropValue() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Property variable value is: "+prop_variable);
		
	}
	
	@Test(priority=4, description="This test is to retrieve the parameter values", groups="sanity")
	public static void getParamValue2() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Parameter variable value is: "+prop_variable);
		
	}
	
	@Test(priority=1, description="This test is to retrieve the parameter values", groups="functional")
	public static void getParamValue() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Parameter variable value is: "+prop_variable);
		
	}
	
	@Test(groups={"functional","sanity"}, priority=5, description="This test is to retrieve the property values")
	public static void getPropValue2() {
		
		String prop_variable = System.getProperty("browser","chrome");
		System.out.println("Property variable value is: "+prop_variable);
		
	}
}
