   import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int l=0;l<i;l++)
        {
          System.out.print(num+" ");
          num++;}
          System.out.println();}
	}
}