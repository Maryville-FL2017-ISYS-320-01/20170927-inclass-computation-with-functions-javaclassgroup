/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P6_Scientific {

	public static void main(String[] args) {
		System.out.println(computeScientificValue(6.5, 3));
		
	}
	public static double computeScientificValue(double base, double baseexponent) {
		double scientificValue = base * (Math.pow(10, baseexponent));
		return scientificValue;
	}

}
