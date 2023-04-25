package org.launchcode.techjobs.mvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

public class TechJobsController {

    static Map<String,String> actionChoices = new HashMap<>();
    //--done TODO Super Bonus, moved columnChoices from ListController
    static HashMap<String, String> columnChoices = new HashMap<>();

    public TechJobsController(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
    }

    @ModelAttribute("actions")
    public static Map getActionChoices(){
        return actionChoices;
    }
}
