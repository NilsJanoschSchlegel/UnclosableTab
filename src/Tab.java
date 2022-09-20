import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tab extends JFrame implements ActionListener {
    JButton close = new JButton();
    public static void main(String[] args) {
        new Tab();
    }
    Tab() {
        this.add(close);

        close.setBackground(Color.gray);
        close.addActionListener(this);
        close.setBounds(100, 100, 220, 220);
        close.setText("Close");
        close.setFont(new Font("RUBIK", Font.BOLD, 45));
        close.setFocusable(false);
        close.setBorderPainted(false);

        this.setResizable(false);
        this.setLayout(null);
        this.setSize(420, 420);
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.setTitle("Unclosable Tab");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == close) {
            this.dispose();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            for (int i = 0; i<10; i++) {
                new Tab();
            }
        }
    }
}
