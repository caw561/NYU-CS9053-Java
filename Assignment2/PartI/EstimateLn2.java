
public class  EstimateLn2 {

	public static double estimateLn2() {
		
		int n=0;
		double ln2= Math.log(2.0);
		double sum=0;
		double diff = 1e-5;
		while (Math.abs(sum - ln2) > diff) {
			n++;
			sum += Math.pow(-1, (n+1))/n;
		}
		System.out.println("ln is estimated as " + sum + "after " + n + " iterations");
		return sum;
	}
	
	public static void main(String[] args) {
		estimateLn2();
	}
}
