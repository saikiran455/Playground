 /*package whatever //do not write package name here */
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in =new Scanner(System.in);
		int len=in.nextInt();
		 for (int i = 0; i < len; i++) 
    { 
        int j = len - 1 - i; 
        for (int k = 0; k < len; k++) 
        { 
            if (k == i || k == j) 
                System.out.print("*"); 
            else
                System.out.print(" "); 
        } 
        System.out.println(""); 
    } 
	}
}
 