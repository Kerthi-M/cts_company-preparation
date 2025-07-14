package jpa;

import model.Employee;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAExample {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John");
        em.persist(emp);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}