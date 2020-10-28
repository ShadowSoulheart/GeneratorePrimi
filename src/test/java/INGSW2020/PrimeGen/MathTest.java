package INGSW2020.PrimeGen;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


public class MathTest {
	
	private static Math math;
	
	
	//Prima delle prove, devo inizializzare la classe. Se si usa before, non serve il metodo statico. Viene eseguito prima delle prove//
	//Before class viene eseguito una volta sola//
	@BeforeClass
	public static void prepare() {
		math = new Math();
	}
	
	@Test
	public void generatorePrimiFunziona() {
			//Se n è 1, il risultato è vuoto.//
			assertEquals(new LinkedList<Integer>(), math.generatorePrimi(1));
			assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17 , 19), math.generatorePrimi(20));
	}
	
	@Test
	public void isPrimeFunziona() {
		assertFalse(math.isPrime(9));
		assertFalse(math.isPrime(1));
		assertTrue(math.isPrime(2));
		
		List<Integer> primi = Arrays.asList(11, 13, 17, 23, 31, 41, 53, 67, 83, 101);
		for (int i : primi) {
			assertTrue(math.isPrime(i));
		}
	}
	
}
