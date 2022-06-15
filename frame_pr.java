import java.awt.*;
import java.awt.event.*;
public class frame_pr{
    public static void main(String[] args){

        Frame f = new Frame();
        f.setTitle("My Frame");
        f.setSize(500, 500);
        f.setVisible(true);

        Panel p = new Panel();
        p.setBackground(Color.MAGENTA);
        f.add(p);

        f.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {}
            
            @Override
            public void windowIconified(WindowEvent e) {}

            @Override
            public void windowDeiconified(WindowEvent e) {}

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {}
            
        });

        Button b = new Button("Click Me!");
        b.setBounds(10, 10, 100, 50);
        p.add(b);
    }
}