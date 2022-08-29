import java.util.Scanner;

class celsius
  {
    public static void main(String args[])
    {
      float fahrenheit;
      float celsius;
      Scanner sc=new Scanner(System.in);
      System.out.println("the given fahrenheit is:");
      fahrenheit=sc.nextFloat();
      
      celsius=((fahrenheit-32)*5)/9;

      
      System.out.println("temperature in celsius is :"+celsius);
    }
    
  }