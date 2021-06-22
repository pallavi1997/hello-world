package Day5;
//Please implement a function that accepts two string parameters say ‘Parameter1’ & ‘Parameter2’ 
//and gives the output of the number of times the ‘Parameter1’ occurs in ‘Parameter2’
public class Program2 {

	public static void main(String[] args) {

		String str = "Jhon is great and bill is also great";
		String str1 = "great";

		int count = occurrences(str, str1);
		System.out.printf("%s is repeated %d times in the string '%s'\n",str1 ,count, str);
		}
	
	public static int occurrences(String para1, String para2) 
	{	
		int index = para1.indexOf(para2);  
		int c=1;
		if(index >= 0 )
		{
			c++;
		}
		return c;
	}			 
}



