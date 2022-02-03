package StatisticsDemo;

import java.io.PrintStream;

public class ZValues {
	//0.4960 to 0.6103
	double[] positiveZ = {0.4960, 0.5000, 0.5040, 0.5080, 0.5120, 0.5160, 0.5199, 0.5239, 0.5279, 0.5319, 0.5359,
						  0.5398, 0.5438, 0.5478, 0.5517, 0.5557, 0.5596, 0.5636, 0.5675, 0.5714, 0.5753,
						  0.5793, 0.5832, 0.5871, 0.5910, 0.5948, 0.5987, 0.6026, 0.6064, 0.6103, 0.6141};
	//0.5020 to 0.3897
	double[] negativeZ = {0.5020, 0.5000, 0.4960, 0.4920, 0.4880, 0.4840, 0.4801, 0.4761, 0.4721, 0.4681, 0.4641,
					      0.4602, 0.4562, 0.4522, 0.4483, 0.4443, 0.4404, 0.4364, 0.4325, 0.4286, 0.4247,
	                      0.4207, 0.4168, 0.4129, 0.4090, 0.4052, 0.4013, 0.3974, 0.3936, 0.3897, 0.3859};
	int len;
	
	double input;
	
	public ZValues(double input) {
		this.len = positiveZ.length;
		this.input = input;
		
	}
	
	void printInfo() {
		PrintStream ps = System.out;
		double mean = 0;
		double sd = 1;
		if (input >= 0.5000) {
			for (int a=1; a<len; a++) {
				//earlier numbers are smaller
				if (((positiveZ[a]+((positiveZ[a]-positiveZ[a-1])/2)) >= input) && (input >= (positiveZ[a]-((positiveZ[a]-positiveZ[a-1])/2)))) {
					ps.println("The input value is :"+input);
					ps.println("The matched area is :"+positiveZ[a]);
					ps.println("The z value is :"+(a-1)/100.0);
					ps.println("The x value is :"+(((a-1)/100.0)*sd - mean));
				}
				else {
					continue;
				}
			}
		}
		else if (input < 0.5000) {
			for (int a=1; a<len; a++) {
				//earlier numbers are bigger
				if (((negativeZ[a]+((negativeZ[a-1]-negativeZ[a])/2)) >= input) && (input >= (negativeZ[a]-((negativeZ[a-1]-negativeZ[a])/2)))) {
					ps.println("The input value is :"+input);
					ps.println("The matched area is :"+negativeZ[a]);
					ps.println("The z value is :"+(-((a-1)/100.0)));
					ps.println("The x value is :"+(-((a-1)/100.0)*sd - mean));
				}
				else {
					continue;
				}
			}
		}
		ps.println("End of match!");
	}

}
