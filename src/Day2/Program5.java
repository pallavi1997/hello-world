package Day2;

import java.util.Scanner;

//Sorting array of elements
public class Program5 {

	public static void main(String[] args)   
    {  
        int i,j,n,k;
        System.out.print("Enter no. of elements you want in array:");
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         int a[] = new int[n];
         System.out.println("Enter a array");
         for (k = 0; k < n; k++) 
         {
             a[k] = sc.nextInt();
         }
        System. out. println("Array Elements:");
        for(i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Sorted a array is ");
        for (i=0; i<n; i++)   
        {  
            for (j=(i+1); j<n; j++)   
            {  
                int temp;
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
