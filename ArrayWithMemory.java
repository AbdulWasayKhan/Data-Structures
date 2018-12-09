import java.util.Arrays;

/**
 * Assignment 2: Q1
 * Student Name: Abdul Wasay Khan
 * Student Id: 214981104
 */

public class ArrayWithMemory<E> implements ReadWriteCount<E>{
	
	private E[] genericData; 
	private int readCount = 0; 
	private int writeCount = 0;
	
	public ArrayWithMemory(int capacity) {
		genericData = (E[]) new Object[capacity];
		resetMemory();
	}

	@Override
	/** A method that writes element e at index i of the underlying array. */
	public void write(int i, E e) {
		genericData[i] = e;
		writeCount++;
		
	}

	@Override
	/** A method that returns the element at index i of the underlying array. */
	public E read(int i) {
		readCount++;
		return genericData[i];
	}

	@Override
	/** A method that keeps the count of the number of times elements were 
	 * added to (i.e., written into) the underlying array. */
	public int numberOfWrites() {
		return writeCount;
	}

	@Override
	/** A method that keeps the count of the number of times elements of the underlying 
	 * array were accessed (i.e., read). */
	public int numberOfReads() {
		return readCount;
	}

	@Override
	/** A method that resets both read and write memory back to zero. */
	public void resetMemory() {
		readCount = 0;
		writeCount = 0;
	}
	
	
	@Override
	/** A method that prints out the current content of the array. */
	public void printOutContent() {
		for(int i = 0; i < genericData.length; i++)
		{
			System.out.println(Arrays.toString(genericData));
		}
		
	}
	
}
