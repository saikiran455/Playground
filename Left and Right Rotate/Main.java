import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
          Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int arr[]=new int[n];
	 int odd[]=new int[n];
	 int even[]=new int[n];
	 int c=0,k=0;
	 for(int i=0;i<n;i++)
	 {
	     arr[i]=in.nextInt();
	 }
	 int r=in.nextInt();
   for(int j=0;j<n;j++)
   {
       if((j+1)%2==0)
       {
           even[c]=arr[j];
           c++;
       }
       else{
           odd[k]=arr[j];
            k++;
            }
   }
   /* for(int p=0;p<k;p++)
	 {
	     System.out.println(odd[p]);
	 }*/
   for(int ro=0;ro<r;ro++)
   {
       int q=even[0];
	 for(int l=1;l<c;l++)
	 {
	     even[l-1]=even[l];
	 }
		even[c-1]=q;
	}
	/* for(int p=0;p<c;p++)
	 {
	     System.out.println(even[p]);
	 }*/
	 for(int rok=0;rok<r;rok++)
   {
       int d=odd[k-1];
	 for(int ll=k-1;ll>0;ll--)
	 {
	     odd[ll]=odd[ll-1];
	 }
		odd[0]=d;
	}
	/* for(int p=0;p<k;p++)
	 {
	     System.out.println(odd[p]);
	 }
	 for(int p=0;p<c;p++)
	 {
	     System.out.println(even[p]);
	 }*/
	int h=0,e=0;
	 for(int ii=0;ii<n;ii++)
	 {
	     if((ii+1)%2==0){
	     arr[ii]=even[h];h++;}
	     else{
	         arr[ii]=odd[e];e++;
	     }
	 }
	
	 for(int p=0;p<n;p++)
	 {
	     System.out.print(arr[p]+" ");
	 }
	
	
	
  	}
}