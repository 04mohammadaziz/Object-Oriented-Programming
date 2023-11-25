//import java.util.Date;
public class DateApptask {
static int min = 10, max = 20, average = 5; 
static String myrole = "Driver";
static byte myfirstByte = 22;
static double pi = 3.14159;
static char mychar = 'N';
    public static void main(String[] args) {
        //Date todaysdate = new Date();

        //System.out.println(todaysdate);
        //System.out.println("I am now the "+myrole);
        //System.out.println("Our minimum score is "+min);
        //System.out.println("We have a byte "+myfirstByte);
        //System.out.println("And double type is "+pi);
        //System.out.println("A char looks like "+mychar);
       
       //int count = 1;
        //while(count <= 10){
            //System.out.println(todaysdate);
            //count = count + 1;

        //for (int count = 1; count <= 25; count++){
              //System.out.println(todaysdate);

       for(int row = 1; row <= 5; row++){
           for(int column = 1; column <= 10; column++){
              System.out.print(row * column + "\t");
           }
           System.out.println ();
           }
       }
    }

