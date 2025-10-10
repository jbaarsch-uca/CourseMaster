package BaarschBytes;

import BaarschBytes.data.Course;
import BaarschBytes.data.CourseListing;
import BaarschBytes.data.Parser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    public ArrayList<Course> readFile(String fileName){

        //File csvFile = new File("src/main/resources/CSCI Courses.txt"); // Assuming data.json is in the project root
        ArrayList<Course> courses = new ArrayList();
        try {
            //Path path = Paths.get(fileName);
            // Read a single JSON object
           // List<String> contents = Files.readString(Path.of(fileName), StandardCharsets.UTF_8);

            Scanner scan = new Scanner(new File(fileName));
            List<String> lines = new ArrayList();
            //Files.readAllLines(path);
            while (scan.hasNextLine())
                lines.add(scan.nextLine());
            System.out.println(lines.size());


            courses = lines.stream()
                            .map(line -> line.split("\t"))
                            .peek(System.out::println)
                            .map(Parser::parseCourseData)
                            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

           // lines.stream()
            //        .map(line -> line.split("\t"))
           //         .forEach(line -> {for (String s : line)
             //           System.out.println(s);});


                    //.map(Parser::parseCourseData)
                    //.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

            System.out.println("Read Courses: ");
            int count = 0;
            for (Course c : courses) {
                count ++;
                System.out.println(count + " " + c.getNumber()
                        + "\t" + c.getName()
                        + "\t" + c.getDescription());
            }

            // If the JSON file contains an array of objects
            // List<Person> people = objectMapper.readValue(jsonFile, new TypeReference<List<Person>>() {});
            // System.out.println("Read People: " + people);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return courses;
    }

}
