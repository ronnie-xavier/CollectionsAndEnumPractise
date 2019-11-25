package com.company.ronnie;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum WorkDays {
    MON("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THU("Thursday"),
    FRI("Friday");

    private String dayFullName;

    //the getter - notice the naming -  is required only if the attribute is private!
    public String dayFullName() {
        return dayFullName;
    }

    WorkDays(String day) {
        this.dayFullName = day;
    }

    public static Map<String ,String> getAllWorkDays() {
        return Arrays.stream(WorkDays.values()).collect(Collectors.toMap(WorkDays::name,WorkDays::dayFullName));

    }
}
