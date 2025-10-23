package BaarschBytes.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DraggablePanel extends JPanel {
    private Point dragOffset;

    public DraggablePanel() {
        // Create a custom MouseAdapter for handling press and drag events
        MouseAdapter mouseAdapter = new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                // Store the initial click point (relative to the panel)
                dragOffset = e.getPoint();

                // Optional: Bring the clicked panel to the front if it's in a JLayeredPane
                // or if z-order matters.
                 if (getParent() != null) {
                    getParent().setComponentZOrder(DraggablePanel.this, 0);
                    getParent().repaint();
                 }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragOffset != null) {
                    // 1. Get the mouse's current position *relative to the parent container*.
                    //    We use SwingUtilities.convertPoint to translate the event's
                    //    coordinates (which are relative to this panel) to the
                    //    parent's coordinate system.
                    Point newMousePosOnParent = SwingUtilities.convertPoint(
                            DraggablePanel.this,
                            e.getPoint(),
                            getParent());

                    // 2. Calculate the new top-left corner (x, y) for the panel.
                    //    This is the mouse's current location *minus* the original
                    //    offset where the user "grabbed" the panel.
                    int newX = newMousePosOnParent.x - dragOffset.x;
                    int newY = newMousePosOnParent.y - dragOffset.y;

                    // 3. Move the panel to the new location.
                    setLocation(newX, newY);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Clear the offset when the mouse is released
                dragOffset = null;
            }
        };

        // Add both listeners to this panel
        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }
}






