
public class MonteCarloSimulation {
  public static void main(String[] args) {
    final int NUMBER_OF_TRIALS = 10_000_000;
    int numberOfHits = 0;
    int numberOfMisses = 0;
    for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
      double x = Math.random() * 2.0 - 1;
      double y = Math.random() * 2.0  - 1;
      if (x * x + y * y <= 1)
        numberOfHits++;
      else
    	numberOfMisses++;
    }
    System.out.println("number of hits: " + numberOfHits);
    System.out.println("number of misses: " + numberOfMisses);
    System.out.println("number of trials: " + NUMBER_OF_TRIALS);
    double pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
    System.out.println("PI is " + pi);
  }
}
