package dataclasses.kotlin.model

data class CourtCase (
        var caseID: String,
        var caseType: String,
        var caseStatus: String,
        var caseYear: String,
        var charges: MutableList<Charge>,
        var defendants: MutableList<Defendant>,
        var attorneys: MutableList<Attorney>,
        var caseEvents: MutableList<CaseEvent>
)