package Day3;

import java.util.Scanner;

//move all even numbers to the beginning of the array
public class Program7 {

	public static void main(String[] args) {
		
		int i,n,k,j;		
		System.out.print("Enter size of the array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter a array");
        for (k = 0; k < n; k++) 
        {
            a[k] = sc.nextInt();
        }
        
        for (i=0; i<n; i++)   
        {  
        	
            if(a[i]%2==0 )
                {
                    System.out.println(a[i]);
                }
        }
            for (i=0; i<n; i++)    
            {  
            	if(a[i]%2!=0)
            	{
            		 System.out.println(a[i]);
            	}		
            }
            	
        }
        
	}
