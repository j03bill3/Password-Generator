package ui;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        Image lSafeHandle = new ImageIcon("src/ui/safe_handle.png").getImage();;

        int width = lSafeHandle.getWidth(this);
        int height = lSafeHandle.getHeight(this);

        double scale = .333;
        double w = scale * width;
        double h = scale * height;
        // explicitly specify width (w) and height (h)
        g.drawImage(lSafeHandle, 10, 10, (int) w, (int) h, this);
    }
}
