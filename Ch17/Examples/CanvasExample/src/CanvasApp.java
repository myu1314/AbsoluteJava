import javax.swing.*;
import java.awt.*;

public class CanvasApp  extends JFrame{

    CanvasApp() {
        super("canvas");
        Canvas c = new Canvas() {

            public void paint(Graphics g){
                g.setColor(Color.red);
                g.setFont(new Font("Bold", 1, 20));
                g.drawString("This is a canvas", 100, 100);
                }
        };

        c.setBackground(Color.black);
        add(c);
        setSize(400,400);
        //show();
    }

    public static void main(String[] args) throws Exception {
        CanvasApp c = new CanvasApp();
        c.setVisible(true);
    }
}
