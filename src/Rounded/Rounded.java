package Rounded;

import java.awt.*;
import javax.swing.*;

public class Rounded extends JPanel {
    private int cornerRadius;

    public Rounded(int radius) {
        super();
        this.cornerRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Menggambar panel dengan sudut melengkung
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
    }
}
