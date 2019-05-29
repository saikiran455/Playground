import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n,sum=0;
      while(num>0)
      {
        int l=num%10;
        int r=1;
        for(int i=1;i<=l;i++)
        {
          r=r*i;
        }
        //System.out.println(r);        
        sum=sum+r;
        num=num/10;
      }
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
        
        
	}
}