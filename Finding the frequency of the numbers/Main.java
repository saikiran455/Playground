import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n+1];
      int f[]=new int[k+1];
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();}
      for(int j=0;j<k;j++){
        f[j]=0;}
      for(int y=0;y<n;y++)
      {
        int g=arr[y];
        f[g-1]=(f[g-1])+1;
      }
     for(int l=0;l<k;l++){
        System.out.println(l+1+" "+f[l]);}
      
    }
}