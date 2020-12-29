import java.awt.*;
import java.awt.event.*;

public class loginpart extends BookShop {
    public loginpart() {
    }


        public static class secondFrame extends Frame implements ActionListener, ItemListener {
            protected TextField name;
            protected TextField pass;
            protected Button loginButton;
            protected Button resetButton;
            protected Checkbox showPassword;

            public secondFrame() {
                final Frame f1 = new Frame("Login Page");
                f1.setSize(200, 200);
                Label n = new Label("User Name:", 1);
                Label p = new Label("Password:", 1);
                this.name = new TextField(40);
                this.pass = new TextField(40);
                this.showPassword = new Checkbox("Show Password");
                this.loginButton = new Button("SIGN-IN");
                this.resetButton = new Button("RESET");
                this.loginButton.addActionListener(this);
                this.resetButton.addActionListener(this);
                this.showPassword.addItemListener(this);
                f1.add(n);
                f1.add(this.name);
                f1.add(p);
                f1.add(this.pass);
                f1.add(this.showPassword);
                f1.add(this.loginButton);
                f1.add(this.resetButton);
                n.setBounds(50, 150, 100, 30);
                p.setBounds(50, 220, 100, 30);
                this.name.setBounds(150, 150, 150, 30);
                this.pass.setBounds(150, 220, 150, 30);
                this.showPassword.setBounds(150, 260, 150, 30);
                this.loginButton.setBounds(60, 300, 100, 30);
                this.resetButton.setBounds(210, 300, 100, 30);
                f1.setBounds(10, 10, 370, 600);
                f1.setLayout((LayoutManager) null);
                f1.setVisible(true);
                f1.setResizable(false);
                f1.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        f1.dispose();
                    }
                });
            }

            public void actionPerformed(ActionEvent e) {
                String username = this.name.getText();
                String password = this.pass.getText();
                if (e.getSource() == this.loginButton) {
                    System.out.println(username);
                    System.out.println(password);
                }

                if (e.getSource() == this.resetButton) {
                    this.name.setText("");
                    this.pass.setText("");
                }

            }

            public void itemStateChanged(ItemEvent e) {
            }
        }
    }



