import java.util.*;
class reversenumber
  {
    public static void main(String args[])
    {
      int n,r=0,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value:");
      n=sc.nextInt();
      
      while(n>0)
      {
        d=n%10;
        r=r*10+d;
        n=n/10;
      }
      System.out.println("reverse number:"+r);
    }
  }
        