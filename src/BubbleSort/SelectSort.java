package BubbleSort;

public class SelectSort extends Sort{
	
	public SelectSort(int size) {
		super(size);
	}
	
	public void sort() {
		
		for (int i = 0; i < getItemsNumber() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < getItemsNumber(); j++) {
				if (getTab()[min] > getTab()[j]) {
					min = j;
				}
				swap(min, i);
			}
		}
	}

}
