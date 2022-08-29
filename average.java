import java.util.Scanner;

class average 
  {
      public static void main(String args[])
    {
      int sno;
      String sname;
      int maths1;
      int maths2;
      int maths3;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("the given sno is:");
      sno=sc.nextInt();
      System.out.println("the given sname is:");
      sname=sc.next();
      System.out.println("the given m1 is:");
      maths1=sc.nextint();
      System.out.println("the given m2 is:");
      maths2=sc.nextint();
      System.out.println("the given m3 is:");
      maths3=sc.nextint();
      
       int to;
      to=ssub1+ssub2+ssub3;
      double ave;
      ave=(to/3);
      
      System.out.println("the given sno is:"+sno);
      System.out.println("the given sname is:"+sname);
      System.out.println("the given m1 is:"+maths1);
      System.out.println("the given m2 is:"+maths2);
      System.out.println("the given m3 is:"+maths3);
      System.out.println("the given value of total is:"+to);
      System.out.println("the given averageis:" +ave);
    

      
    }
  }
   
    