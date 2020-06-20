package Project_Main;

public class Project_Main {
	
	public static void main(String[] args) {
		
		Research1 research1 = new Research1();
		System.out.println("Sortowanie tablicy 10.000 elementowej: ");
		research1.showResults();
		research1.showSortTabResults();
		research1.showReverseSortTabResults();
		
		Research2 research2 = new Research2();
		System.out.println("\nSortowanie tablicy 100.000 elementowej: ");
		research2.showResults();
		research2.showSortTabResults();
		research2.showReverseSortTabResults();
		
		Research3 research3 = new Research3();
		System.out.println("\nSortowanie tablicy 1.000.000 elementowej: ");
		research3.showResults();
		research3.showSortTabResults();
		research3.showReverseSortTabResults();
		
		
	}
}
