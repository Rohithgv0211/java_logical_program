import java.util.Scanner;
  class Student
    
  {
    public static void main(String args [])
    {
      int sno;
      String sname;
      int stsub1;
       int stsub2;
       int stsub3;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given STUDENT Number is:");
      sno=sc.nextInt();
      System.out.println("The Given STUDENT Name is:");
      sname=sc.next();
      System.out.println("The Given SUBJECT_1 MARKS is:");
      stsub1=sc.nextInt();
       System.out.println("The Given SUBJECT_2 MARKS is:");
      stsub2=sc.nextInt();
       System.out.println("The Given SUBJECT_3 MARKS is:");
      stsub3=sc.nextInt();

      int total;
      total=stsub1+stsub2+stsub3;
      double ave;
      ave=(total/3);
       
      System.out.println("The Given STUDENT Number is:"+sno);
      System.out.println("The Given STUDENT Name is:"+sname);
      System.out.println("The Given SUBJECT_1 MARKS is:"+stsub1);
      System.out.println("The Given SUBJECT_2 MARKS is:"+stsub2);
      System.out.println("The Given SUBJECT_3 MARKS is:"+stsub3);
      System.out.println("The Given VALUE OF TOTAL is:"+total);
      System.out.println("The Given Average is:"+ave);

      if(stsub1>=40 && stsub2>=40 && stsub3>=40)
      {
        System.out.println("student pass");
      
      if (ave<50)
         System.out.println("the student got C grade") ;
      else if (ave>=50 && ave<=70)
         System.out.println("the student got B grade");
      else if(ave>70 && ave<80)
        System.out.println("the student got A grade");
      else if(ave>80)
        System.out.println("the student got A+ grade");
      }
      else
      System.out.println("student fail"); 
      
      
    }
  }