package hellow;

public class repo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="prashanth", rev = "";
		char c;
		for(int i=0;i<name.length();i++) {
			c=name.charAt(i);
			rev=c+rev;
		}
		
		System.out.println(rev);
	}

}
