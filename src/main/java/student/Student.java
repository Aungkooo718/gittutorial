package student;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    private String studentName;


    public Student(
                   String studentName) {
        this.studentName = studentName;
    }

    public Student() {

    }
    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
