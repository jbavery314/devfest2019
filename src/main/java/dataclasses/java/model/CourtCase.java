package dataclasses.java.model;

import java.util.List;
import java.util.Objects;

public class CourtCase {
    private String caseID;
    private String caseType;
    private String caseStatus;
    private String caseYear;
    private List<Charge> charges;
    private List<Defendant> defendants;
    private List<Attorney> attorneys;
    private List<CaseEvent> caseEvents;

    public CourtCase(String caseID, String caseType, String caseStatus, String caseYear, List<Charge> charges, List<Defendant> defendants, List<Attorney> attorneys, List<CaseEvent> caseEvents) {
        this.caseID = caseID;
        this.caseType = caseType;
        this.caseStatus = caseStatus;
        this.caseYear = caseYear;
        this.charges = charges;
        this.defendants = defendants;
        this.attorneys = attorneys;
        this.caseEvents = caseEvents;
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getCaseYear() {
        return caseYear;
    }

    public void setCaseYear(String caseYear) {
        this.caseYear = caseYear;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    public List<Defendant> getDefendants() {
        return defendants;
    }

    public void setDefendants(List<Defendant> defendants) {
        this.defendants = defendants;
    }

    public List<Attorney> getAttorneys() {
        return attorneys;
    }

    public void setAttorneys(List<Attorney> attorneys) {
        this.attorneys = attorneys;
    }

    public List<CaseEvent> getCaseEvents() {
        return caseEvents;
    }

    public void setCaseEvents(List<CaseEvent> caseEvents) {
        this.caseEvents = caseEvents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourtCase courtCase = (CourtCase) o;
        return Objects.equals(caseID, courtCase.caseID) &&
                Objects.equals(caseType, courtCase.caseType) &&
                Objects.equals(caseStatus, courtCase.caseStatus) &&
                Objects.equals(caseYear, courtCase.caseYear) &&
                Objects.equals(charges, courtCase.charges) &&
                Objects.equals(defendants, courtCase.defendants) &&
                Objects.equals(attorneys, courtCase.attorneys) &&
                Objects.equals(caseEvents, courtCase.caseEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseID, caseType, caseStatus, caseYear, charges, defendants, attorneys, caseEvents);
    }

    @Override
    public String toString() {
        return "CourtCase{" +
                "caseID='" + caseID + '\'' +
                ", caseType='" + caseType + '\'' +
                ", caseStatus='" + caseStatus + '\'' +
                ", caseYear='" + caseYear + '\'' +
                ", charges=" + charges +
                ", defendants=" + defendants +
                ", attorneys=" + attorneys +
                ", caseEvents=" + caseEvents +
                '}';
    }
}
