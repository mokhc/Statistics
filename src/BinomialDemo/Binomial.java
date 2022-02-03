package BinomialDemo;

import java.io.PrintStream;

public class Binomial {
	double probBi;
	private int eventnum;
	private double p;
	private int successnum_x;
	private double q;

	private double ef;
	private double df;
	private double sf;
	
	Binomial(int eventnum, double p, int successnum_x) {
		this.eventnum = eventnum;
		this.p = p;
		this.successnum_x = successnum_x;
		this.q = 1-p;
		ef = 1;
		for (int a=eventnum; a > 0; a--) {
			ef = ef*a;
		}
		df = 1;
		for (int a=(eventnum - successnum_x); a > 0; a--) {
			df = df*a;
		}
		sf = 1;
		for (int a=successnum_x; a>0; a--) {
			sf = sf*a;
		}
	}
	
	void printResult() {
		PrintStream ps = System.out;
		probBi = ((ef / (df * sf))*(Math.pow(p, successnum_x)*Math.pow(q,(eventnum-successnum_x))));
		ps.println("The number of trials is :"+eventnum);
		ps.println("The desired number of success is :"+successnum_x);
		ps.println("The n factotial is :"+ef);
		ps.println("The n - x factotial is :"+df);
		ps.println("The x factotial is :"+sf);
		ps.println("The probability of success is :"+p);
		ps.println("The probability of failure is :"+q);
		ps.println("The probability is :"+probBi);
		ps.println("End of calculation");
		ps.println(" ");
	}
}
