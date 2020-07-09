package dao;

import java.util.List;

import pojo.Student;

public interface StudentDao {
    List<Student> getMassageByclassName(String sql);

    List<Student> getMassageByName(String sql, String className);

    List<Student> getMassageBydormitory(String sql, String dormitory);

    List<Student> getMassageByID(String sql);

    List<String> getAllClassName();

    List<String> getAllCollegeName();

    List<String> getAllDomiotry();

    List<String> getAllDom();

    boolean isUser(String id, String password);

    List<String> getDate();

}
