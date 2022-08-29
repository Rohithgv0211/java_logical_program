import java.util.Scanner;
class Currentbill
  {
  public static void main(String args[])
    {
    int Cno; 
    int PMR,LMR;
    String Cname; 
    float Tu;
       double Cb,bill;
    Scanner sc=new Scanner(System.in);
      System.out.println("The consumer number is:");
      Cno=sc.nextInt();
      System.out.println("The consumer name is:");
      Cname=sc.next();
      System.out.println("the present month reading is:");
      PMR=sc.nextInt();
      System.out.println("the last month reading is:");
      LMR=sc.nextInt();
      Tu=PMR-LMR;
      Cb=Tu*3.80;
      System.out.println("the consumer number is:"+Cno);
      System.out.println("the consumer name is:"+Cname);
      System.out.println("the present month reading is:"+PMR);
      System.out.println("the last month reading is:"+LMR);
      System.out.println("the total units is:"+Tu);
      System.out.println("the current bill is:"+Cb);
      
      if(Tu<=50)
        bill=Tu*3.40;
        
      else if(Tu<=100)
        bill=50*3.40+(Tu-50)*4.56;
        
       else if(Tu<=200)
        bill=50*3.40+50*4.56+(Tu-100)*5.43;
         
       else if(Tu<=300)
        bill=50*3.40+50*4.56+100*5.43+(Tu-200)*6.54;
         
       else if(Tu>300)
        bill=50*3.40+50*4.56+100*5.43+200*6.54+(Tu-300)*7.54;
      
      else
         System.out.println("the current bill Cb:");
      }
  }