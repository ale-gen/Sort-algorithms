package Project_Main;

import java.util.Random;

import BubbleSort.ArraySort;
import BubbleSort.BubbleSort;
import BubbleSort.InsertSort;
import BubbleSort.QuickSort;
import BubbleSort.SelectSort;
import BubbleSort.ShellSort;

public class Research1 {
	
	int size = 10000;
	
	double bubbleTime, insertTime, selectTime, shellTime, quickTime, arraySortTime;
	long startTime = System.nanoTime();
	BubbleSort bubbleSort = new BubbleSort(size);
	SelectSort selectSort = new SelectSort(size);
	InsertSort insertSort = new InsertSort(size);
	ShellSort shellSort = new ShellSort(size);
	QuickSort quickSort = new QuickSort(size);
	ArraySort arraySort = new ArraySort(size);
	
	public void fillTab() {
		for (int i = 0; i < size; i++) {
			Random r = new Random();
			int value = r.nextInt(10000) + 1;
			bubbleSort.insert(value);
			selectSort.insert(value);
			insertSort.insert(value);
			shellSort.insert(value);
			quickSort.insert(value);
			arraySort.insert(value);
		}
	}
	
	public void fillSortTab() {
		int value = 0;
		for (int i = 0; i < size; i++) {
			bubbleSort.getTab()[i] = value;
			selectSort.getTab()[i] = value;
			insertSort.getTab()[i] = value;
			shellSort.getTab()[i] = value;
			quickSort.getTab()[i] = value;
			arraySort.getTab()[i] = value;
			value++;
		}
	}
	
	public void fillReverseSortTab() {
		
		for (int i = 0; i < bubbleSort.getTab().length / 2; i++) {
		     long temp = bubbleSort.getTab()[i];
		     bubbleSort.getTab()[i] = bubbleSort.getTab()[bubbleSort.getTab().length - 1 - i];
		     bubbleSort.getTab()[bubbleSort.getTab().length - 1 - i] = temp;
		}
		for (int i = 0; i < selectSort.getTab().length / 2; i++) {
		     long temp = selectSort.getTab()[i];
		     selectSort.getTab()[i] = selectSort.getTab()[selectSort.getTab().length - 1 - i];
		     selectSort.getTab()[selectSort.getTab().length - 1 - i] = temp;
		}
		for (int i = 0; i < insertSort.getTab().length / 2; i++) {
		     long temp = insertSort.getTab()[i];
		     insertSort.getTab()[i] = insertSort.getTab()[insertSort.getTab().length - 1 - i];
		     insertSort.getTab()[insertSort.getTab().length - 1 - i] = temp;
		}
		for (int i = 0; i < shellSort.getTab().length / 2; i++) {
		     long temp = shellSort.getTab()[i];
		     shellSort.getTab()[i] = shellSort.getTab()[shellSort.getTab().length - 1 - i];
		     shellSort.getTab()[shellSort.getTab().length - 1 - i] = temp;
		}
		for (int i = 0; i < quickSort.getTab().length / 2; i++) {
		     long temp = quickSort.getTab()[i];
		     quickSort.getTab()[i] = quickSort.getTab()[quickSort.getTab().length - 1 - i];
		     quickSort.getTab()[quickSort.getTab().length - 1 - i] = temp;
		}
		for (int i = 0; i < arraySort.getTab().length / 2; i++) {
		     long temp = quickSort.getTab()[i];
		     arraySort.getTab()[i] = arraySort.getTab()[arraySort.getTab().length - 1 - i];
		     arraySort.getTab()[arraySort.getTab().length - 1 - i] = temp;
		}
	}
	
	public void countTime() {
		startTime = System.nanoTime();
		bubbleSort.sort();
		bubbleTime = (double)(System.nanoTime() - startTime)/1000000;
		 
		startTime = System.nanoTime();
		selectSort.sort();
		selectTime = (double)(System.nanoTime() - startTime)/1000000;
	
		startTime = System.nanoTime();
		insertSort.sort();
		insertTime = (double)(System.nanoTime() - startTime)/1000000;
	
		startTime = System.nanoTime();
		shellSort.sort();
		shellTime = (double)(System.nanoTime() - startTime)/1000000;
	
		startTime = System.nanoTime();
		quickSort.sort();
		quickTime = (double)(System.nanoTime() - startTime)/1000000;
		
		startTime = System.nanoTime();
		arraySort.sort();
		arraySortTime = (double)(System.nanoTime() - startTime)/1000000;
	}
		
	public void showResults() {
		fillTab();
		countTime();
		System.out.println("\nSortowanie bąbelkowe: " + bubbleTime + " ms");
		System.out.println("Sortowanie przez wybór: " + selectTime + " ms");
		System.out.println("Sortowanie przez wstawienie: " + insertTime + " ms");
		System.out.println("Sortowanie Shella: " + shellTime + " ms");
		System.out.println("Sortowanie QuickSortem: " + quickTime + " ms");
		System.out.println("Sortowanie metodą Arrays.sort: " + arraySortTime + " ms");
	}
	
	public void showSortTabResults() {
		fillSortTab();
		countTime();
		//bubbleSort.display();
		//selectSort.display();
		//insertSort.display();
		//shellSort.display();
		//quickSort.display();
		arraySort.display();
		System.out.println("\nTablica posortowana rosnąco: ");
		System.out.println("\nSortowanie bąbelkowe: " + bubbleTime + " ms");
		System.out.println("Sortowanie przez wybór: " + selectTime + " ms");
		System.out.println("Sortowanie przez wstawienie: " + insertTime + " ms");
		System.out.println("Sortowanie Shella: " + shellTime + " ms");
		System.out.println("Sortowanie QuickSortem: " + quickTime + " ms");
		System.out.println("Sortowanie metodą Arrays.sort: " + arraySortTime + " ms");
	}

	public void showReverseSortTabResults() {
		fillReverseSortTab();
		//bubbleSort.display();
		//selectSort.display();
		//insertSort.display();
		//shellSort.display();
		//quickSort.display();
		arraySort.display();
		countTime();
		System.out.println("\nTablica posortowana malejąco: ");
		System.out.println("\nSortowanie bąbelkowe: " + bubbleTime + " ms");
		System.out.println("Sortowanie przez wybór: " + selectTime + " ms");
		System.out.println("Sortowanie przez wstawienie: " + insertTime + " ms");
		System.out.println("Sortowanie Shella: " + shellTime + " ms");
		System.out.println("Sortowanie QuickSortem: " + quickTime + " ms");
		System.out.println("Sortowanie metodą Arrays.sort: " + arraySortTime + " ms");
	}

}
