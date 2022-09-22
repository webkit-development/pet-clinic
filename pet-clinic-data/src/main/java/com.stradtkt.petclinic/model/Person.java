package src.main.java.com.stradtkt.petclinic.model;

import src.main.java.com.stradtkt.petclinic.model.BaseEntity;

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
