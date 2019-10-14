//Shane Irons - Algorithms and Data Structures - 27 Aug 2019
import java.util.*;

public class AlgorithmsHW1 {
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		int i;
		int j;
		int n = 1000000;
		//Set each part of Question 3 into comments for interchangeability :)
		
		//Part 1 of Question 3
		
		/*for (i=0; i<n; ++i) {
			int sum = 0;
			++sum;
		}*/
		
		//Part 2 of Question 3
		
		/*for (i=0; i<n; ++i) {
			for ( j = 0; j<n; ++j) {
				int sum = 0;
				++sum;
			}
		}*/
		
		//Part 3 of Question 3
		
		/*for (i=0; i<n; ++i) {
			for (j=0; j<n * n; ++j) {
				int sum = 0;
				++sum;
			}
		}*/
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println("Working: " + n);
		System.out.println("Run Time in NanoSeconds:" + totalTime);
	}

}

