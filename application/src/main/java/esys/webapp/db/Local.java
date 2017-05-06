package esys.webapp.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private int number;
    private String postalCode;
    private String city;
    private String description;
    private String ownerId;

    public Local() {}

    public Local(String name, String street, int number, String postalCode, String city, String description, String ownerId) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.description = description;
        this.ownerId = ownerId;
    }

    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getStreet() {
        return this.street;
    }
    public int getNumber() {
        return this.number;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    public String getCity() {
        return this.city;
    }
    public String getDescription() {
        return this.description;
    }
    public String getOwnerId() {
        return ownerId;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getAddress() {
        return String.format(
                "%s %d, %s %s",
                this.street, this.number, this.postalCode, this.city);
    }

    @Override
    public String toString() {
        return String.format(
                "Local[id=%d, name='%s', address='%s %d, %s %s']",
                id, name, street, number, postalCode, city);
    }

}
