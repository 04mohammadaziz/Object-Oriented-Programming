/**
 * This class is used to store dates.
 */
public class Activity {
    private int day;
    private int month;
    private int year;

    /**
     * Default constructor.
     */
    public Activity()  {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * This constructor is used to initialize instance
     * variables.
     */
    public Activity(int dayIn, int monthIn, int yearIn)  {
        /*
         first sets the default values,
         by calling the default constructor
         */
        this();
        setDate(dayIn, monthIn, yearIn);
    }



    // accessors

    /**
     * Accessor method. Returns the day.
     */
    public int getDay() {
        return day;
    }

    /**
     * Accessor method. Returns the month.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Accessor method. Returns the year.
     */
    public int getYear() {
        return year;
    }

    // mutators

    /**
     * Helper method. Determines if the given
     * day is valid.
     *
     * true if the day is valid, false otherwise.
     */
    private boolean isValidDay(int day, int month)  {
        if (day < 1)  {
            return false;
        }

        if (month == 2 && day > 28)  {
            return false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)  {
            return false;
        }

        return  day <= 31;
    }

    /**
     * Helper method. Determines if the given
     * month is valid.
     *
     * true if the month is valid, false otherwise.
     */
    private boolean isValidMonth(int month)  {
        return month >= 1 && month <= 12;
    }

    /**
     * Helper method. Determines if the given
     * year is valid.
     *
     * true if the year is valid, false otherwise.
     */
    private boolean isValidYear(int year)  {
        return  year >= 1;
    }

    /**
     * Updates the date, by separately
     * updating the day, the month and the year.
     *
     * An update to an instance variable only happens
     * if the provided value is valid.
     */
    public void setDate(int dayIn, int monthIn, int yearIn)  {
        setYear(yearIn);
        setMonth(monthIn);
        setDay(dayIn, getMonth());
    }

    /**
     * Helper method. Sets the day, if the
     * given value is valid.
     */
    private void setDay(int day, int month)  {
        if (isValidDay(day, month))  {
            this.day = day;
        }
        else  {
            System.out.println("Error: invalid day!");
        }
    }

    /**
     * Helper method. Sets the month, if the
     * given value is valid.
     */
    private void setMonth(int month)  {
        if (isValidMonth(month))  {
            this.month = month;
        }
        else  {
            System.out.println("Error: invalid month!");
        }
    }

    /**
     * Helper method. Sets the year, if the
     * given value is valid.
     */
    private void setYear(int year)  {
        if (isValidYear(year))  {
            this.year = year;
        }
        else  {
            System.out.println("Error: invalid year!");
        }
    }

    /**
     * Prints the date information.
     */
    public void printDate()  {
        /*
        a new line is added at the end of this
        print statement, because otherwise the output
        would be hard to distinguish from the output
        of the test methods.
         */
        System.out.printf("%d.%d.%d%n",
                getDay(), getMonth(), getYear());
    }
}