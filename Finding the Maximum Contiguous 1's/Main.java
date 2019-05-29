  import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int a[]=new int[n];
      int c=0,l=0,f=0;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int j=0;j<n;j++)
      {
        if(arr[j]==1)
        {
          c++;
        }
        else
          f=1;
        if(f==1){
          a[l++]=c;
          c=0;f=0;}
        if(j==n-1){
          a[l++]=c;
          c=0;f=0;}
      }
      int max=a[0];
      for(int m=1;m<l;m++)
      {
        if(max<a[m])
          max=a[m];
      }
      System.out.println(max);
    }
}