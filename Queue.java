import java.util.*;


class Queue 
{
	 int arr[];		//array storing queue items
	 int front;		//goes to the front/first item in queue 
	 int back;		//goes to last item in queue
	 int capacity;	//maximum initial capacity of queue
	 int count;		//find current size of queue
	
	
	//Initializer for Queue and parts
	Queue(int size)
	{
		arr = new int[size]; //stores items in queue as a type of array
		capacity = size; //used to set the initial capacity of the queue
		front = 0; //first item in queue
		back = -1; //last item in queue
		count = 0; //counts current items in queue
	}

	//Dequeue utility to delete items from the queue and shift items down
	public void dequeue()
	{
		//If statement for queue isEmpty
		if (isEmpty())
		{
			System.out.println("Queue Empty!");
			System.exit(1);
		}

		//When dequeue is called removes front item
		System.out.println("Removing " + arr[front]);

		//when item removed shift items and subtract (had help here)
		front = (front + 1) % capacity;
		count--;
	}

	//Enqueue section to insert items into the queue
	public void enqueue(int item)
	{
		//If statement for queue isFull
		if (isFull())
		{
			System.out.println("Queue Too Full!");
			System.exit(1);
		}

		System.out.println("Inserting " + item);

		//when item added shift items and add (had help here)
		back = (back + 1) % capacity;
		//adding to queue and adding item to rear of queue (had help here)
		arr[back] = item;
		count++;
	}

	//Peek to show the front element of the queue
	public int peek()
	{
		//if statement for when queue is empty
		if (isEmpty()) 
		{
			System.out.println("Queue Empty!");
		}
		//returns value at front of array (queue)
		return arr[front];
	}
	
	//PeekBack to show back of queue 
	public int peekBack()
	{
		//if statement for when queue is empty (just same as front)
		if (isEmpty())
		{
			System.out.println("Queue Empty!");
		}
		//returns value at back of array (queue)
		return arr[back];
	}

	//Return the current size of queue
	public int size()
	{
		return count;
	}

	//IsEmpty function called to if 0 items in Queue
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	//If queue is at capacity then isFull
	public Boolean isFull()
	{
		return (size() == capacity);
	}
	
	//Shows queue after elements are input
	public void show()
	{
		System.out.print("Queue: ");
		//for loop to establish capacity and add elements from array
		for (int i=0; i<capacity; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	//main function
	public static void main (String[] args)
	{
		//New queue with 4 values
		Queue q = new Queue(4);

		//added 4 items to queue (enqueue)
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(10);
		
		
		q.show();
		
		System.out.println();
		
		//peek at front element
		System.out.println("Front element is: " + q.peek());
		
		//peek at back element
		System.out.println("Back Elemnt is: " + q.peekBack());
		
		//delete front element
		q.dequeue();
		
		//peek at front element
		System.out.println("Front element is: " + q.peek());
		
		//peek at back element
		System.out.println("Back Elemnt is: " + q.peekBack());

		//display current size of queue
		System.out.println("Size of Queue: " + q.size());

		//delete front element
		q.dequeue();
		
		//display current size of queue
		System.out.println("Size of Queue: " + q.size());
	
		//delete more items
		q.dequeue();
		q.dequeue();
		
		//current size of queue
		System.out.println("Size of Queue: " + q.size());

		//attempt to delete another item
		q.dequeue();

	}
}
