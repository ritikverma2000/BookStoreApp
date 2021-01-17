import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;

public class loginpart extends BookShop {
            public static class secondFrame extends Frame implements ActionListener, ItemListener {
            public TextField name;
            public JPasswordField pass;
            protected Button loginButton;
            protected Button resetButton;
            protected Button signup;
            public Checkbox showPassword;

            public secondFrame() {
                final Frame f1 = new Frame("Login Page");
                f1.setSize(200, 200);
                Label n = new Label("User Name:", 1);
                Label p = new Label("Password:", 1);
                Label q =new Label("Pls SignUp if not Registered");
                q.setFont(new Font("Ariel", 3, 20));
                q.setForeground(Color.RED);

                name = new TextField(40);
                pass = new JPasswordField(40);
                showPassword = new Checkbox("Show Password");
                loginButton = new Button("SIGN-IN");
                resetButton = new Button("RESET");
                signup =new Button("SIGN-UP");

                loginButton.addActionListener(this);
                resetButton.addActionListener(this);
                signup.addActionListener(this);

                //showPassword checkbox implementation
                showPassword.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange()==ItemEvent.DESELECTED){
                            pass.setEchoChar('*');
                        }

                        else {
                            pass.setEchoChar((char) 0);
                        }
                    }
                });
                f1.add(signup);
                f1.add(q);
                f1.add(n);
                f1.add(name);
                f1.add(p);
                f1.add(pass);
                f1.add(showPassword);
                f1.add(loginButton);
                f1.add(resetButton);
                n.setBounds(50, 150, 100, 30);
                p.setBounds(50, 220, 100, 30);
                q.setBounds(60,380,400,30);
                name.setBounds(150, 150, 150, 30);
                pass.setBounds(150, 220, 150, 30);
                showPassword.setBounds(150, 260, 150, 30);
                loginButton.setBounds(60, 300, 100, 30);
                resetButton.setBounds(210, 300, 100, 30);
                signup.setBounds(135, 430, 100, 30);
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
                String username = name.getText();
                String password = pass.getText();
                if (e.getSource() ==loginButton) {
                 new DbConnection(username,password);

                }

                if (e.getSource() == resetButton) {
                    name.setText("");
                    pass.setText("");
                }
                if (e.getSource()==signup){
                    new signUp.thirdFrame();
                }

            }

            public void itemStateChanged(ItemEvent e) {
            }
        }
    }



