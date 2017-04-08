package esys.webapp.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String street;
    private int number;
    private String postalCode;
    private String city;

    protected Local() {}

    public Local(String name, String street, int number, String postalCode, String city) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return String.format(
                "%s %d, %s %s",
                street, number, postalCode, city);
    }

    @Override
    public String toString() {
        return String.format(
                "Local[id=%d, name='%s', address='%s %d, %s %s']",
                id, name, street, number, postalCode, city);
    }

}
