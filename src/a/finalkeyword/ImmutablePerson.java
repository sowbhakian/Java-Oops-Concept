package a.finalkeyword;
import java.util.Date;

//No setter can modify state
//No internal data can be altered indirectly
//The object is thread-safe by design

public final class ImmutablePerson {

    private final String name;
    private final Date dob;

    /**
     * Constructor to create an immutable Person object.
     * Creates defensive copies to ensure immutability.
     * @param name the person's name
     * @param dob the person's date of birth
     */
    public ImmutablePerson(String name, Date dob) {
        this.name = name;
        this.dob = new Date(dob.getTime()); // defensive copy
    }

    /**
     * Gets the person's name.
     * @return the person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the person's date of birth.
     * Returns a defensive copy to maintain immutability.
     * @return a copy of the person's date of birth
     */
    public Date getDob() {
        return new Date(dob.getTime()); // defensive copy
    }
}
