package hometask3;

public class Task5 {

	public static void main(String[] args) {

		double [] numbArray = {5.6, 5.4, 8.5, 33.7, 94, 64.7, 1.7, -8, 888};
		
		double small = numbArray[0];
		double large = numbArray[0];
		
		for (int i = 1; i < numbArray.length; i++) {
			
			if(numbArray[i] < small) {
				
				small = numbArray[i];
				
			}
			
			if(numbArray[i] > large) {
				
				large = numbArray[i];
				
			}
			
			
		}
		
		System.out.println("the smallest element is " + small);
		System.out.println("the largest element is " + large);
		
	}

}
