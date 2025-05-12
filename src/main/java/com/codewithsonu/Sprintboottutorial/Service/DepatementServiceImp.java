package com.codewithsonu.Sprintboottutorial.Service;

import java.util.List;
import java.util.Objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithsonu.Sprintboottutorial.Entity.Department;
import com.codewithsonu.Sprintboottutorial.Repository.DepartmentRepo;


@Service
public class DepatementServiceImp implements DepartmentService {


    @Autowired
    private DepartmentRepo departmentRepo;


    @Override
    public Department saveDepartment(Department department) {
      
        return departmentRepo.save(department);

    }


    @Override
    public List<Department> fetchtheDepartments() {
      return departmentRepo.findAll();
    }


    @Override
    public Department fetchtheDepartmentById(Long departmenId) {
        return departmentRepo.findById(departmenId).get();
     }


    @Override
    public void deleteByID(Long deparmentId) {
        departmentRepo.deleteById(deparmentId);
    }


    @Override
    public Department updtateDepartment(Long departmentId, Department department) {

        Department depDb = departmentRepo.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) &&
         !"".equalsIgnoreCase(department.getDepartmentName())){
            depDb.setDepartmentName(department.getDepartmentName());
         }

         if(Objects.nonNull(department.getDepartmentCode()) &&
         !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDb.setDepartmentCode(department.getDepartmentCode());
         }

         if(Objects.nonNull(department.getDepartmentAddress()) &&
         !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDb.setDepartmentAddress(department.getDepartmentAddress());
         }


       return departmentRepo.save(depDb);
    }


    @Override
    public Department fetchDepartmentByName(String departmentName) {
      return departmentRepo.findByDepartmentNameIgnoreCase(departmentName);
    }

     
    }