package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    // Custom toString, equals, and hashCode methods:
    public Employer(String value) {
        super(value);
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
