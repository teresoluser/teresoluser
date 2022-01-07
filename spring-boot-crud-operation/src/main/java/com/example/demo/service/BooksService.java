package com.example.demo.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.model.Employess_Data;
import com.example.demo.repository.BooksRepository;
import com.example.demo.repository.Employee_DataRepository;  
 
//defining the business logic  
@Service  
public class BooksService   
{  
@Autowired  
BooksRepository booksRepository;  

@Autowired  
Employee_DataRepository employee_DataRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Books> getAllBooks()   
{  
List<Books> books = new ArrayList<Books>();  
booksRepository.findAll().forEach(books1 -> books.add(books1));  

System.out.println(" All Books  ");
return books;  
}  
//getting a specific record by using the method findById() of CrudRepository  

public Books getBooksById(int id)   
{  
return booksRepository.findById(id).get();  
}  


//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Books books)   
{
	System.out.println(" Transaction  Insert Books Here !");
booksRepository.save(books);  
System.out.println(" Inserted successfully  !");
}  

//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
booksRepository.deleteById(id);  
}  
//updating a record  
public void update(Books books, int bookid)   
{  
booksRepository.save(books);  
} 


// ...............................................................
  // ===========================================================
        // .... Employee Data........//

//getting all books record by using the method findaAll() of CrudRepository  
public List<Employess_Data> getAllEmployee()   
{  
List<Employess_Data> books = new ArrayList<Employess_Data>();  
employee_DataRepository.findAll().forEach(books1 -> books.add(books1));  

System.out.println(" All Books  ");
return books;  
} 

//getting all books record by using the method findaAll() of CrudRepository  
public Employess_Data getEmployeeById(int id)   
{  
return employee_DataRepository.findById(id).get();  
 
} 


//getting all books record by using the method findaAll() of CrudRepository  
public String deleteEmployeeById(int id)   
{  
employee_DataRepository.deleteById(id);  

return " Record Deleted SuccessFully";
} 

//saving a specific record by using the method save() of CrudRepository  
public void saveEmployee(Employess_Data employess_Data)   
{
	System.out.println(" Transaction  Insert Books Here !");
	employee_DataRepository.save(employess_Data);  
    System.out.println(" Inserted successfully  !");
}  

//updating a record  
public void updateEmployee(Employess_Data employess_Data, int empId)   
{  
	employee_DataRepository.save(employess_Data);  
} 

}  
