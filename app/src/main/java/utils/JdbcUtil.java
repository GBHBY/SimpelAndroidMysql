package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {


    public static Connection getConection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.0.103:3306/android1?useUnicode=true&characterEncoding=UTF-8", "user1", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn) {
        try {
            if (conn != null)
                conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
