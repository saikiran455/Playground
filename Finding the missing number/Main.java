import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n+1];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      
       for(int j=1;j<=n;j++)
       {
         int f=0;
         for(int k=0;k<n;k++)
         {
           if(j==arr[k])
             f=1;
         }
         if(f==0)
           System.out.println(j);
       }
    }
}