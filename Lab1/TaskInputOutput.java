import java.util.Scanner;
public class TaskInputOutput {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner (System.in);
        System.out.println("enter the first integer");
        int a = obj.nextInt();
        System.out.println("enter the second integer");
        int b = obj.nextInt();
        System.out.println("the addition of the number is: "+(a+b));
        System.out.println("the mul of the number is: "+(a*b));
    }
}
