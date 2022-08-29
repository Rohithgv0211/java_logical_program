import java.util.Scanner;

class bill
  {
      public static void main(String args[])
    {
      int pno;
      String pname;
      double pcost;
      double pqty;
      double bill;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("the given pno is:");
      pno=sc.nextInt();
      System.out.println("the given pname is:");
      pname=sc.next();
      System.out.println("the given pcost is:");
      pcost=sc.nextDouble();
      System.out.println("the given pqty is:");
      pqty=sc.nextDouble();
      
      bill=pcost*pqty;
      
      System.out.println("the given pno is:"+pno);
      System.out.println("the given pname is:"+pname);
      System.out.println("the given pcost is:"+pcost);
      System.out.println("the given pqty is:"+pqty);
      System.out.println("the given bill is:"+bill);
      
    }
  }
   
    