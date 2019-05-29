  import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code  
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n+1];
     int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int s=arr[0];
    int y=0,f=0,l=0;
    for(int j=1;j<n;j++)
    {
      if(arr[y]<arr[j])
      {
        s=s+arr[j];
        // System.out.println(s);
      }
      else
      {
        f=1;
      }
      y++;
      if(f==1){
        a[l++]=s;
         //System.out.println(s);
        s=arr[j];f=0;
      }
      if(j==n-1){
        a[l++]=s;
         //System.out.println(s);
        s=arr[j];f=0;
      }
    }
    int max=a[0];
    for(int v=0;v<l;v++)
    {
      if(max<a[v])
      max=a[v];}
      System.out.println(max);
    
   // System.out.println(max);
        
        
    
  }
}