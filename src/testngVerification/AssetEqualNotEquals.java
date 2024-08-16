package testngVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetEqualNotEquals {
	
	@Test
	public void f() {
	String a ="Vaibhav";
	String b="vaibhav";
	String c="Vaibhav";
	
	//In This hard asser if any test point is failed it will stops 
	//the further exicution
	
	//Assert.assertEquals(a, c, "a and c are not equals");
	//Assert.assertEquals(a, b,"a and b are not equals");
	
	Assert.assertNotEquals(a, b,"A and b are equals");
	
	
	}
}
