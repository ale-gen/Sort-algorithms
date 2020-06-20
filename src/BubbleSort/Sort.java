package BubbleSort;

public abstract class Sort {
	
	private long[] tab;
	private int itemsNumber;
	
	public Sort(int size) {
		tab = new long[size];
		itemsNumber = 0;
	}

	public long[] getTab() {
		return tab;
	}

	public void setTab(long[] tab) {
		this.tab = tab;
	}

	public int getItemsNumber() {
		return itemsNumber;
	}

	public void setItemsNumber(int itemsNumber) {
		this.itemsNumber = itemsNumber;
	}
	
	public void insert(long value) {
		tab[itemsNumber] = value;
		itemsNumber++;
	}

	public void display() {
		for (int i = 0; i < getItemsNumber(); i++) 
			System.out.print(getTab()[i] + " ");
		System.out.println();
		
	}
	
	public void swap(int one, int two) {
		long temp = getTab()[one];
		getTab()[one] = getTab()[two];
		getTab()[two] = temp;
	}

}
