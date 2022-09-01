import java.util.*;
class sumofintegers
  {
    public static void main(String args[])
    {
      int n,d,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
      n=sc.nextInt();
      
       while(n>0)
      {
      
        d=n%10;
        sum=sum+d;
        n=n/10;
        
      }
    System.out.println("sum of digits of positive integers:"+sum);
    }
  }
        