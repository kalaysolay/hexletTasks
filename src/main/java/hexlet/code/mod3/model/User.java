package hexlet.code.mod3.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class User {
    private String name;
    private List<CourseMember> courseMembers;

    public User(String name) {
        this.name = name;
        courseMembers = new ArrayList<>();
    }

    public void addCourseMember(CourseMember courseMember) {
        courseMembers.add(courseMember);
    }

    public void removeCourseMember(CourseMember courseMember) {
        courseMembers.remove(courseMember);
    }


}
