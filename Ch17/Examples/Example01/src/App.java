import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        final int WIDTH = 500;
        final int HEIGHT = 500;
        System.out.println("Hello, World!");
        JFrame firstWindow = new JFrame();
        firstWindow.setSize(WIDTH,HEIGHT);
        firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        JButton endButton = new JButton("Click to end program.");
        EndingListener buttonEar = new EndingListener();
        endButton.addActionListener(buttonEar);
        firstWindow.add(endButton);

        firstWindow.setVisible(true);
    }
}
