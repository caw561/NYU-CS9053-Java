public class LogisticGrowth {

	public static double calculatePopulation() {

		final double K = 10000.0;
		final double intialPop = 100.0;
		final double r = -0.3;
		final int t = 100;
		
		double population = K/(1 + ((K-intialPop)/intialPop)*(Math.pow(Math.E, t*r)));
		
		return population;
	}
	
	public static void main(String[] args) {
		
		int t=0;
		double population = calculatePopulation ();
		System.out.println("The population at time t = " + t + " is: " + population);

	}
}