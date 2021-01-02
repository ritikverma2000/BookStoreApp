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
//            if(!resultSet.next())
//                System.out.println("Jai Mata Di");
//                System.out.println(resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3)+"  "+resultSet.getString(4)+"  "+resultSet.getString(5)+"  "+resultSet.getString(6));
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }


    public static void main(String args[]){



    }
}