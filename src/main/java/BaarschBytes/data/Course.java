package BaarschBytes.data;

import java.util.*;

public class Course implements Prerequisite {

    private String name;
    private String description;
    private String program;
    private String number;
    private List<Prerequisite> prerequisites;
    private int catalogYear;


    public Map<String, String> getAttributes(){
        Map<String, String> attributes = new HashMap();
        attributes.put("Name", name);
        attributes.put("Description", description);
        attributes.put("Program", program);
        attributes.put("Number", number);
        attributes.put("Catalog Year", String.valueOf(catalogYear));
        return attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Prerequisite> getPrerequisites() {
        if (prerequisites == null)
            setPrerequisites(new ArrayList<Prerequisite>());
        return prerequisites;
    }

    public void setPrerequisites(List<Prerequisite> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public int getCatalogYear() {
        return catalogYear;
    }

    public void setCatalogYear(int catalogYear) {
        this.catalogYear = catalogYear;
    }
    public String toString() {
        return this.getProgram() + this.getNumber() + ": " + this.getName();
    }

}
