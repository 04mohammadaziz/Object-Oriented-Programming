import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This class is used for Lab5.
 */
public class Lab5 {
    /**
     * This main method runs the program.
     */
    public static void main(String[] args) {
        // 3. The ArrayList Class
        System.out.println("\n3. The ArrayList Class");
        
        // 1 - 4
        
        ArrayList<Integer> intArray = new ArrayList<>(5);

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt(100); // [0; 99]
            intArray.add(number);
        }
        System.out.println("\nintArray: " + intArray);
        
        ArrayList<Integer> revIntArray = new ArrayList<>();
        for (Integer number: intArray)  {
            revIntArray.add(0, number);
        }

        System.out.print("\nrevIntArray: ");
        System.out.println(revIntArray);
        
        // 1 - 7
        
        ArrayList<HourlyEmployee> hourlyEmployees = 
                        new ArrayList<>(100);
        
        hourlyEmployees.add(new HourlyEmployee("Smart Guy",
                new Date(2005, Calendar.JUNE, 16),
                80, 20));
        hourlyEmployees.add(new HourlyEmployee("Funny Guy",
                new Date(2015, Calendar.OCTOBER, 2),
                50, 10));
        hourlyEmployees.add(new HourlyEmployee("Serious Guy",
                new Date(2016, Calendar.APRIL, 10),
                180, 2));
        hourlyEmployees.add(new HourlyEmployee("Awesome Guy",
                new Date(2025, Calendar.MARCH, 28),
                20, 80));

        System.out.println("\nHourly Employees:\n");
        System.out.println(hourlyEmployees);

        System.out.print("\nHourly Employees, size: ");
        System.out.println(hourlyEmployees.size());
        
        HourlyEmployee newEmployee = 
                new HourlyEmployee("Cool Guy",
                        new Date(2022, Calendar.MARCH, 1),
                        25, 40);
        hourlyEmployees.set(0, newEmployee);

        System.out.println("\nUpdated Hourly employees:\n");
        System.out.println(hourlyEmployees);
    
        HourlyEmployee removedEmployee = 
                hourlyEmployees.remove(2);
        System.out.println("\nRemoved Employee:\n\n" + removedEmployee);
    
        hourlyEmployees.trimToSize();

        System.out.println("\nTrimmed Hourly Employees:\n\n" + hourlyEmployees);
        
        
        // 4. Creating a Generic Class
        System.out.println("\n4. Creating a Generic Class");
        
        // 5 - 6
        
        Pair<String> pair1 = new Pair<>("Smith", "Johnson");
        Pair<String> pair2 = new Pair<>("Smith", "Johnson");
        Pair<String> pair3 = new Pair<>("Martinez", "Garcia");

        System.out.println("\nPair1 equals Pair2 (must be true): " +
                    pair1.equals(pair2));
        System.out.println("Pair2 equals Pair1 (must be true): " +
                pair2.equals(pair1));
        
        System.out.println("\nPair1 equals Pair3 (must be false): " +
                pair1.equals(pair3));
        System.out.println("Pair3 equals Pair1 (must be false): " +
                pair3.equals(pair1));

        System.out.println("\nPair2 equals Pair3 (must be false): " +
                pair2.equals(pair3));
        System.out.println("Pair3 equals Pair2 (must be false): " +
                pair3.equals(pair2));
    
        
        // 3 - 5
        
        Triple<String, Double> trip1 = 
                new Triple<>("Hamburg", 500.8, "Houston");
        Triple<String, Double> trip2 =
                new Triple<>("Hamburg", 500.8, "Houston");
        Triple<String, Double> trip3 =
                new Triple<>("Caracas", 325.24, "Rome");

        System.out.println("\nTrip 1: " + trip1);
        System.out.println("Trip 2: " + trip2);
        System.out.println("Trip 3: " + trip3);

        System.out.println();
        System.out.println("\ntrip1 equals trip2 (must be true): " +
                trip1.equals(trip2));
        System.out.println("trip2 equals trip1 (must be true): " +
                trip2.equals(trip1));

        System.out.println("\ntrip1 equals trip3 (must be false): " +
                trip1.equals(trip3));
        System.out.println("trip3 equals trip1 (must be false): " +
                trip3.equals(trip1));

        System.out.println("\ntrip2 equals trip3 (must be false): " +
                trip2.equals(trip3));
        System.out.println("trip3 equals trip2 (must be false): " +
                trip3.equals(trip2));
    }
}