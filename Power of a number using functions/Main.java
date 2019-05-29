import java.util.Scanner;
class Main{
  public static int pow(int n,int m)
  {
    int sum=1;
    for(int i=0;i<m;i++)
    {
      sum=sum*n;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      System.out.println(pow(n1,n2));
      
	}
}