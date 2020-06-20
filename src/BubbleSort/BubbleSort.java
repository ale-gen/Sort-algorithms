package BubbleSort;

public class BubbleSort extends Sort{
	
	public BubbleSort(int size) {
		super(size);
	}
	
	public void sort() {
		
		for (int i = getItemsNumber() -1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (getTab()[j] > getTab()[j+1]) {
					swap(j, j+1);
				}
			}
		}
	}
	
	
	

}
