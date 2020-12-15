import javafx.scene.shape.Circle;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.math.BigDecimal;

public class Frame {
    public static void main(String[] args) {

        java.awt.Frame frame = new java.awt.Frame("刘可的窗口");

        frame.setVisible(true);

        frame.setBackground(new Color(110,110,110));


        frame.setSize(400,400);

        frame.setLocation(200,0);



        frame.setResizable(false);




    }
}
