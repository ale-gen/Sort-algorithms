package BubbleSort;

public class ShellSort extends Sort { 
	
	public ShellSort(int size) {
		super(size);
	}
	
	public void sort() {
		
		int i, j;
		long temp;
		int h = 1;
		
		while(h <= getItemsNumber()/3)
			h = h * 3 + 1;
		
		while (h > 0) {
			
			for (i = h; i < getItemsNumber(); i++) {
				temp = getTab()[i];
				j = i;
				
				while (j > h - 1 && getTab()[j - h] >= temp) {
					getTab()[j] = getTab()[j - h];
					j -= h;
				}
				getTab()[j] = temp;
			}
			h = (h - 1)/3;
		}
	}

}
