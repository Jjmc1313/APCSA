
import javax.swing.*;
import java.awt.*;

public class Unit8Challenge7 extends JFrame {
    public SmallHouseDrawing() {
        setTitle("Small House Drawing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and add it to the frame
        HousePanel housePanel = new HousePanel();
        add(housePanel);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SmallHouseDrawing());
    }
}

class HousePanel extends JPanel {
jav
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the house
        drawHouse(g);
    }

    private void drawHouse(Graphics g) {
        // Set color to brown for the house
        g.setColor(new Color(139, 69, 19));

        // Draw the main rectangle for the house
        g.fillRect(100, 150, 200, 150);

        // Set color to red for the roof
        g.setColor(Color.RED);

        // Draw the triangle for the roof
        int[] xPoints = {100, 200, 300};
        int[] yPoints = {150, 100, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // Set color to blue for the door
        g.setColor(Color.BLUE);

        // Draw the door
        g.fillRect(170, 220, 60, 80);

        // Set color to yellow for the window
        g.setColor(Color.YELLOW);

        // Draw the window
        g.fillRect(250, 220, 40, 40);

        // Draw window lines
        g.setColor(Color.BLACK);
        g.drawLine(270, 220, 270, 260);
        g.drawLine(250, 240, 290, 240);
    }
}
