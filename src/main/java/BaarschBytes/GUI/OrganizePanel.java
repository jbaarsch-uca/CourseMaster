package BaarschBytes.GUI;

import BaarschBytes.data.Course;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;





public class OrganizePanel extends JPanel  {
    //List<Course> courses;
    List<CoursePanel> courses;
    final int SUB_BUFFER_X = 5;
    final int SUB_BUFFER_Y = 10;
    final int BUFFER_EDGE = 20;

    public OrganizePanel(List<Course> courses){
        this.setLayout(null);
        this.courses = courses.stream().map(CoursePanel::new)
                .collect(Collectors.toCollection(ArrayList::new));
        Dimension size = new Dimension(1000, 1000);
        this.setSize(size);
        this.setPreferredSize(size);
        this.setBackground(Color.GRAY);

        setBounds();
        this.courses.forEach(this::add);
        /*
        DraggablePanel drag = new DraggablePanel();
        drag.setBackground(Color.BLUE);
        drag.setBounds(100, 100, 150, 150);
        add(drag);
        */
    }


    private void setBounds(){
        int x = BUFFER_EDGE;
        int y = BUFFER_EDGE;
        for (CoursePanel cp : courses) {
            cp.setBounds(x, y, cp.getWidth(), cp.getHeight());
            if ( x+ cp.getWidth() + BUFFER_EDGE >= this.getWidth() ) {  // i.e. got to the end of the row
                x = BUFFER_EDGE;                 // reset X to beginning
                y += (cp.getHeight() + SUB_BUFFER_Y); // set Y to the next row
            }
            else {
                x += (cp.getWidth() + SUB_BUFFER_X); // add a 5 pixel buffer.
            }
        }
    }


}
