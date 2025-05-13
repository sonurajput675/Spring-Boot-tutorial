package com.codewithsonu.Sprintboottutorial.Service;

import java.util.List;

import com.codewithsonu.Sprintboottutorial.Entity.Department;
import com.codewithsonu.Sprintboottutorial.error.DepartmentNotFoundException;

public interface DepartmentService  {

   public Department saveDepartment(Department department);

    public List<Department> fetchtheDepartments();

   public Department fetchtheDepartmentById(Long departmenId) throws DepartmentNotFoundException;

    public  void deleteByID(Long deparmentId);

    public Department updtateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

}
