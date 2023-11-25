/**
 * Represents an object that
 * holds two values of the same type.
 * 
 * the type parameter.
 */
public class Pair<T> {
    private T first;
    private T second;

    /**
     * Constructor. Creates a Pair object.
     *
     * the first value.
     * the second value.
     */
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Returns true if and only if both pairs have the same content.
     * 
     * the other pair. return true if both pairs are equal.
     */
    public boolean equals(Object otherPair)  {
        if (!(otherPair instanceof Pair))  {
            return false;
        }
        
        Pair other = (Pair) otherPair;
        return first.equals(other.first) &&
                    second.equals(other.second);
    }

    /**
     * Returns the String with the 
     * first and the second values in this Pair.
     * 
     * @return the String with this Pair's values.
     */
    public String toString()  {
        return first.toString() + " " +
                    second.toString();
    }
}