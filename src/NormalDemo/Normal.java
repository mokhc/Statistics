package NormalDemo;

import java.io.PrintStream;

public class Normal {
	
	double probNorm;
	double sigma;
	double pi = Math.PI;
	double x;
	double m;

	Normal(double sigma, double m, double x){
		this.sigma = sigma;
		this.m  =m;
		this.x = x;
	}
	
	void printResult() {
		PrintStream ps = System.out;
		probNorm = ((1/(sigma*Math.sqrt(2*pi )))*Math.exp(-Math.pow((x-m),2)/(2*Math.pow(sigma,2))));
		ps.println("The sigma is :"+sigma);
		ps.println("The mu value is :"+m);
		ps.println("The x value is :"+x);
		ps.println("The probability is :"+probNorm);
		ps.println("End of calculation");
		ps.println(" ");
	}
}
