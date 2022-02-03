package BernoulliDemo;

import java.io.PrintStream;

public class Bernoulli {
	
	private int pos;
	private int eventnum;
	private double success;
	private double fail;

	public Bernoulli(int pos, int eventnum) {
		this.pos = pos;
		this.eventnum = eventnum;
	}
	
	void printResult() {
		PrintStream ps = System.out;
		success = eventnum / (pos*1.0);
		fail = 1 - success;
		ps.println("The probabiliy of success is :"+success);
		ps.println("The probabiliy of failure is :"+fail);
	}
}
