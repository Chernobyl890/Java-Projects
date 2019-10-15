// Program to build a heap in Linear time using arrays
// Shane Irons - 10/15/2019
// Help from geeksforgeeks: https://www.geeksforgeeks.org/building-heap-from-array/

public class LinearHeap { 

	// heapify function with ints arr[] n and i 
	static void heapify(int arr[], int n, int i) 
	{ 
		int largest = i; // largest is root 
		int l = 2 * i + 1; // left children = 2*i + 1 
		int r = 2 * i + 2; // right children = 2*i + 2 

		// If left child is smaller than root
		if (l < n && arr[l] < arr[largest]) 
			largest = l; 

		// If right child is smaller than the largest 
		if (r < n && arr[r] < arr[largest]) 
			largest = r; 

		// If largest is root switch with smallest
		if (largest != i) { 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			// heapify the subtree that was affected 
			heapify(arr, n, largest); 
		} 
	} 

	// Building a heap from the array
	static void buildHeap(int arr[], int n) 
	{ 
		// Starting the index at the last non leaf node
		int startIdx = (n / 2) - 1; 

		// perform a reverse traversal and heapify the array starting at the start index
		for (int i = startIdx; i >= 0; i--) { 
			heapify(arr, n, i); 
		} 
	} 

	// function to print the heap
	static void printHeap(int arr[], int n) 
	{ 
		System.out.println("Linear Time Heap:"); 

		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	// Main function
	public static void main(String args[]) 
	{ 
		
		// Input numbers into the array below 
		int arr[] = {11, 5, 7, 3, 1}; 

		// setting n to the arr.length allows the array/heap to be as big or small is needed
		int n = arr.length; 

		// calling the function to build the heap
		buildHeap(arr, n); 

		// calling the function to print the heap
		printHeap(arr, n); 
	} 
} 
