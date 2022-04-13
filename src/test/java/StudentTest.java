import com.zj.ServletShiYan1.impl.AdminDaoImpl;
import com.zj.ServletShiYan1.impl.StudentDaoImpl;
import com.zj.ServletShiYan1.pojo.Admin;
import com.zj.ServletShiYan1.pojo.Student;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class StudentTest {
    AdminDaoImpl adminDao= new AdminDaoImpl();
    StudentDaoImpl studentDao=new StudentDaoImpl();
    //admin login测试
    @Test
    public void loginTest() throws SQLException {
       Admin admin = new Admin();
        admin.setName("admin");
        admin.setPassword("admin");
        boolean b = adminDao.login(admin.getName(), admin.getPassword());
        System.out.println(b);
    }
    @Test
    public void addTest() throws SQLException {
       Student student = new Student();
       student.setName("张锦");
       student.setAge(18);
       student.setGender("男");
       student.setPlace("常州");
       if (studentDao.add(student)==1){
           System.out.println("添加成功");
       }else {
           System.out.println("添加失败");
       }
    }
    @Test
    public void deleteTest() throws SQLException {
        if (studentDao.delete(4)==1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
    @Test
    public void updateTest() throws SQLException {
        Student student = new Student();
        student.setId(5);
        student.setName("张锦");
        student.setAge(20);
        student.setGender("男");
        student.setPlace("常州");
        if (studentDao.update(student)==1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
    @Test
    public void findById() throws SQLException {
        Student student = studentDao.findById(4);
        System.out.println(student);
    }
}
