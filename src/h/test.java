package h;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;

public class test {

	@Test
	 public void test() {
		assertEquals(model.add(5.0, 6.0),11.0,0);
		
	}
	@Test
public	void t3() {
		assertEquals(model.answer("1/2"),0.5,0);
		
	}
	
	
	@Test
	 public void t4() {
		
		assertEquals(model.div(4.0, 0.0),0.0,0);
		
	}
	@Test 
	
	 public void t1() {
		assertEquals(model.sqrt("-4"),0.0,0);
	}
	@Test
	 public void t2() 
	{
		assertEquals(model.minus(11.0, 2.0),9.0,0);	
		
	}
	
	
	
	

}
