// Shane Irons - 10/15/2019
// code imported to Heap file, also learned from Sesh Venugopal: https://www.youtube.com/watch?v=W81Qzuz4qH0
import java.util.Scanner;
public class HeapApp {
 
	// Setting the scanner
    private static Scanner a;

    // main function 
    public static void main(String[] args) {
    	// setting new heap integer 
        Heap<Integer> hp = new Heap<Integer>();
        // New scanner a
        a = new Scanner(System.in);
        System.out.print("Enter next int, 'done' to stop: ");
        String line = a.next();
        // while loop to check if 'done' is typed
        while (!line.equals("done")) {
        	// insert parseInteger into the line of heap
            hp.insert(Integer.parseInt(line));
            // print the current heap
            System.out.println(hp);
            // continue loop untile 'done' is typed
            System.out.print("Enter next int, 'done' to stop: ");
            line = a.next();
        }
         // while loop if the heap is empty to delete the heap by max
        while (!hp.isEmpty()) {
            int max = hp.delete();
            System.out.println(max + " " + hp);
        }
    }
 
}