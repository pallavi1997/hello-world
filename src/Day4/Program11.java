package Day4;
//Given a string print the unique words of the string.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program11 {

	public static void main(String[] args) {
		
	        String str = "apple banana mango grape lichi mango apple grape"; 
	        String[] words = str.split(" ");  
	        List<String> uniqueWords = new ArrayList<String>(Arrays.asList(words));
	         
	        for(int i=1; i<uniqueWords.size(); i++) 
	        {
	            for(int j=0;j<i;j++) 
	            {
	                if(uniqueWords.get(i).equals(uniqueWords.get(j))) 
	                {
	                    uniqueWords.remove(i);
	                    i--;
	                    break;
	                }
	            }
	        }
	        for(String s: uniqueWords) {
	            System.out.println(s);
	        }
	}
}
