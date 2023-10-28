package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public int getId() {
        return id;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;


    }

    // TODO: Write a custom toString() method that formats the data
    @Override
    public String toString() {
        String newline = System.lineSeparator();
        StringBuilder allJobInfo = new StringBuilder();
            allJobInfo.append(newline);
            allJobInfo.append("ID: ");
            if (id != 0) {
                allJobInfo.append(id);
            } else {
                allJobInfo.append("Data not available");
            }
            allJobInfo.append(newline);

            allJobInfo.append("Name: ");
            if (name != null && !name.isEmpty()) {
                allJobInfo.append(name);
            } else {
                allJobInfo.append("Data not available");
            }
            allJobInfo.append(newline);

        allJobInfo.append("Employer: ");
        if (getEmployer().getValue() != null && !getEmployer().getValue().isEmpty()) {
            allJobInfo.append(getEmployer().getValue());
        } else {
            allJobInfo.append("Data not available");
        }
        allJobInfo.append(newline);

        allJobInfo.append("Location: ");
        if (getLocation().getValue() != null && !getLocation().getValue().isEmpty()) {
            allJobInfo.append(getLocation().getValue());
        } else {
            allJobInfo.append("Data not available");
        }
        allJobInfo.append(newline);

        allJobInfo.append("Position Type: ");
        if (getPositionType().getValue() != null && !getPositionType().getValue().isEmpty()) {
            allJobInfo.append(getPositionType().getValue());
        } else {
            allJobInfo.append("Data not available");
        }
        allJobInfo.append(newline);

        allJobInfo.append("Core Competency: ");
        if (getCoreCompetency().getValue() != null && !getCoreCompetency().getValue().isEmpty()) {
            allJobInfo.append(getCoreCompetency().getValue());
        } else {
            allJobInfo.append("Data not available");
        }
        allJobInfo.append(newline);

        return allJobInfo.toString();
    }
}
