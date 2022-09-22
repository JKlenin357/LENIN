package Forloopday7;

public class Primenum {
	

	public static void main(String[]args) {
		int num=39; 
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
		if(isPrime==true) {
			System.out.println("isPrime num");
				
			}
		else {
			System.out.println("not a is Prime");
		}
	}

}
