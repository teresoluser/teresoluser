//package com.Implemetation;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.DAO.DepartmentDAO;
//import com.example.demo.model.DepartmentEntity;
//
//@Repository
//@Transactional
//public class DepartmentDAOImplemetation implements DepartmentDAO {
//
//	
//		    @PersistenceContext
//		    private EntityManager manager;
//		 
//		    @Override
//		    public boolean addDepartment(DepartmentEntity dept) {
//		        try {
//		            manager.persist(dept);
//		        } catch (Exception e) {
//		            e.printStackTrace();
//		            return false;
//		        }
//		        return true;
//		    }
//		
//	}
//
//
