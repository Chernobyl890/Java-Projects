//Chain Hashing Example in Java Programming 
import java.util.*; 
  
class HW4HashMap { 
  
    //Create HashMap with array
    static void createHashMap(int arr[]) 
    { 
        //Empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>(); 
  
        //For loop to go through the HashMap Array
        for (int i = 0; i < arr.length; i++) { 
  
            //If element is present call as Integer x
            Integer x = hmap.get(arr[i]); 
  
            //If the array was previously null, input 1st integer called as the first integer
            if (hmap.get(arr[i]) == null) { 
                hmap.put(arr[i], 1); 
            } 
  
            //If integers already in hmap, increment x
            else { 
                hmap.put(arr[i], ++x); 
            } 
        } 
  
        //Print HashMap 
        System.out.println(hmap); 
    } 
  
    //Main method to fill array and create HashMap
    public static void main(String[] args) 
    { 
    	//Input any positive numbers into array
        int arr[] = { 10, 9, 26, 78}; 
        createHashMap(arr); 
    } 
} 