package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private  int id;
    private static int nextId = 1;

    private String name;
    private  Employer employer;
    private  Location location;
    private  PositionType positionType;
    private  CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

//    @Override
//    public String toString() {
//        String nameValue = (name.isEmpty()) ? "Data not available" : name;
//        String employerValue = (employer.getValue().isEmpty()) ? "Data not available" : employer.toString();
//        String locationValue = (location.getValue().isEmpty()) ? "Data not available" : location.toString();
//        String positionTypeValue = (positionType.getValue().isEmpty()) ? "Data not available" : positionType.toString();
//        String coreCompetencyValue = (coreCompetency.getValue().isEmpty()) ? "Data not available" : coreCompetency.toString();
//
//        return "\nID: " + id +
//                "\nName: " + nameValue +
//                "\nEmployer: " + employerValue +
//                "\nLocation: " + locationValue +
//                "\nPosition Type: " + positionTypeValue +
//                "\nCore Competency: " + coreCompetencyValue +
//                "\n";
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public PositionType getPositionType() {
        return positionType;
    }
    public void positionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public Location getLocation() {
        return location;
    }

    public void Location(Location location) {
        this.location = location;

    }


        public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;

    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String dNA = "Data not available";

        if (name.equals("")) {
             name = dNA;
        }

        if (employer.getValue() == null || employer.getValue().equals("")) {
            employer.setValue(dNA);
        }

        if (location.getValue() == null|| location.getValue().equals("")) {
            location.setValue(dNA);
        }

        if (positionType == null || positionType.equals("")) {
            positionType.setValue(dNA);
        }


        if (coreCompetency == null || coreCompetency.equals("")) {
            coreCompetency.setValue(dNA);
        }
        String output = String.format (
                "ID: %d\n"+
                        "Name: %s\n"+
                        "Employer: %s\n"+
                        "Location: %s\n"+
                        "Position Type: %s\n"+
                        "Core Competency: %s\n", id, name, employer, location, positionType, coreCompetency);

return output;
    }
    }

