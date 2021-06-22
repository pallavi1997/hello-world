package Day3;

import java.util.Scanner;

//to print only odd numbers
public class Program6 {

	public static void main(String[] args) {
		
		int i,n;		
		System.out.print("Enter n value:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(i=0;i<=n;i++)
        {
        	if(i%2 !=0)
        	{
        		System.out.printf("%d ",i);
        	}
        }
	}
}
