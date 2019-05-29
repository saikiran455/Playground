import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int s1=in.nextInt();
      int s2=in.nextInt();
      int f=0;
      for(int j=0;j<n;j++)
      {
        if(s1==arr[j]){
          System.out.println(j);
        f=1;}
      }
      int k=0;
       for(int h=0;h<n;h++)
      {
        if(s2==arr[h]){
          System.out.println(h);
          k=1;}
      }
    
  if(f==0){
    System.out.println(-1);}
  if(k==0){
    System.out.println(-1);}
}}