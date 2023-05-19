package org.launchcode.techjobs.oo;

import java.util.Objects;


public abstract class JobField {

    private static int nextId = 1;

    private int id;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField that = (JobField) o;
        return id == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isFieldEmpty () {
        return value.isEmpty();
    }
}

