package com.javahash.hibernate;
 
import java.util.Date;
import org.hibernate.Session;
 
public class Run {
 
/**
 * 
 */
 public static void main(String[] args) {
 Session session = HibernateSessionManager.getSessionFactory().openSession();
 
 session.beginTransaction();
 User user = new User();
 
 user.setUserId(5);
 user.setUsername("NewUser");
 user.setCreatedBy("Hibernate");
 user.setCreatedDate(new Date());
 
 session.save(user);
 session.getTransaction().commit();
 
}
 
}
