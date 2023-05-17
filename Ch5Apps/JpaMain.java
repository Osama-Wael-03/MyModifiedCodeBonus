package Ch5Apps;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("PR320222PU").createEntityManager();

        em.getTransaction().begin();

        // Create a department
        Department department = new Department("Sales", "Gaza");
        em.persist(department);em.getTransaction().commit();

    em.close();
}

private static Double calculateEmployeeSalary(Employee employee) {
    
     return employee.getSalary();
    
}