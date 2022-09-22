package Forloopday7;

public class sample4 {
	public static void main(String[]args) {
		String c="lenin";
		
		for(int i=0;i<c.length();i++) {
		if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u') {
			continue;
		}
		else {
			System.out.println(c.charAt(i));
		}
			
		}
	}
}
