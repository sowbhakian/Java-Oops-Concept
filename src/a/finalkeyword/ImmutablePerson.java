package a.finalkeyword;
import java.util.Date;

//No setter can modify state
//No internal data can be altered indirectly
//The object is thread-safe by design

public final class ImmutablePerson {

    private final String name;
    private final Date dob;

    public ImmutablePerson(String name, Date dob) {
        this.name = name;
        this.dob = new Date(dob.getTime()); // defensive copy
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime()); // defensive copy
    }
}
