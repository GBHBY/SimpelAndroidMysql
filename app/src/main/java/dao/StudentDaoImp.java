package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utils.JdbcUtil;
import pojo.Student;

public class StudentDaoImp implements dao.StudentDao {

//    static Connection conn = JDBCUtil.getConection();


    @Override
    public List<Student> getMassageByclassName(String sql) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<Student> relist = new ArrayList();

        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select * from student where class ='" + sql + "'";
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                Student student = new Student();
                student.setClassName(res.getString("class"));
                student.setDorm(res.getString("dorm"));
                student.setDormitary(res.getString("dormitory"));
                student.setGrade(res.getString("grade"));
                student.setId(res.getInt("studentId"));
                student.setName(res.getString("name"));
                student.setSex(res.getString("sex"));
                student.setTelephonenum(res.getString("telephonenum"));
                student.setCollege(res.getString("college"));
                student.setSpecialty(res.getString("specialty"));
                relist.add(student);

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return relist;

    }

    @Override
    public List<Student> getMassageByName(String sql, String collegeName) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<Student> relist = new ArrayList();

        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            if (stmt == null) {

            }

            String queryStatament = "select * from student where name ='" + sql + "'" + "and college = '" + collegeName + "'";
            res = stmt.executeQuery(queryStatament);

            while (res.next()) {
                Student student = new Student();
                student.setClassName(res.getString("class"));
                student.setDorm(res.getString("dorm"));
                student.setDormitary(res.getString("dormitory"));
                student.setGrade(res.getString("grade"));
                student.setId(res.getInt("studentId"));
                student.setName(res.getString("name"));
                student.setSex(res.getString("sex"));
                student.setTelephonenum(res.getString("telephonenum"));
                student.setCollege(res.getString("college"));
                student.setSpecialty(res.getString("specialty"));
                relist.add(student);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

        return relist;
    }

    @Override
    public List<Student> getMassageBydormitory(String sql, String dormitory) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<Student> relist = new ArrayList();

        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select * from student where dorm ='" + sql + "'" + "and dormitory = '" + dormitory + "'";
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                Student student = new Student();
                student.setClassName(res.getString("class"));
                student.setDorm(res.getString("dorm"));
                student.setDormitary(res.getString("dormitory"));
                student.setGrade(res.getString("grade"));
                student.setId(res.getInt("studentId"));
                student.setName(res.getString("name"));
                student.setSex(res.getString("sex"));
                student.setTelephonenum(res.getString("telephonenum"));
                student.setCollege(res.getString("college"));
                student.setSpecialty(res.getString("specialty"));
                relist.add(student);

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return relist;
    }

    @Override
    public List<Student> getMassageByID(String sql) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<Student> relist = new ArrayList();
        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select * from student where studentid = " + sql;
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                Student student = new Student();
                student.setClassName(res.getString("class"));
                student.setDorm(res.getString("dorm"));
                student.setDormitary(res.getString("dormitory"));
                student.setGrade(res.getString("grade"));
                student.setId(res.getInt("studentId"));
                student.setName(res.getString("name"));
                student.setSex(res.getString("sex"));
                student.setTelephonenum(res.getString("telephonenum"));
                student.setCollege(res.getString("college"));
                student.setSpecialty(res.getString("specialty"));
                relist.add(student);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return relist;
    }


    @Override
    public List<String> getAllClassName() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<String> relist = new ArrayList();
        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select class from student group by class";
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                relist.add(res.getString("class"));

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                JdbcUtil.close(conn);
            }
        }
        return relist;
    }

    @Override
    public List<String> getAllDomiotry() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<String> relist = new ArrayList();
        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select dormitory from student group by dormitory";
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                relist.add(res.getString("dormitory"));

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                JdbcUtil.close(conn);
            }
        }
        return relist;
    }

    @Override
    public List<String> getAllDom() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<String> relist = new ArrayList();
        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select dorm from student group by dorm";
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                relist.add(res.getString("dorm"));

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                JdbcUtil.close(conn);
            }
        }
        return relist;
    }

    //
    @Override
    public boolean isUser(String id, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        boolean flag = true;
        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select * from user where id=? and password=? ";
            PreparedStatement ps = conn.prepareStatement(queryStatament);
            ps.setString(1, id);
            ps.setString(2, password);
            res = ps.executeQuery();
            if (res.next()) {
                flag = true;

            } else
                flag = false;
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                JdbcUtil.close(conn);
            }
        }


        return flag;
    }

    @Override
    public List<String> getDate() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<String> relist = new ArrayList();

        try {
            stmt = conn.createStatement();
            String queryStatament = "select table_name from information_schema.tables where table_schema='android1' and table_name != 'user'";
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                relist.add(res.getString("table_name"));

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return relist;
    }

    @Override
    public List<String> getAllCollegeName() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        String resList = null;
        List<String> relist = new ArrayList();
        try {
            conn = JdbcUtil.getConection();
            stmt = conn.createStatement();
            String queryStatament = "select college from student group by college";
            res = stmt.executeQuery(queryStatament);
            while (res.next()) {
                relist.add(res.getString("college"));

            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                JdbcUtil.close(conn);
            }
        }
        return relist;
    }
}
