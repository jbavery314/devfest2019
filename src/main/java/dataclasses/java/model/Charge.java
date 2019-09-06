package dataclasses.java.model;

import java.time.LocalDate;
import java.util.Objects;

public class Charge {
    private int chargeType;
    private String severity;
    private LocalDate filingDate;
    private String status;

    public Charge(int chargeType, String severity, LocalDate filingDate, String status) {
        this.chargeType = chargeType;
        this.severity = severity;
        this.filingDate = filingDate;
        this.status = status;
    }

    public int getChargeType() {
        return chargeType;
    }

    public void setChargeType(int chargeType) {
        this.chargeType = chargeType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public LocalDate getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(LocalDate filingDate) {
        this.filingDate = filingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Charge charge = (Charge) o;
        return chargeType == charge.chargeType &&
                Objects.equals(severity, charge.severity) &&
                Objects.equals(filingDate, charge.filingDate) &&
                Objects.equals(status, charge.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeType, severity, filingDate, status);
    }

    @Override
    public String toString() {
        return "Charge{" +
                "chargeType=" + chargeType +
                ", severity='" + severity + '\'' +
                ", filingDate=" + filingDate +
                ", status='" + status + '\'' +
                '}';
    }
}
