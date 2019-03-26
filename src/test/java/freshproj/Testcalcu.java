package freshproj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Testcalcu {
	@Test
	public void test() {
		System.out.println("sum");
		Integer x=15;
		Integer y=15;
		Integer expresult=30;
	
			 Integer result = Calcul.sum(x, y);

        assertEquals(expresult, result);
        System.out.println("result is"+result);

       
    }
}
