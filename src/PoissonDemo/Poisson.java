package PoissonDemo;

import java.io.PrintStream;

public class Poisson {
	double lambda;
	int r;
	int rfact;
	double probPoi;
	
	
	Poisson(double lambda, int r){
		this.lambda = lambda;
		this.r = r;
		rfact = 1;
		for (int a=r; a > 0; a--) {
			rfact = rfact*a;
		}
	}
	
	void printResult() {
		PrintStream ps = System.out;
		probPoi = Math.exp(-lambda)*(Math.pow(lambda, r)/rfact);
		ps.println("The lambda is :"+lambda);
		ps.println("The r value is :"+r);
		ps.println("The probability is :"+probPoi);
		ps.println("End of calculation");
		ps.println(" ");
	}
}
