  import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuffer s=new StringBuffer(str);
       StringBuffer t=new StringBuffer("");
      int n=s.length();
      int f=0;
      for(int i=0;i<n/2;i++)
      {
        char ch=s.charAt(i);
       char fh=s.charAt(n-1-i);
        if(ch!=fh)
        {
         f=1;
          break;}
      }
      if(f==0)
        System.out.println("Yes");
      else
        System.out.println("No");
          
    } 
}