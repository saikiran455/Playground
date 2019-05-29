import java.util.Scanner;
import java.lang.Math.*;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c=1;
      int k=n;
      while(k>0)
      {
        c++;
        k=k/10;
      }
       c--;
      int m=n,sum=0,l=0;
      for(int i=0;i<c;i++)
      {
         l=m%10;
         int f=1;
        for(int j=1;j<=c;j++)
          f=f*l;
         
        sum=sum+f;
        m=m/10;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
        
	}
}