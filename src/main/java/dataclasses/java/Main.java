package dataclasses.java;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dataclasses.java.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(buildCase()));
    }

    private static CourtCase buildCase() {
        return new CourtCase("AKDEK44353AF",
                "Traffic",
                "Closed",
                "1999",
                List.of(buildCharge(), buildCharge()),
                new ArrayList<Defendant>(),
                List.of(buildAttorney(), buildAttorney(), buildAttorney()),
                new ArrayList<CaseEvent>());
    }

    private static Attorney buildAttorney() {
        return new Attorney(546515, "Chuck Yaeger", "123 Sesame St.", LocalDate.now(), "Prosecutor");
    }

    private static Charge buildCharge() {
        return new Charge(2, "F1", LocalDate.now(), "dismissed");
    }
}
