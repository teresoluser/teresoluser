package org.acme;

import io.agroal.api.AgroalDataSource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class ServiceClass {

  @Inject
    AgroalDataSource agroalDataSource;


    Statement stmt;
    ResultSet rs;
    Connection con;


    public List<Employee> showAllPersons() throws SQLException  {
        List <Employee> list =new ArrayList<>();
        con=agroalDataSource.getConnection();
        stmt=con.createStatement();
        String query="select * from Employee";
        rs=stmt.executeQuery(query);
        while(rs.next()){
            Employee employee=new Employee();
            employee.setLastName(rs.getString("LastName"));
            employee.setFirstName(rs.getString("FirstName"));
            employee.setAge(rs.getInt("Age"));
            employee.setPersonid(rs.getInt("Personid"));

            list.add(employee);
            System.out.println(list);
        }

       return list;
    }

    public Employee showById(int id)   {
        Employee employee=new Employee();
        try {
            con = agroalDataSource.getConnection();
            stmt = con.createStatement();
            String query = "select * from Employee where Personid='" + id + "'";
            rs = stmt.executeQuery(query);
            if (rs.next()) {

                employee.setLastName(rs.getString("LastName"));
                employee.setFirstName(rs.getString("FirstName"));
                employee.setAge(rs.getInt("Age"));
                employee.setPersonid(rs.getInt("Personid"));
                //list.add(persons);
            } else {
                System.out.println(" REcord Not Exis");
            }
            return employee;
        }catch (Exception e){
            System.out.println("DB Error");
            e.printStackTrace();

        }
        return employee;
    }

    public Integer delete(int id)   {
        int row=0;
        try {
            con = agroalDataSource.getConnection();
            stmt = con.createStatement();
            String query = "select * from Employee where Personid='" + id + "'";
            row = stmt.executeUpdate(query);
            if (row>0) {
             System.out.println("Record Deleted ");
            } else {
                System.out.println(" Record not Deleted");
            }
        }catch (Exception e){
            System.out.println("DB Error");
            e.printStackTrace();
        }
        return row;
    }

    public Integer insert(int personid,String fname,String lname,int age)   {
        System.out.println(fname);
        System.out.println(" Methods Are  : ");
        int row=0;
        try {
            con = agroalDataSource.getConnection();
            stmt = con.createStatement();
            String query = "insert into Employee (Personid,FirstName,LastName,Age)values("+personid+",'"+fname+"','"+lname+"',"+age+")";
            row = stmt.executeUpdate(query);
            System.out.println(" Query : "+query);
            if (row>0) {
                System.out.println("Record Inserted ");
            } else {
                System.out.println(" Record not Inserted");
            }
        }catch (Exception e){
            System.out.println("DB Error");
            e.printStackTrace();
        }
        return row;
    }


    public Integer insert(Employee employee)   {
        System.out.println(employee.getLastName());
        System.out.println(" Methods Are  : ");
        int row=0;
        try {
            con = agroalDataSource.getConnection();
            stmt = con.createStatement();
            String query = "insert into Employee (personid,firstName,lastName,age)values("+ employee.getPersonid()+",'"+employee.getLastName()+"','"+employee.getFirstName()+"',"+employee.getAge()+")";
            row = stmt.executeUpdate(query);
            System.out.println(" Query : "+query);
            if (row>0) {
                System.out.println("Record Inserted ");
            } else {
                System.out.println(" Record not Inserted");
            }
        }catch (Exception e){
            System.out.println("DB Error");
            e.printStackTrace();
        }
        return row;
    }


    public Integer updateByIdService(int id,Employee employee)   {
        System.out.println("   Update service calls ");
        //Employee employee=new Employee();
        int row=0;
        try {
            con = agroalDataSource.getConnection();
            stmt = con.createStatement();
            String query = "update  Employee "      +" set FirstName ='"+employee.getFirstName()+"' ,LastName='"+employee.getLastName()+"' , Age='"+employee.getAge()+"'   where Personid="+ id ;
            row = stmt.executeUpdate(query);
            if (row>0){
                System.out.println(" REcord  Updated");
            } else {
                System.out.println(" REcord Not Updated");
            }
            return row;
        }catch (Exception e){
            System.out.println("DB Error");
            e.printStackTrace();

        }
        return row;
    }

}
