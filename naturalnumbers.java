import java.util.Scanner;
class naturalnumbers
  {
    public static void main(String[] args)
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    
      for( i=1;i<=n;i++)
        {
          System.out.println(i);
        }
    }
  }