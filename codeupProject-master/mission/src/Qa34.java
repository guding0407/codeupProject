import java.util.Scanner;

public class Qa34

{

  public static void main(String[] args)

  {

    // 입력받는 부분

    int a;

    String b;



    Scanner sc = new Scanner(System.in);

    b=sc.nextLine();

    a=Integer.valueOf(b, 8);

    sc.close();

    

    System.out.format("%d\n", a);

   }

} 
