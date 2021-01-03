import javax.swing.*;
import javax.swing.plaf.OptionPaneUI;
import java.sql.*;
public class DbConnection extends signUp {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/signUpDb";
    public static final String root = "root";
    public static final String password = "root";

    public DbConnection(String fname, String lname, String uname, String pass, String mno, String adde) {
        String query = "insert into persons values(?,?,?,?,?,?)";
        try{
            Class.forName(DRIVER);
            Connection connection=DriverManager.getConnection(url,root,password);
            PreparedStatement statement=connection.prepareStatement(query);

            statement.setString(1,fname);
            statement.setString(2,lname);
            statement.setString(3,uname);
            statement.setString(4,pass);
            statement.setString(5,adde);
            statement.setString(6,mno);
            Integer resultSet=statement.executeUpdate();
            System.out.println(resultSet+","+"row affected");

            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public DbConnection(String username, String pass){
        String query = "select *from persons where UserName=? and Pass=? ";


        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(url, root, password);

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setNString(1, username);
            statement.setNString(2, pass);


            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Invalid UserId or Password, Please try again");



            }else{
                String s = resultSet.getString(1);
                String s1 = resultSet.getString(2);
                String s2 = resultSet.getString(3);
                String s3 = resultSet.getString(4);
                String s4 = resultSet.getString(5);
                String s5 = resultSet.getString(6);

                if(s2.equals(username) && s3.equals(pass)){
                    System.out.println("Welcome, to RVTS BookStore "+" "+s);
                    System.out.println("First Name "+" "+s);
                    System.out.println("Last Name  "+" "+s1);
                    System.out.println("User Name  "+" "+s2);
                    System.out.println("Password   "+" "+s3);
                    System.out.println("Address    "+" "+s4);
                    System.out.println("Mobile No. "+" "+s5);

                }
                else if(!s2.equals(username)){
                    System.out.println("Invalid UserID, Please try Again");
                }
                else {
                    System.out.println("Invalid Password, Please try Again");
                }

            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }



    public static void main(String args[]){



    }
}