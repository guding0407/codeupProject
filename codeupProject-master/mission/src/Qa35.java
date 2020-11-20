import java.util.Scanner;

public class Qa35

{

  public static void main(String[] args)

  {

    // 입력받는 부분

    int a;

    String b;



    Scanner sc = new Scanner(System.in);

    b=sc.nextLine();

    a=Integer.valueOf(b, 16);

    sc.close();

    

    System.out.format("%o\n", a);

   }

} 
