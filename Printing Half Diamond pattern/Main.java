 import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=0;j<n-i;j++)
        {
          System.out.print(" ");
        }
        for(int l=1;l<i*2;l++)
        {
          System.out.print("*"); }
          System.out.println();}
	}
}