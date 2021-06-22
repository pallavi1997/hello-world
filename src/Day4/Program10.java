package Day4;
//Given an array of integers check the Palindrome of the series

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		int i,n;	
		int r, rev, num;
		System.out.print("Enter size of the array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter a array");
        for(i=0;i<n;i++) 
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++) {
        rev=0;
        num=a[i];
        while (a[i] != 0) {
            r = a[i] % 10;
            rev = rev * 10 + r;
            a[i] /= 10;
        }
        if (num == rev)
            System.out.printf("%d is a palindrome.\n", num);
        else
        	System.out.printf("%d is not a palindrome.\n",num);
        }
	}

}
