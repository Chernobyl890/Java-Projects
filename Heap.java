// Program to take input from user and build a binary tree.
// Base code taken from Sesh Venugopal: https://www.youtube.com/watch?v=W81Qzuz4qH0
// Reverse engineered to become a minHeap and to learn why and how this works. 
// Shane Irons - 10/15/2019
import java.util.ArrayList;
import java.util.NoSuchElementException;

// Public class named Heap and extending the HeapApp fellow file
public class Heap<T extends Comparable<T>> {
     
    private ArrayList<T> items;
     
    // Heap going to be stored as an Array List
    public Heap() {
        items = new ArrayList<T>();
    }
         
    // Sifting through the array upwards with local variable k and (k-1)/2 is the stored parent as p. 
    
    private void siftUp() {
        int k = items.size() - 1;
        while (k > 0) {
            int p = (k-1)/2;
            // get items k and p
            T item = items.get(k);
            T parent = items.get(p);
            // if the item k is < the parent then switch them (basis of the minHeap)
            if (item.compareTo(parent) < 0) {
                // swap
                items.set(k, parent);
                items.set(p, item);
                 
                // move up one level
                k = p;
            } else {
                break;
            }
        }
    }
     
    // calls siftUp function and adds items
    public void insert(T item) {
        items.add(item);
        siftUp();
    }
     
    // siftDown function for the basis of the let child node (main/first insert for heaps)
    private void siftDown() {
        int k = 0;
        // main function for left child node 2*k+1
        int l = 2*k+1;
        while (l < items.size()) {
            int max=l, r=l+1;
            if (r < items.size()) { // there is a right child
                if (items.get(r).compareTo(items.get(l)) > 0) {
                    max++;
                }
            }
            // checks child node and if > max then switch
            if (items.get(k).compareTo(items.get(max)) > 0) {
                    // switch
                    T temp = items.get(k);
                    items.set(k, items.get(max));
                    items.set(max, temp);
                    k = max;
                    l = 2*k+1;
            } else {
                break;
            }
        }
    }
     
    // function to show deleting of heap 
    public T delete() 
    throws NoSuchElementException {
        if (items.size() == 0) {
            throw new NoSuchElementException();
        }
        if (items.size() == 1) {
            return items.remove(0);
        }
        T hold = items.get(0);
        items.set(0, items.remove(items.size()-1));
        siftDown();
        return hold;
    }
 
    // size int
    public int size() {
        return items.size();
    }
     
    // boolean if array is empty
    public boolean isEmpty() {
        return items.isEmpty();
         
    }
     
    // toString item
    public String toString() {
        return items.toString();
    }
}