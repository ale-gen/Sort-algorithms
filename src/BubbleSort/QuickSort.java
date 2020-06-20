package BubbleSort;

public class QuickSort extends Sort { 
	
	public QuickSort(int size) {
		super(size);
	}
	
	public void sort() {
		recQuickSort(0, getItemsNumber() - 1);
	}
	
	public void recQuickSort(int left, int right) {
		int size = right - left + 1;
		if (size <= 3) {
			manualSort(left, right);
		} else {
			long pivot = medianOf3(left, right);
			int partition = partition(left, right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}
	
	public long medianOf3(int left, int right) {
		int center = (left + right) / 2;
		
		if (getTab()[left] > getTab()[right]) 
			swap(left, right);
		
		if (getTab()[right] < getTab()[center]) 
			swap(center, right);
		
		if (getTab()[left] > getTab()[center])
			swap(left, center);
		
		swap(center, right - 1);
		
		return getTab()[right - 1];
	}
	
	public int partition(int left, int right, long pivot) {
		int leftPosition = left;
		int rightPosition = right -1;
		
		while (true) {
			
			while (getTab()[++leftPosition] < pivot);
			
			while (getTab()[--rightPosition] > pivot);
			
			if (leftPosition >= rightPosition)
				break;
			else 
				swap(leftPosition, rightPosition);	
		}
		swap(leftPosition, right - 1);
		return leftPosition;
	}
	
	public void manualSort(int left, int right) {
		int size = right - left + 1;
		
		if (size <= 1) 
			return;
		if (size == 2) {
			if (getTab()[left] > getTab()[right]) 
				swap(left, right);
			return;
		} else {
			if (getTab()[left] > getTab()[right - 1]) 
				swap(left, right - 1);
			if (getTab()[left] > getTab()[right])
				swap(left, right);
			if (getTab()[right - 1] > getTab()[right])
				swap(right - 1, right);
		}
	}
}
