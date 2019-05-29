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
      int f=0;
      for(int j=0;j<=n/2;j++)
      {
        if(arr[j]!=arr[n-1-j])
        {
          f=1;
          break;}
      }
      if(f==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}