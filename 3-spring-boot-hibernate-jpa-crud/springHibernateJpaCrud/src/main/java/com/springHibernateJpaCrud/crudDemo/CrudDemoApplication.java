package com.springHibernateJpaCrud.crudDemo;

import com.springHibernateJpaCrud.crudDemo.DAO.StudentDAO;
import com.springHibernateJpaCrud.crudDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO thestudent){
		return runner ->{
			createStudent(thestudent);
			//readStudent(thestudent);
			//getStudent(thestudent);

			//updateStudent(thestudent);

			//deleteStudent(thestudent);

			//deleteSelectedStudents(thestudent);

		};
	}

	private void deleteSelectedStudents(StudentDAO thestudent) {
		System.out.println("deleting students ...");
		int num=thestudent.deleteSelectedRows("karim");
		System.out.println("NO of students deleted is: "+num);
	}

	private void deleteStudent(StudentDAO thestudent) {
		int studentId=9;
		System.out.println("the student with id ="+studentId+" will be removed");
		thestudent.delete(studentId);

	}

	private void updateStudent(StudentDAO thestudent) {
		//to retrieve student with id
		int studentId=5;
		System.out.println("student with id :"+studentId);
		List<Student> students =thestudent.findById(studentId);
		for(Student tempStudent:students){
			tempStudent.setLast_name("Elmalek");
			thestudent.update(tempStudent);
			System.out.println("the updated student is -->"+thestudent.toString());

		}


	}


	private void getStudent(StudentDAO thestudent) {
		// return list of students
		List<Student> students = thestudent.findAll("mohamed");

		// to print students
		for(Student tempStudent :students){
			System.out.println(tempStudent.toString());
		}

	}

	private void readStudent(StudentDAO thestudent) {
		System.out.println("creating student .....");
		Student myStudent=new Student("karim","mohamed","alimohamed@gmail.com");

		//save student
		System.out.println("saving student ..");
		thestudent.save(myStudent);

		//print student id
		int id=myStudent.getId();
		System.out.println("you enter student id :"+id);

		//reading student
		System.out.println("reading student ..");
		Student student = thestudent.read(id);

		// to print student
		System.out.println("the student found "+student);

	}

	private void createStudent(StudentDAO thestudent) {
		//create student
		System.out.println("creating student .....");
		Student myStudent=new Student("mahmoud","elmalek","mahmoudelmalek@gmail.com");

		//save student
		System.out.println("saving student ..");
		thestudent.save(myStudent);

		//print student id
		int id=myStudent.getId();
		System.out.println("you enter student id :"+id);

	}


}
