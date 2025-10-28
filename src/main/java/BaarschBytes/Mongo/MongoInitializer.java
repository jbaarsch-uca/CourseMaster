package BaarschBytes.Mongo;

import BaarschBytes.data.Course;
import BaarschBytes.data.Prerequisite;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MongoInitializer {

    private MongoConnector connection;
    private MongoDatabase database;


    public void initializeDB() {
        connection = new MongoConnector();
        database = connection.connect("mongodb://localhost:27017", "CourseMaster");
    }

    List<Document> prereqsToDoc(List<Prerequisite> prereqs){
        System.out.println(prereqs);
        for (Prerequisite req : prereqs) {
            for (String s : req.getAttributes().keySet()) {
                System.out.println(s);
                System.out.println(req.getAttributes().get(s));
            }
            System.out.println("\n\n");
        }
        if (prereqs.isEmpty())
            return List.of(new Document());
        return prereqs.stream()
                .map(prereq -> { Document doc = new Document("Prerequisite", prereq.getClass().getName());
                    for (String s : prereq.getAttributes().keySet()) {
                        doc.append((s), prereq.getAttributes().get(s));
                    }
                    return doc;
                }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public void insertDefaultCourses(List<Course> courses) {
        MongoCollection<Document> collection = database.getCollection("Courses2");
        List<Document> documents = courses.stream()
                .map(course -> { return new Document("program", course.getProgram())
                        .append("number", course.getNumber())
                        .append("name", course.getName())
                        .append("description", course.getDescription())
                        .append("catalog year", course.getCatalogYear())
                        .append("Prerequisites", prereqsToDoc(course.getPrerequisites())
                        );
                })
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (Document d : documents)
            collection.insertOne(d);


                /*
                private String name;
    private String description;
    private String program;
    private String number;
    private List<Prerequisite> prerequisites;
    private int catalogYear;
                 */
    }
    public void insertOneCourse(Course course) {
        MongoCollection<Document> collection = database.getCollection("Courses");
        Document document = new Document("program", course.getProgram())
                        .append("number", course.getNumber())
                        .append("name", course.getName())
                        .append("description", course.getDescription())
                        .append("catalog year", course.getCatalogYear())
                        .append("prerequisites", prereqsToDoc(course.getPrerequisites()));

        collection.insertOne(document);


    }

}
