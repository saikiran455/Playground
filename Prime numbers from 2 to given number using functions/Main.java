import java.util.Scanner;
class Main{
  public static void pri(int n)
  {
   for(int i=2;i<=n;i++)
   {
     int f=0;
     for(int j=1;j<=i;j++)
     {
     if(i%j==0)
       f++;
     }
     if(f<3)
       System.out.println(i);
   }
   }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      pri(n);
	}
}