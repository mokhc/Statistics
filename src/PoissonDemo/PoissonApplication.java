package PoissonDemo;

import BinomialDemo.Binomial;

public class PoissonApplication {
	public static void main(String[] args) {
		Poisson p0 = new Poisson(5.768,3);
		p0.printResult();
		
		Poisson p1 = new Poisson(6,1);
		p1.printResult();
		
		Poisson p2 = new Poisson(6,2);
		p2.printResult();
		
		Poisson p3 = new Poisson(6,3);
		p3.printResult();
		
		Poisson p4 = new Poisson(6,4);
		p4.printResult();
		
		Poisson p5 = new Poisson(6,5);
		p5.printResult();
		
		Poisson p6 = new Poisson(6,6);
		p6.printResult();
		
		Poisson p7 = new Poisson(6,7);
		p7.printResult();
		
		Poisson p8 = new Poisson(6,8);
		p8.printResult();
		
		Poisson p9 = new Poisson(6,9);
		p9.printResult();
	}
}
