  import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int k=in.nextInt();
      for(int j=0;j<n;j++)
      {
        for(int l=j+1;l<n;l++)
        {
          if((arr[j]+arr[l])==k)
            System.out.println(arr[j]+", "+arr[l]);
        }
      }
    }
}