import java.io.File; //imports the File java utility
  
public class HW3file 
{ 
	//Recursive Print allows the output to be organized to simulate a file system with levels
     static void RecursivePrint(File[] arr, int fileLevel)  
     { 
         // for loop and array (online help here)
         for (File f : arr)  
         { 
             //for loop when there is another file level to indent 
             for (int i = 0; i < fileLevel; i++) 
                 System.out.print("\t"); 
              
             //gets the name of the file
             if(f.isFile())  
                 System.out.print(f.getName()); 
             	 System.out.println(" / File Size (bytes): " + f.length()); 
             	 
               
             //if statement for the sub-directory (if one is found) to get the name and put it in between brackets
              if(f.isDirectory())  
             {  
                 System.out.println("[" + f.getName() + "]"); 
               
                 //list files in File f in recursive print and adding levels
                 RecursivePrint(f.listFiles(), fileLevel + 1); 
             } 
         } 
    } 
      
    //Main Statement 
    public static void main(String[] args) 
    { 
        //Main directory path (If ran on another system input your own path to desired folder)
        String maindirpath = "C:\\Users\\shane\\Downloads\\3HW lg"; 
                  
        //sets maindir File as a new file path
        File maindir = new File(maindirpath); 
          
        //if statement for if the maindir exists and is a directory (imported by util above)
        if(maindir.exists() && maindir.isDirectory()) 
        { 
            //Array holder for files 
            File arr[] = maindir.listFiles(); 
               
            System.out.println("Main Directory Stated: " + maindir); 
            System.out.println("Files Found: ");
              
            //Calls to the RecursivePrint method above and starts the array at 0
            RecursivePrint(arr, 0);  
            
            //Sources of FILE java utility:
            // https://dzone.com/articles/java-example-list-all-files
            // https://www.geeksforgeeks.org/file-class-in-java/
            
       }  
    } 
} 