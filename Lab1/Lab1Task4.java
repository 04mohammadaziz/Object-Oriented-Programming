import java.util.Scanner;

public class Lab1Task4 {
     static int a;
     static int b;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lab1Task4 obj = new Lab1Task4();
        System.out.println("Enter integer: ");
        obj.a = input.nextInt();
        System.out.println("Enter integer: ");
        obj.b = input.nextInt();
        input.close();

        for(int i = 1; i<=20; i++) {
      System.out.println(a + " x " + i + " = " +(obj.a * i));
    }
    for(int row = 1; row <= b; row++){
      for(int column = 1; column <= 20; column++){
        System.out.print(row * column + "\t");
      }
      System.out.println();
    }
  }
}
