package hexlet.code.mod3.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String fullName;
    private String position;
    private Department department;



    public Employee(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }
}