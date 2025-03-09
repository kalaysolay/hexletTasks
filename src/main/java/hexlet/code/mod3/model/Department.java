package hexlet.code.mod3.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private String title;
    private ArrayList<Employee> employees;


    public Department(String title) {
        this.title = title;
        this.employees = new ArrayList<Employee>();
    }

    public Department(String title, ArrayList<Employee> employees) {
        this.title = title;
        this.employees = employees;
    }


    public void addEmployee(Employee e){
        employees.add(e);
        e.setDepartment(this);
    }
    public void removeEmployee(Employee e){
        employees.remove(e);
        e.setDepartment(null);
    }
}