package dataclasses.java.model;

import java.time.LocalDate;
import java.util.Objects;

public class CaseEvent {
    private long eventId;
    private String eventName;
    private LocalDate eventDate;
    private String eventDescription;

    public CaseEvent(long eventId, String eventName, LocalDate eventDate, String eventDescription) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaseEvent caseEvent = (CaseEvent) o;
        return eventId == caseEvent.eventId &&
                Objects.equals(eventName, caseEvent.eventName) &&
                Objects.equals(eventDate, caseEvent.eventDate) &&
                Objects.equals(eventDescription, caseEvent.eventDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventName, eventDate, eventDescription);
    }

    @Override
    public String toString() {
        return "CaseEvent{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventDescription='" + eventDescription + '\'' +
                '}';
    }
}
