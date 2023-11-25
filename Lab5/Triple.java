/**
 * Represents an object that holds
 * three values: the first and the third have the same
 * type and the second value has a different type.
 * 
 * the type parameter, the type of the first and the third values.          
 * the type parameter, the type of the second value.           
 */
public class Triple<T, M> {
    private T first;
    private M second;
    private T third;

    /**
     * Constructor. Creates a Triple object.
     * 
     * first the first value.
     * second the second value.
     * third the third value.
     */
    public Triple(T first, M second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * Returns true if and only if both triples have the same content.
     *
     * otherTriple the other triple. 
     * return true if both triples are equal.
     */
    public boolean equals(Object otherTriple)  {
        if (!(otherTriple instanceof Triple))  {
            return false;
        }
        
        Triple other = (Triple) otherTriple;
        return first.equals(other.first) &&
                    second.equals(other.second) &&
                    third.equals(other.third);
    }

    /**
     * Returns the values of the three instance variables.
     * 
     * return the values of the three instance variables.
     */
    public String toString()  {
        return first + " " + second +
                    " " + third;
    }
}