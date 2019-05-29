  import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in=new Scanner(System.in);
      String str=in.nextLine();
    String str1=in.nextLine();
    
      StringBuffer s=new StringBuffer(str);
       StringBuffer t=new StringBuffer(str1);
      int n=s.length();
    int n1=t.length();
    int c=0;
    for(int i=0;i<n-n1+1;i++)
    {
      int f=0;
      for(int j=0;j<n1;j++)
      {
        if(s.charAt(i+j)!=t.charAt(j)){
          f=1;break;}
      }
       if(f==0)
         c++;}
    System.out.println(c);
  } 
}