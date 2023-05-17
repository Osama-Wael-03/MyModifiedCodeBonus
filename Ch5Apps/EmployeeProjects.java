package Ch5Apps;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeprojects")
public class EmployeeProjects {
    @Id
    @ManyToOne
    @JoinColumn(name = "Employee_Id")  
    private Employee employee;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "Project_Id")
    private Project project;
    
    @Column(name = "hours")
    private Integer hours;
    
    // Add constructors, getters, and setters if needed
}