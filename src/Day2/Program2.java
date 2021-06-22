package Day2;
// Print first 10 prime numbers
public class Program2 {
	
	public static void main(String[] args)   
    {  
        int c=0,i=1,j=1;  
        for(i=1; i<10; i++)  
        {  
            c=0;  
            for(j=1; j<=i; j++)   
            {  
                if(i%j==0)  
                c++;  
            }  
            if(c==2)  
            {  
                System.out.printf("%d ",i);  
            }  
        }  
        
    }  

}
