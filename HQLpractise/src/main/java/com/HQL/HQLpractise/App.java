package com.HQL.HQLpractise;

import javax.persistence.Query;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HQLEntity.Employee;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sf = new Configuration().configure().buildSessionFactory();
       Session ss = sf.openSession();
       
       
//       Employee e1= new Employee();
//       e1.setEmpName("Ram");
//       e1.setAddress("abc");
//       e1.setSalary(5000);
//       
//       Employee e2= new Employee();
//       e2.setEmpName("Dev");
//       e2.setAddress("cef");
//       e2.setSalary(15000);
//       
//       Employee e3= new Employee();
//       e3.setEmpName("Jai");
//       e3.setAddress("abcer");
//       e3.setSalary(25000);
//       
//       Employee e4= new Employee();
//       e4.setEmpName("Shyam");
//       e4.setAddress("abcjk");
//       e4.setSalary(35000);
//     
  
       String hql = "from Employee where empid=:ei";
       Query q = ss.createQuery(hql);
       q.setParameter("ei", 22);
    //   List<Employee> ll = q.getResultList();
       Employee e =(Employee) q.getSingleResult();
       
      
    	   System.out.println(e.getEmpName());
       
       
       ss.close();
       sf.close();
    }
}
