package parta.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String name;




    @JoinColumn(name="Department_id")
    private List<Employee> employeeList=new ArrayList<>();

    public Department(String name) {
        this.name = name;

    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}
