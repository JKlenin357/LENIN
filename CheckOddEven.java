package Forloopday7;

public class CheckOddEven {
	public static void main(String[]args) {
		int num=10;
		int evenCount=0;
		int oddCount=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i+"is a even num");
				evenCount++;
			}
		
		else {
			System.out.println(i+"is a odd num");
			oddCount++;
		}
		}
		System.out.println("Even num="+evenCount);
		System.out.println("odd num="+oddCount);
		
			
	}
}
