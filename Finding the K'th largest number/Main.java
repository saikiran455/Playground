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
      int l=in.nextInt();
      for(int j=0;j<n;j++)
      {
        
        for(int k=j+1;k<n;k++)
        {
          if(arr[k]<arr[j])
          {
            int temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
          }
        }
        
      }
      
      System.out.println(arr[n-l]);
    }   
}