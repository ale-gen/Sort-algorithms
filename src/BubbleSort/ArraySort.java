package BubbleSort;

import java.util.Arrays;

public class ArraySort extends Sort {
	
	public ArraySort(int size) {
		super(size);
	}
	
	public void sort() {
		Arrays.sort(getTab());
	}

}
