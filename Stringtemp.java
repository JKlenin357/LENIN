package Forloopday7;

public class Stringtemp {
	public static void main(String[]args) {
		String a="onesoft";
		String temp=" ";
		/*int b=7;
		int temp=0;*/
		for(int i=0;i<a.length();i++) {
			temp=temp+a.charAt(i);
			System.out.println(temp);
		}
		System.out.println(temp);
	}

}
