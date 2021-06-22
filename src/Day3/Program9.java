package Day3;
//Given an array of integers check the Fibonacci series.

public class Program9 {
	
	public static void main(String[] args) {
		
		int f1,f2,f,n,i;
		f1=0;
		f2=1;
		n=10;
		System.out.printf("%d %d",f1,f2);
		for(i=0;i<n;i++) {
		if(n>0){
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			System.out.printf(" %d",f);
	}  
		}
	}		
}

