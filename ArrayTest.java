
public class ArrayTest {

	public static void main(String[] args) {
		System.out.println("List all values in array:");
		int a[] = new int [10];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;
		
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-----------------------");
		System.out.println("Another Type of Array:");
		System.out.println("-----------------------");
		
		int b[] = {10, 20, 30, 40, 50};
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
			
		
	}

}
