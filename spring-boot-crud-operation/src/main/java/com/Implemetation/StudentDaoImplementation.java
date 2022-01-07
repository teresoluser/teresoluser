//package com.Implemetation;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import com.DAO.StudentDAO;
//import com.example.demo.model.Student;
//import com.student.PersistenceContext;
//
//public class StudentDaoImplementation implements StudentDAO {
//
//	
//	   @PersistenceContext
//	    private EntityManager manager;
//
//	@Override
//	public boolean addDepartment(StudentDAO studentDAO) {
//	    try {
//            manager.persist(studentDAO);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }
//
//	@Override
//	public List<Student> getAllEmployees() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Student> getAllEmployeesByDeptId(Integer id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean addEmployee(Student student) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	 
//	      
//}
