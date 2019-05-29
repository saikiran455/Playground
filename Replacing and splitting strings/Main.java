import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      int c=in.nextInt();
      s1=s2;
      
      int n=s1.length();
      for(int i=0;i<n;i++)
      {
        if(s1.charAt(i)==' '&&c!=0){
          System.out.println();c--;}
        else
          System.out.print(s1.charAt(i));
      }
    }
}