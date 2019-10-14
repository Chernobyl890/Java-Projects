
public class BigOhNotation {

	public static void main(String[] args) {
		int n = 5;

		//Constant time O(1)
		System.out.println("Big Oh for Constant Time:");
		System.out.println("Hey - your input is: " + n);
		System.out.println("Hmm.. Still doing stuff with: " + n);
		
		//Logarithmic Time base 2 O(log n)
		System.out.println("----------------");
		System.out.println("O(log n) base 2 when n = " + n);
		System.out.println("----------------");

		for (int i=1; i<n; i=i*2) {
			System.out.println("Hey - I'm looking at: " + i);
		}
		
		//Linear Time O(n)
		System.out.println("----------------");
		System.out.println("O(n) when n = " + n);
		System.out.println("----------------");
		for (int i=0; i<n; i++) {
			System.out.println("Hey - I'm busy looking at: " + i);
		}
		
		//N log N Time O(n log n)
		System.out.println("----------------");
		System.out.println("O(n log n) when n = " + n);
		System.out.println("----------------");
		for (int i=1; i <=n; i++) {
			for (int j=1; j<8; j=j*2) {
				System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
				
			}
		}
		
		//Polynomial Time Algorithms O(n^p)
		System.out.println("----------------");
		System.out.println("O(n^2) when n = " + n);
		System.out.println("----------------");
		for (int i=1; i<=n; i++) {
			for (int j = 1; j<=n; j++) {
				System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
				
			}
		}
		
		//Exponential Time O(k^n)
		System.out.println("----------------");
		System.out.println("O(k^n) when n = " + n);
		System.out.println("----------------");
		for (int i=1; i<=Math.pow(2, n); i++) {
			System.out.println("Hey - I'm busy looking at: " + i);
		}
			
	}

}
