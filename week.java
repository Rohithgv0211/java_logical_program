import java.util.Scanner;
class week 
  {
  public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    
    if(n==1)
    System.out.println("Monday");
      
           else if(n==2)
        System.out.println("Tuesday");
      else if(n==3) 
        System.out.println("wednesday");
      else if(n==4) 
        System.out.println("thursday");
      else if(n==5) 
        System.out.println("Friday");
      else if(n==6) 
        System.out.println("sat");
      else if(n==7) 
        System.out.println("sunday");
      
     else
    
       System.out.println("wrong choice");     
      
           
    }
  }
