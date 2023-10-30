package hometask3;

public class Task4 {
	
	public static void main(String[] args) {

		//що виводить на екран найближче до 10 з двох чисел, записаних в змінні m і n. 
		//Наприклад, серед чисел 8,5 і 11,45 найближче до десяти 11,45.
		
		whatIsCloserToTen(7, -4);
		
		
	}
	
	public static void whatIsCloserToTen(double m, double n) {
		
		double a = 0; //відстань між 10 та m
		double b = 0; //відстань між 10 та n
		
		if(m == n) {
			
			System.out.println("числа рівні, отже вони на однаковій відстані від 10");
			
		} else {
			
			if(m < 0) {
				
				a = Math.abs(m) + 10;			
				
			}
			
			if(n < 0) {
				
				b = Math.abs(n) + 10;			
				
			}
			
			if (m >=0) {
				
				a = Math.abs(10 - m);
				
				
			}
			
			if (n >=0) {
				
				b = Math.abs(10 - n);
				
			}
			
			System.out.println((a < b) ? m + " є ближче до 10" : n + " є ближче до 10");

			
		}
		
		
		
	}

}
