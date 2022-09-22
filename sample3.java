package Forloopday7;

public class sample3 {
	public static void main(String[]args) {
		int num=157893;
		int total=0;
		for(;num>0;) {
			int reminder=num%10;
		total+=reminder;
		num/=10;
			
		}
		System.out.println(total);
		
	}

}
