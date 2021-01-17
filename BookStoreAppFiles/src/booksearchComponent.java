import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class booksearchComponent extends booksearch{
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/booksdb";
    public static final String root = "root";
    public static final String password = "root";


    public static class sixthFrame extends Frame{
            JFrame frame1;
        static JTable table;
        String[] columnNames = {"Book_id", "Book_Name", "Book_author","Book_Publication","Book_type" ,"Book_price"};
             String from;
        PreparedStatement pst;
        Connection con;

       public sixthFrame(String s1){



           frame1 = new JFrame("Database Search Result");
           frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame1.setLayout(new BorderLayout());
           //TableModel tm = new TableModel();
           DefaultTableModel model = new DefaultTableModel();
           model.setColumnIdentifiers(columnNames);

           table = new JTable();
           table.setModel(model);
           table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
           table.setFillsViewportHeight(true);
           JScrollPane scroll = new JScrollPane(table);
           scroll.setHorizontalScrollBarPolicy(
                   JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
           scroll.setVerticalScrollBarPolicy(
                   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
           from = s1;

           String book_id = "";
           String book_name= "";
           String book_author= "";
           String book_publication = "";
           String book_type = "";
           String book_price = "";

           try {
               Class.forName(DRIVER);
                con= DriverManager.getConnection(url, root, password);

               pst = con.prepareStatement("select * from book_info where Book_Name='" +s1+ "'");
               ResultSet rs = pst.executeQuery();

               int i = 0;
               if (rs.next()) {
                   book_id = rs.getString(1);
                   book_name = rs.getString(2);
                   book_author = rs.getString(3);
                   book_publication = rs.getString(4);
                   book_type = rs.getString(5);
                   book_price = rs.getString(6);
                   model.addRow(new Object[]{book_id, book_name, book_author, book_publication, book_type, book_price});
                   i++;





               }
               if (i < 1) {
                   JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
               }
               if (i == 1) {
                   System.out.println(i + " Record Found");
               } else {
                   System.out.println(i + " Records Found");
               }
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           }
           frame1.add(scroll);
           frame1.setVisible(true);
           frame1.setSize(600, 300);








       }
    }

    public static void main(String[] args) {

    }
}
