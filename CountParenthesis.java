import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountParenthesis {

	public static void main(String[] args) throws FileNotFoundException {
		// A string that holds the directory path to the folder containing your .java files (please enter your own). 
		// My Directory: C:\Users\shane\OneDrive\Desktop\Eclipse and Code\Workplace\Java Programming\src
		// double \ slashed may be added
		String filename = "C:\\Users\\shane\\OneDrive\\Desktop\\Eclipse and Code\\Workplace\\Java Programming\\src\\";
		System.out.println("Enter your desired .java file (not case sensitive and do not include .java): ");
		// Scanner to receive the name of the .java file (not case sensitive)
		 Scanner a = new Scanner(System.in);
		 // Making a string b that stores the name entered from the scanner and adds ".java"
		 String b = a.nextLine()+".java";
		 // var fullname combines the directory path string filename and b
		 var fullname = filename + b;
		 System.out.println("File path entered: " + fullname);
		 
		 // BufferedReader reading the fullname var as a new file 
		 BufferedReader objReader = new BufferedReader(new FileReader(fullname));
		 //stores fullname var as a File called file
		 File file = new File (fullname);
		 //Boolean to check if the file exists
		 boolean exists = file.exists();
		 System.out.println("The file you entered exists: "+exists);
		 
		 // new scanner to scan the file at fullname
		 Scanner scanner = new Scanner( new File(fullname) );
		 // all text scanned from the file at fullname stored as a string called text
		 String text = scanner.useDelimiter("\\A").next();
		 // close scanner
		 scanner.close();
		  
		 // function to check balance in program
		 // initializing ints
		 int parenthesisCount = 0;
		 int bracketCount = 0;
		 int squigglyCount = 0;
		 int parenthesisClose = 0;
		 int bracketClose = 0;
		 int squigglyClose=0;
		 
		 // main for loop that counts the parentheses, brackets, and squiggly braces in the file 
		 for (int i=0; i < text.length(); i++) {
			 if(text.charAt(i) == '(') {
				 parenthesisCount++;
		 }
			 else if (text.charAt(i) =='[') {
				 bracketCount++;
			 }
			 else if(text.charAt(i)=='{') {
				 squigglyCount++;
			 }
			 else if(text.charAt(i)==')') {
				 parenthesisClose++;
			 }
			 else if(text.charAt(i)==']') {
				 bracketClose++;
			 }
			 else if(text.charAt(i)=='}') {
				 squigglyClose++;
			 }
			
		 }
		 // if the number of open parentheses/brackets/squigglies = the number of closed parentheses/brackets/squigglies
		 // the program is found balanced in that regard
		 if (parenthesisCount == parenthesisClose && bracketCount==bracketClose && squigglyCount==squigglyClose ) {
			 System.out.println("The Program "+b+" Is Balanced");
		 }
		 // if the number of open is not equal to the number of closed then the program is found unbalanced
		 else {
			 System.out.println("The Program "+b+" Is Not Balanced");
		 }
	
	

	}

}
