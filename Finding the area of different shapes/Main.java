import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
       Scanner in=new Scanner(System.in);
	    int ch=in.nextInt();
	    int a,l,b,m,n,r;
	    switch(ch)
	    {
	        case 1:
	             a=in.nextInt();
	            
	            System.out.println(a*a);
	            break;
	       case 2:
	            l=in.nextInt();
	            b=in.nextInt();
	           System.out.println(l*b);
	           break;
	       case 3:
	           m=in.nextInt();
	           n=in.nextInt();
	           System.out.println(0.5*m*n);
	           break;
	       case 4:
	           r=in.nextInt();
	           System.out.println(3.14*r*r);
	           break;
	           default :
	           break;
	    }
	           
    }
}