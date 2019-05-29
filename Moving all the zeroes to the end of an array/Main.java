import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
       int a[]=new int[n];
       int z[]=new int[n];
      int c=0,k=0;
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int j=0;j<n;j++)
      {
        if(arr[j]==0)
        {
          z[c]=arr[j];
          c++;
        }
        else
        {
          a[k]=arr[j];
          k++;
        }
      }
      for(int g=0;g<k;g++)
      {
        arr[g]=a[g];
      }
      int b=0;
      for(int d=k;d<n;d++)
      {
        arr[d]=z[b++];}
    
    for(int h=0;h<n;h++){
      System.out.print(arr[h]+" ");}
    }
}