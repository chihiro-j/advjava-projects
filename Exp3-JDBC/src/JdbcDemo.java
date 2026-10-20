import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "root"
            );

            // Step 3: Insert Record using PreparedStatement
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
            ps.setInt(1, 101);
            ps.setString(2, "Rahul");
            ps.setString(3, "CSE");
            ps.executeUpdate();
            System.out.println("Record Inserted");

            // Step 4: Retrieve Records using Statement
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                                   rs.getString("name") + " " +
                                   rs.getString("branch"));
            }

            // Step 5: Close Connection
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
