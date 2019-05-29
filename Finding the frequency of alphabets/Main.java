 import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int n=str.length();
      int ar[]=new int[100];
      char ch[]=new char[n];
      for(int j=0;j<n;j++){
        ar[j]=0;}
      
        
        
      for(int i=0;i<n;i++)
      {
        if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
        int of=str.charAt(i)-'a';
          ar[of]++;}
        else{
          int ko=str.charAt(i)-'A';
          ar[ko]++;}
      }
      for(int w=0;w<n;w++)
      {
        if(str.charAt(w)>='a'&&str.charAt(w)<='z'){
        int o=str.charAt(w)-'a';
        if(ar[o]>0)
        {
          
          System.out.print(str.charAt(w)+""+ar[o]+" ");
            ar[o]=0;}
        }
            else{
                 int k=str.charAt(w)-'A';
                 if(ar[k]>0){
                     char c=(char) ('a'+k);
                  System.out.print(c+""+ar[k]+" ");
                  ar[k]=0;}
                
            
            
        }
      } 
    }
}