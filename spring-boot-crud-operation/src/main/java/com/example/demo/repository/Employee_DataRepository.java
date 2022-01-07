package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employess_Data;
@Repository
public interface Employee_DataRepository extends CrudRepository<Employess_Data, Integer>   {

}
