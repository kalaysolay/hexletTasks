
package hexlet.code.mod3.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
public class CourseMember {

    private User user;
    private Course course;

    @Setter
    private LocalDate startedAt;
    private LocalDate finishedAt;

    public void setCourse(Course course) {
        this.course = course;
        course.addCourseMember(this);
    }

    public void setUser(User user) {
        this.user = user;
        user.addCourseMember(this);
    }


}
