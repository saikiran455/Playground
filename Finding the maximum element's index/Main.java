import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	     arr[i]=in.nextInt();
	 }
	int max=arr[0];
	 int id=0;
	 for(int j=1;j<n;j++)
	 {
	     if(arr[j]>max){
	         max=arr[j];
	         id=j;}
	     }
	     System.out.println(id);
	 
  }
}