package BaarschBytes.GUI;

import BaarschBytes.data.Course;

import javax.swing.*;
import java.util.List;

public class CourseFrame extends JFrame {

    public CourseFrame(List<Course> courses){
        this.setTitle("Course Master");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(new OrganizePanel(courses));
    }

    public void display(){
        this.pack();
        this.setVisible(true);
    }




}
