import java.util.Scanner;
class Factorial2
  {
    public static void main(String[] args)
    {
      int n,fact=1;
      
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    
      while(n>=1)
        {
          fact=fact*n;
          n--;

        }
        System.out.println("the factorial number is:"+fact);
      
        
    }
  }