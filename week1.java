import java.util.Scanner;
class week1
  {
  public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
      switch(n)
     {
        case 1:
    System.out.println("Monday");
           break;
        case 2:
    System.out.println("tuesday");
           break;
        case 3:
    System.out.println("wednesday");
           break;
        case 4:
    System.out.println("thrusday");
           break;       
           case 5:
    System.out.println("friday");
           break; 
         case 6:
    System.out.println("sat");
           break;
        case 7:
    System.out.println("sunday");
           break;    
        default:
       System.out.println("wrong choice");   
     } 
    }
  }