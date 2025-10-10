package BaarschBytes.data;

import java.util.ArrayList;
import java.util.List;

public class Parser {



    public static Course parseCourseData(String[] parts) {
        for (String part : parts)
            System.out.println(part);
        Course course = new Course();

        course.setNumber(parts[0]);

        course.setName(parts[1]);

        course.setDescription(parts[2]);
        course.setProgram("CSCI");
        course.setCatalogYear(2025);

        course.setPrerequisites(parsePrerequisites(parts[3]));


    return course;

    }

    private static List<Prerequisite> parsePrerequisites(String prereqs) {
        List<Prerequisite> prerequisites =  new ArrayList();
        if (prereqs.equalsIgnoreCase("none"))
            return prerequisites;
        while (prereqs.contains("CSCI")){
            Course course = new Course();
            course.setProgram("CSCI");
            int index = prereqs.indexOf("CSCI");
            course.setNumber(prereqs.substring(index + 5, index + 9 ));
            prerequisites.add(course);
            prereqs = prereqs.substring(0, index) + prereqs.substring(index+ 9);
        }
        while (prereqs.contains("MATH")){
            Course course = new Course();
            course.setProgram("MATH");
            int index = prereqs.indexOf("MATH");
            course.setNumber(prereqs.substring(index + 5, index + 9 ));
            prerequisites.add(course);
            prereqs = prereqs.substring(0, index) + prereqs.substring(index+ 9);
        }
        if (prereqs.toLowerCase().contains("junior"))
            prerequisites.add(NonCoursePrerequisite.junior);
        if (prereqs.toLowerCase().contains("senior"))
            prerequisites.add(NonCoursePrerequisite.senior);
        if (prereqs.toLowerCase().contains("consent"))
            prerequisites.add(NonCoursePrerequisite.instructorConsent);
        if (prereqs.toLowerCase().contains("60 or more"))
            prerequisites.add(NonCoursePrerequisite.sixtyCredits);
        if (prereqs.toLowerCase().contains("c or better"))
            prerequisites.add(NonCoursePrerequisite.cOrBetter);

        return prerequisites;

    }

}
