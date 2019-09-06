package dataclasses.java.model;

import java.util.List;

public class CourtCaseStub {
    private String caseID;
    private String caseType;
    private String caseStatus;
    private String caseYear;
    private List<Charge> charges;
    private List<Defendant> defendants;
    private List<Attorney> attorneys;
    private List<CaseEvent> caseEvents;
}
