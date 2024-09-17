package com.springHibernateJpaCrud.crudDemo.DAO;

import com.springHibernateJpaCrud.crudDemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student read(Integer studentId);
    List<Student> findAll(String name);
    List<Student> findById(int id);
    void update(Student student);
    void delete(int id);
    int deleteSelectedRows(String name);
}
