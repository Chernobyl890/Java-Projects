import java.util.Scanner;

public class ioTest {
	public static void main(String[] args) {
		Scanner a = new Scanner( System.in );
		int integer1;
		int integer2;
		int sum;
		
		System.out.print( "Please enter an integer: " );
   		integer1 = a.nextInt();
   		
   		System.out.print( "Please enter another integer: " );
   		integer2 = a.nextInt();
   		
   		sum = integer1 + integer2;
         
	   System.out.printf( "%d + %d = %d", integer1, integer2, sum );
	}
}
