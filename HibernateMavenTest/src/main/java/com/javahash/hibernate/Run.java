package com.javahash.hibernate;
 
import java.util.Date;
import org.hibernate.Session;
 
public class Run {
 
/**
 * 
     * @param args
 */
 public static void main(String[] args) {
 Session session = HibernateSessionManager.getSessionFactory().openSession();
 
 session.beginTransaction();
 User user = new User();
 
 user.setUserId(9);
 user.setUsername("AnotherUser");
 user.setCreatedBy("Hibernate-test");
 user.setCreatedDate(new Date());
 
 session.save(user);
 session.getTransaction().commit();
 
 
}
 
}
