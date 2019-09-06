package dataclasses.java.model;

import java.util.Objects;

public class Defendant {
    private long defendantId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;

    public Defendant(long defendantId, String firstName, String lastName, String middleName, String phoneNumber) {
        this.defendantId = defendantId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
    }

    public long getDefendantId() {
        return defendantId;
    }

    public void setDefendantId(long defendantId) {
        this.defendantId = defendantId;
    }

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Defendant defendant = (Defendant) o;
        return defendantId == defendant.defendantId &&
                Objects.equals(firstName, defendant.firstName) &&
                Objects.equals(lastName, defendant.lastName) &&
                Objects.equals(middleName, defendant.middleName) &&
                Objects.equals(phoneNumber, defendant.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defendantId, firstName, lastName, middleName, phoneNumber);
    }

    @Override
    public String toString() {
        return "Defendant{" +
                "defendantId=" + defendantId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
