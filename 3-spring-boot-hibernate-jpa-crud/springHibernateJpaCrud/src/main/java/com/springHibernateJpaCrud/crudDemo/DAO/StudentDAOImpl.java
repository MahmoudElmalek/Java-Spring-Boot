package com.springHibernateJpaCrud.crudDemo.DAO;

import com.springHibernateJpaCrud.crudDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    //to define entity manager
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public void save(Student thestudent) {
        entityManager.persist(thestudent);
    }

    @Override
    public Student read(Integer studentId) {
        return entityManager.find(Student.class,studentId);
    }

    @Override
    public List<Student> findAll(String name) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student where last_name=:thedata",Student.class);
        theQuery.setParameter("thedata",name);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findById(int id) {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student where id=:thedata",Student.class);
        theQuery.setParameter("thedata",id);
        return theQuery.getResultList();

    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student=entityManager.find(Student.class,id);
        entityManager.remove(student);

    }

    @Override
    @Transactional
    public int deleteSelectedRows(String name) {
        int num = entityManager.createQuery("delete from Student s where s.first_name=:data").setParameter("data",name).executeUpdate();
        return num;
    }


}
