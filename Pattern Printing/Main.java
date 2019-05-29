import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int r=in.nextInt();
      int l=in.nextInt();
      int c=l;
      for(int i=0;i<r;i++)
      {
        c=l;
        if(i==0){
        for(int s=0;s<c;s++)
          System.out.print(l);}
        else{
        for(int j=0;j<i;j++){
        System.out.print(c--);
          //if(j!=i-2)
            //c--;
        }
        
        for(int k=0;k<l-i;k++)
          System.out.print(c);}
        System.out.println();
      }
        
    }
}