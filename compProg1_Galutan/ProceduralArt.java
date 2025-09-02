import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ProceduralArt extends JPanel {
    Random rand = new Random();

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt(getWidth());
            int y = rand.nextInt(getHeight());
            int size = rand.nextInt(50);
            g.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
            g.fillOval(x, y, size, size);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Procedural Art");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new ProceduralArt());
        frame.setVisible(true);
    }
}
