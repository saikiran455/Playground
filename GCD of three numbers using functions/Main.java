import java.util.Scanner;
public class Main{
 public static int gcd(int i,int j , int k)
 {
int least;
least = i;
while(!( (i == j) && (j == k) ) )
{
i = (i == 0 ? least : i);
j = (j == 0 ? least : j);
k = (k == 0 ? least : k);
if(i <= j)
{
if(i <= k)
least = i;
else
least = k;
}
else
{
if(j <= k)
least = j;
else
least = k;
}
i = i % least;
j = j % least;
k = k % least;
}
return least;

}
	public static void main (String[] args)
	{
	    // Type your code here
   Scanner in=new Scanner(System.in);
      int i=in.nextInt();
      int j=in.nextInt();
      int k=in.nextInt();
 


int g;


g = gcd(i , j , k);
System.out.println(g);


}


 
	
}