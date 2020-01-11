import java.awt.* ;
import java.awt.event.* ;
import java.applet.*;
import java.util.Random;

public class AppWindow extends Frame {
    public AppWindow() {
        addWindowListener(new MyWindowAdapter());
    }
    public static void main(String args[]) {
        AppWindow appwin = new AppWindow();
        appwin.setSize(new Dimension(900, 900));
        appwin.setTitle("Lab 6");
        appwin.setVisible(true);

        Button button = new Button();
        button.setBounds(10, 10, 100, 50);
        button.setLabel("press me");
        button.setVisible(true);
        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                button.setBounds(
                        (int)(Math.random()*(appwin.getWidth()-button.getWidth())),
                        (int)(Math.random()*(appwin.getHeight()-button.getHeight())),
                        button.getWidth(),
                        button.getHeight());
            }
        });

        appwin.add(button);
        appwin.setLayout(null);
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
