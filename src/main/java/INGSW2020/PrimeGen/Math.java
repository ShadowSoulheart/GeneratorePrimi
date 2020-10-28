package INGSW2020.PrimeGen;

import java.util.LinkedList;
import java.util.List;

public class Math {

	public List<Integer> generatorePrimi(int n) {
		
		List<Integer> nPrimi = new LinkedList<>();
		
		if (n >= 2) {
			nPrimi.add(2);
		}
		
		for (int i = 3; i < n; i+=2){
			if (isPrime(i)) {
				nPrimi.add(i);
			}
		}
		
		return nPrimi;
	}
	

	public boolean isPrime(int numero) {
		
		for (int i = 2; i*i < numero; i++) {
			if (numero%i==0)
				return false;
			}
		return true;
	}
}
