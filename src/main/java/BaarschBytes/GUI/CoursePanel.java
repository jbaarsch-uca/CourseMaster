package BaarschBytes.GUI;

import BaarschBytes.data.Course;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CoursePanel extends DraggablePanel {

    private Course course;
    private JLabel courseLabel;

    public CoursePanel(Course c){
        super();
        course = c;
        courseLabel = new JLabel(course.getProgram() + ": " + course.getNumber());
        this.add(courseLabel);
        this.setSize(new Dimension(75, 25));
        this.setBorder(BorderFactory.createLineBorder(Color.black));

    }

    public Course getCourse(){return course;}

    @Override
    public void setToolTipText(String text) {
        if (this.course != null) {
            text = this.course.getName();
        }
        // Pass the call to the parent class to handle the actual logic.
        super.setToolTipText(text);
    }

}
