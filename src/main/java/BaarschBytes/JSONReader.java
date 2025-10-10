package BaarschBytes;
import BaarschBytes.data.CourseListing;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONReader {


    public void readFile(String fileName){
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File("course_list.json"); // Assuming data.json is in the project root

            try {
                // Read a single JSON object
                List<CourseListing> courseListings = objectMapper.readValue(jsonFile, new TypeReference<List<CourseListing>>(){});

                System.out.println("Read Courses: ");
                int count = 0;
                for (CourseListing cl : courseListings) {
                    count ++;
                    System.out.println(count + " " + cl.getCourseNumber()
                            + "\t" + cl.getCourseTitle()
                    + "\t" + cl.getFaculty()[0].getDisplayName()
                    + "\t" + ((cl.getSectionAttributes().length > 0)?
                            cl.getSectionAttributes()[0].getDescription() : "") );
                }

                // If the JSON file contains an array of objects
                // List<Person> people = objectMapper.readValue(jsonFile, new TypeReference<List<Person>>() {});
                // System.out.println("Read People: " + people);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }








