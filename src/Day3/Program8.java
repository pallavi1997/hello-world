package Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Print the unique numbers and also print the number of occurrences of duplicate numbers in a two-dimensional array.
public class Program8 {
	public static void main(String[] args) {

			int arr[]= {1,5,8,38,4,1,5,6,5,1};
			Map<Integer,Integer>storemap=new HashMap<Integer,Integer>();
			for(int name:arr) 
			{
				Integer count=storemap.get(name);
				if(count==null) {
					storemap.put(name, 1);}
				else {
					storemap.put(name, ++count);
				}
			}
			Set<Entry<Integer, Integer>> entryset=storemap.entrySet();
			for(Entry<Integer,Integer> entry:entryset) {
				if(entry.getValue()==1) {
					System.out.println(entry.getKey()+" is unique Number");
				}
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+" is duplicate number ");
				}
			}
	}
}
