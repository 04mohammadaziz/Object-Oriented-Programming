import java.util.Scanner;

public class WorkHourApp {
    public int hoursperday;
    public int numdays;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WorkHourApp obj = new WorkHourApp();
        System.out.println("Your Work Hours: ");
        obj.hoursperday = input.nextInt();
        System.out.println("Your Work Day: ");
        obj.numdays = input.nextInt();
        input.close();

        for(int i = 1; i <= obj.numdays; i++) {
            System.out.println("Total Hours worked = " +i + " Day * " +obj.hoursperday + " hours = " +(i*obj.hoursperday) + " hours ");
        }
    }
}
