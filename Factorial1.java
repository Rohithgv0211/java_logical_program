import java.util.Scanner;
class Factorial1
  {
    public static void main(String[] args)
    {
      int n,fact=1;
      
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    
      for( ;n>=1;n--)
        {
          
          fact=fact*n;
        }
      
       System.out.println("the factorial number is:"+fact);
    }
  }