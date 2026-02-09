package com.techouts.Asessment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employe{
    String departmentId;
    String name;
    Employe(String d,String n){
        departmentId = d;
        name=n;
    }
}

public class GroupingEmployees {
    public static void main(String[] args) {
        List<Employe> list = new ArrayList<>();
        list.add(new Employe("1","rahul"));
        list.add(new Employe("2","Ram"));
        list.add(new Employe("3","Bob"));

        Map<String,List<Employe>> ans=list.stream()
                .collect(Collectors.groupingBy(
                        person->person.departmentId,
                        Collectors.toList()
                ));


    }
}
