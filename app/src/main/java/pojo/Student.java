package pojo;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;

@SmartTable(name = "学生信息")
public class Student {
    @SmartColumn(id = 2, name = "学号")
    private int id;
    @SmartColumn(id = 1, name = "姓名", fixed = true)
    private String name;
    @SmartColumn(id = 3, name = "性别")
    private String sex;
    @SmartColumn(id = 4, name = "成绩")
    private String grade;
    @SmartColumn(id = 5, name = "班级")
    private String className;
    @SmartColumn(id = 6, name = "宿舍门牌号")
    private String dorm;
    @SmartColumn(id = 7, name = "公寓楼")
    private String dormitary;
    @SmartColumn(id = 8, name = "电话号码")
    private String telephonenum;
    @SmartColumn(id = 9, name = "院系")
    private String college;
    @SmartColumn(id = 10, name = "专业")
    private String specialty;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Student(int id, String name, String sex, String grade, String className, String dorm, String dormitary, String telephonenum, String college, String specialty) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.className = className;
        this.dorm = dorm;
        this.dormitary = dormitary;
        this.telephonenum = telephonenum;
        this.college = college;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", className='" + className + '\'' +
                ", dorm='" + dorm + '\'' +
                ", dormitary='" + dormitary + '\'' +
                ", telephonenum='" + telephonenum + '\'' +
                ", college='" + college + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public String getDormitary() {
        return dormitary;
    }

    public void setDormitary(String dormitary) {
        this.dormitary = dormitary;
    }

    public String getTelephonenum() {
        return telephonenum;
    }

    public void setTelephonenum(String telephonenum) {
        this.telephonenum = telephonenum;
    }


    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

}
