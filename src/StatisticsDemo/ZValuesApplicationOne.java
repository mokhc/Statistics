package StatisticsDemo;

public class ZValuesApplicationOne {
	public static void main(String[] args) {
		//Accepts these values for testing
		//0.4960 to 0.6103
		//0.5020 to 0.3897
		ZValues zv1 = new ZValues(0.5060);
		zv1.printInfo();
		
		ZValues zv2 = new ZValues(0.4880);
		zv2.printInfo();
		
		ZValues zv3 = new ZValues(0.5002);
		zv3.printInfo();

		ZValues zv4 = new ZValues(0.3896);
		zv4.printInfo();

		ZValues zv5 = new ZValues(0.6102);
		zv5.printInfo();
	}
}
