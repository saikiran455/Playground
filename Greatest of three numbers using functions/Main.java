import java.util.Scanner;
class Main{
  public static int maxof2(int m,int n)
  {
    if(m>n)
      return m;
    else
      return n;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int r=maxof2(n1,n2);
      if(r>n3)
        System.out.println(r);
      else
         System.out.println(n3);
        
	}
}