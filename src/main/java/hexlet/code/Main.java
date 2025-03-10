package hexlet.code;

import hexlet.code.mod2.Counter;
import hexlet.code.mod2.autotest.Methods;
import hexlet.code.mod3.model.*;

import java.time.LocalDate;
import java.util.regex.Matcher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* var department = new Department("construction");
        var employee = new Employee("Mike Arts", "architect");
        department.addEmployee(employee);
        System.out.println("---------");
        System.out.println(department.getEmployees());


        System.out.println("---------");
        System.out.println(department.getEmployees());
        System.out.println("DEP:" +employee.getDepartment());
        department.removeEmployee(employee);
        System.out.println("DEP AFTER:" +employee.getDepartment());
*/

        /*
        var user = new User("Askhat");
        var userIvan = new User("Ivan");
        var courseOps = new Course("DevOps");
        var coursePhp = new Course("PHP");

        var cmember = new CourseMember();
        cmember.setCourse(courseOps);
        cmember.setUser(user);
        cmember.setStartedAt(LocalDate.now());

        var cmember2 = new CourseMember();
        cmember2.setCourse(coursePhp);
        cmember2.setUser(user);

        System.out.println(user.getCourseMembers());
*/

       // var Askhat = new Customer("Askhat");
        //var Ivan = new Customer("Ivan");

        //var car2 = new Car("Impreza","1234567890");

        var car = new Car("audi a4", "1FTEX1E81AF746863");
        var customer = new Customer("John Bin");

        var actualRide = App.getRide(customer, car);
    }
}