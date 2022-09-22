package Forloopday7;

public class paliyandrom {
	public static void main(String[]args) {
		String a="wow";
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		System.out.println(temp);
		if(a.equals(temp)) {
			System.out.println("is paliyandrom");		
	}
	else {
		System.out.println("is not a paliyandrom");
	}
	}

}
