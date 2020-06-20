package BubbleSort;

public class InsertSort extends Sort {
	
	public InsertSort(int size) {
		super(size);
	}
	
	public void sort() {
		
		int i, j;
		for (i = 1; i < getItemsNumber(); i++) {
			long temp = getTab()[i];
			j = i;
			while (j > 0 && getTab()[j - 1] >= temp) {
				getTab()[j] = getTab()[j - 1];
				--j;
			}
			getTab()[j] = temp;
		}
	}

}
