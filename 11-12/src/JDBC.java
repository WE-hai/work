import java.sql.*;

public class JDBC {

    public Connection getConnection() throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/login?useSSL=false&characterEncoding=utf8";
        // 连接数据库的用户名
        String user = "root";
        // 连接数据库的密码
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public boolean login(String username,String password1) {
        try {
            Connection connection = getConnection();
            PreparedStatement sql = connection.prepareStatement("select * from user where username=? and password=?");
            sql.setString(1,username);
            sql.setString(2,password1);
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {
                return true;
            }
            sql.close();
            rs.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public void update(String username,String time,String status) throws SQLException,ClassNotFoundException {
        Connection connection = getConnection();
        PreparedStatement sql = connection.prepareStatement("update user set login_time=?,status=? where username=?");
        sql.setString(1,time);
        sql.setString(2,status);
        sql.setString(3,username);
        sql.executeUpdate();
        sql.close();
        connection.close();
    }
}
