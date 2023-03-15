package parta.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private int employeeNumber;
    private String name;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;


    public Employee(String name) {
        this.name = name;
    }
}
