package dataclasses.java.model;

import java.time.LocalDate;
import java.util.Objects;

public class Attorney {
    private long attorneyID;
    private String name;
    private String address;
    private LocalDate birthday;
    private String attorneyType;

    public Attorney(long attorneyID, String name, String address, LocalDate birthday, String attorneyType) {
        this.attorneyID = attorneyID;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.attorneyType = attorneyType;
    }

    public long getAttorneyID() {
        return attorneyID;
    }

    public void setAttorneyID(long attorneyID) {
        this.attorneyID = attorneyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAttorneyType() {
        return attorneyType;
    }

    public void setAttorneyType(String attorneyType) {
        this.attorneyType = attorneyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attorney attorney = (Attorney) o;
        return attorneyID == attorney.attorneyID &&
                Objects.equals(name, attorney.name) &&
                Objects.equals(address, attorney.address) &&
                Objects.equals(birthday, attorney.birthday) &&
                Objects.equals(attorneyType, attorney.attorneyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attorneyID, name, address, birthday, attorneyType);
    }

    @Override
    public String toString() {
        return "Attorney{" +
                "attorneyID=" + attorneyID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", attorneyType='" + attorneyType + '\'' +
                '}';
    }
}
