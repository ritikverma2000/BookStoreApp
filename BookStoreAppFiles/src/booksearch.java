

import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class booksearch extends BookShop {
    public booksearch() {
    }

    public static class FourthFrame extends Frame {
        public FourthFrame() {
            final Frame f3 = new Frame("");
            f3.setSize(500, 500);
            f3.setLayout((LayoutManager)null);
            f3.setVisible(true);
            f3.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    f3.dispose();
                }
            });
        }
    }
}
