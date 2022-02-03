package BinomialDemo;

import BernoulliDemo.Bernoulli;

public class BiniomialApplication {
	public static void main(String[] args) {
		Binomial b0 = new Binomial(5,0.5,0);
		b0.printResult();
		
		Binomial b1 = new Binomial(5,0.5,1);
		b1.printResult();
		
		Binomial b2 = new Binomial(5,0.5,2);
		b2.printResult();
		
		Binomial b3 = new Binomial(5,0.5,3);
		b3.printResult();
		
		Binomial b4 = new Binomial(5,0.5,4);
		b4.printResult();
		
		Binomial b5 = new Binomial(5,0.5,5);
		b5.printResult();
	}
}
