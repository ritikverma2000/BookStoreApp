import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class signUp {

    public static class thirdFrame extends Frame implements ActionListener {
        public Label fname;
        public Label lname;
        public Label uname;
        public Label upass;
        public Label mno;
        public Label adde;
        public TextField n1;
        public TextField n2;
        public TextField n3;
        public TextField n4;
        public TextField n5;
        public TextField n6;
        protected Button signUpbutton;
        protected int count;

        public thirdFrame() {
            final Frame f2 = new Frame("signup");
            fname = new Label("First Name:", 1);
            fname.setFont(new Font("Arial", 0, 15));
            fname.setSize(100, 20);
            fname.setLocation(40, 100);
            n1 = new TextField();
            n1.setFont(new Font("Arial", 0, 15));
            n1.setBounds(155, 100, 150, 20);
            lname = new Label("Last Name:");
            lname.setFont(new Font("Arial", 0, 15));
            lname.setBounds(50, 140, 100, 20);
            n2 = new TextField();
            n2.setFont(new Font("Arial", 0, 15));
            n2.setBounds(155, 140, 150, 20);
            uname = new Label("User Name:");
            uname.setFont(new Font("Arial", 0, 15));
            uname.setBounds(50, 180, 150, 20);
            n3 = new TextField();
            n3.setFont(new Font("Arial", 0, 15));
            n3.setBounds(155, 180, 150, 20);
            upass = new Label("Password:");
            upass.setFont(new Font("Arial", 0, 15));
            upass.setBounds(50, 220, 150, 20);
            n4 = new TextField();
            n4.setFont(new Font("Arial", 0, 15));
            n4.setBounds(155, 220, 150, 20);
            mno = new Label("Mobile No:");
            mno.setFont(new Font("Arial", 0, 15));
            mno.setBounds(50, 260, 150, 20);
            n5 = new TextField();
            n5.setFont(new Font("Arial", 0, 15));
            n5.setBounds(155, 260, 150, 20);
            adde = new Label("Address:");
            adde.setFont(new Font("Arial", 0, 15));
            adde.setBounds(50, 300, 150, 20);
            n6 = new TextField();
            n6.setFont(new Font("Arial", 0, 15));
            n6.setBounds(155, 300, 150, 20);
            signUpbutton = new Button("SIGN-UP");
            signUpbutton.setBounds(140, 360, 100, 20);
            signUpbutton.addActionListener(this);
            f2.add(signUpbutton);
            f2.add(n6);
            f2.add(adde);
            f2.add(n5);
            f2.add(mno);
            f2.add(n4);
            f2.add(upass);
            f2.add(n3);
            f2.add(uname);
            f2.add(n2);
            f2.add(lname);
            f2.add(n1);
            f2.add(fname);
            f2.setSize(700, 700);
            f2.setBounds(10, 10, 370, 600);
            f2.setResizable(false);
            f2.setLayout((LayoutManager)null);
            f2.setVisible(true);
            f2.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    f2.dispose();
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
            String fname = n1.getText();
            String lname = n2.getText();
            String uname = n3.getText();
            String pass = n4.getText();
            String mno = n5.getText();
            String adde =n6.getText();
            if (e.getSource() == signUpbutton) {
                new DbConnection(fname,lname,uname,pass,mno,adde);


            }

        }
    }


}
