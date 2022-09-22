package Forloopday7;

public class Sample5 {
	public static void main(String[]args) {
		String b="starkhouse";
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='k') {
				break;
			}
			else {
				System.out.println(b.charAt(i));
			}
		}
	}

}
