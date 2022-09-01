import java.util.*;
class perfectnumber
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
      n=sc.nextInt();
    
        while(i<n)
      {
        if(n%i==0)
        sum=sum+i;
        i++;
        
      }
      if(sum==n)
      {
    System.out.println("perfect number:"+n);
      }
      else
      {
        System.out.println("Not a perfect number:"+n);
      }
    }
  }
