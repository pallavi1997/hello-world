package Day4;
//Given a string print the reverse of the string.

public class Program12 {

	public static void main(String[] args) {
		
		String str = "madam 123";
		char result[]=str.toCharArray();
		
		for (int i = result.length - 1; i >= 0; i--)
            System.out.print(result[i]);

	}

}
