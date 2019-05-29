  import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<n;i++)
      {
       /* for(int j=0;j<=i;j++)
        {
          System.out.print(" ");
        }*/
        for(int l=n-i;l>=1;l--)
        {
          System.out.print(l); }
          System.out.println();}
	}
}