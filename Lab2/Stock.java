/**
 * This class describes the daily
 * value of a stock for
 * each of the hours the market
 * is open.
 */
public class Stock {
    // previous attributes from the Activity class

    private int day;
    private int month;
    private int year;

    // new attributes

    private String name;
    private int[] values = new int[7];

    /**
     * Default constructor.
     */
    public Stock()  {
        this.year = 1;
        this.month = 1;
        this.day = 1;

        name = "";
        for (int i = 0; i < values.length; i++) {
            values[i] = 0;
        }
    }

    /**
     * This constructor updates the attributes,
     * if the provided values are valid.
     * Else the attribute is left unchanged and
     * an error is displayed.
     *
     */
    public Stock(int dayIn, int monthIn, int yearIn,
                 String nameIn, int[] valIn)  {
        // first sets the default values
        this();

        // sets the name instance variable
        setName(nameIn);

        // checks and sets values array
        if (valIn.length != 7)  {
            System.out.println("Error: values should have" +
                    " 7 elements!");
        }
        else {
            boolean goodValues = true;

            // check if there are negative values
            for (int i = 0; i < valIn.length; i++) {
                if (valIn[i] < 0) {
                    System.out.println("Error: negative values " +
                            "are not allowed!");
                    goodValues = false;
                    break;
                }
            }

            // only update values, if none are negative
            if (goodValues) {
                for (int i = 0; i < values.length; i++) {
                    this.values[i] = valIn[i];
                }
            }
        }

        // checks and sets date
        setDate(dayIn, monthIn, yearIn);
    }

    // accessors

    /**
     * Accessor method. Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method. Returns the value at a given index.
     * the value at a given index, -1 if the index
     * is invalid.
     */
    public int getValue(int ind)  {
        if (isValidIndex(ind))  {
            return values[ind];
        }

        System.out.println("Error: index out of bounds!");
        return -1;
    }

    /**
     * A helper method, determines if the given index
     * is valid.
     *
     * true if the index is valid, false otherwise.
     */
    private boolean isValidIndex(int ind)  {
        return ind >= 0 && ind < values.length;
    }

    // mutators

    /**
     * Mutator method. Updates the name.
     */
    public void setName(String nameIn) {
        this.name = nameIn;
    }

    /**
     * Mutator method. Update a value at a given index.
     * If the value is negative or the index is not valid,
     * the value is not updated.
     *
     */
    public void setValue(int val, int ind)  {
        if (val < 0)  {
            System.out.println("Error: negative value " +
                    "is not allowed!");
            return;
        }

        if (!isValidIndex(ind))  {
            System.out.println("Error: index out of bounds!");
            return;
        }

        values[ind] = val;
    }

    /**
     * Prints stock data:
     * the date, and the values.
     */
    public void printStock()  {
        System.out.printf("%s: %d.%d.%d " +
                        "values:%n",
                getName(), getDay(), getMonth(),
                getYear());

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);

            if (i < values.length - 1)  {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Calculates and returns the
     * average value of the stock.
     *
     */
    public int getMean()  {
        int sum = 0;

        for (int value: values)  {
            sum += value;
        }

        return sum / values.length;
    }

    /**
     * This method returns the value
     * that is returned by the getMean method.
     */
    public int getMeanValue()  {
        return getMean();
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

    /**
     * The method was taking from the
     * Activity class. Prints the date
     * of this object.
     */
    public void printDate()  {
        System.out.printf("%d.%d.%d",
                getDay(), getMonth(), getYear());
    }

    // copied from Activity class

    /**
     * Helper method. Determines if the given
     * day is valid.
     *
     *true if the day is valid, false otherwise.
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
     *true if the month is valid, false otherwise.
     */
    private boolean isValidMonth(int month)  {
        return month >= 1 && month <= 12;
    }

    /**
     * Helper method. Determines if the given
     * year is valid.
     *
     *true if the year is valid, false otherwise.
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
     *
     */
    public void setDate(int dayIn, int monthIn, int yearIn)  {
        setYear(yearIn);
        setMonth(monthIn);
        /*
        updates the day, given the current month,
        which is not necessarily equal to the provided
        monthIn value.
         */
        setDay(dayIn, getMonth());
    }

    /**
     * Helper method. Sets the day, if the
     * given value is valid.
     *
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
     *
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
     *
     */
    private void setYear(int year)  {
        if (isValidYear(year))  {
            this.year = year;
        }
        else  {
            System.out.println("Error: invalid year!");
        }
    }
}