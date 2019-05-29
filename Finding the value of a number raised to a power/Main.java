import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in =new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int sum=1;
      while(e!=0)
      {
        sum=sum*b;
        e--;
      }
      System.out.println(sum);
    }
}