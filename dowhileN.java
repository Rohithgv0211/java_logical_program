import java.util.Scanner;
class dowhileN
  {
    public static void main(String[] args)
    {
      int n;
      
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    
      do
        {
          System.out.println(n);
          n++;
        }
        while(n<=0);

    }
  }