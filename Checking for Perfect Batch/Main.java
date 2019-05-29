 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
		    arr[i]=in.nextInt();
		}
		int k=n/3,sum=0;
		for(int j=1;j<=3;j++)
		{
		    sum=sum+arr[j];
		}
    int b=0;
		for(int l=1;l<k;l++)
		{
		    int r=0;
		    for(int f=3*l+1;f<=3*(l+1);f++)
		    {
		        r=r+arr[f];
		    }
		   // System.out.println(r);
          
          
		    if(sum!=r){
		        System.out.println("Not a Perfect Batch");
		        
              b=1;
              break;
              
		    }
		}
            if(b==0)
		    System.out.println("Perfect Batch");
		    
  }
}