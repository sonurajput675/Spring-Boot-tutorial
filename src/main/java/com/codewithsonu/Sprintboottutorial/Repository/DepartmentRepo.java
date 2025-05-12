package com.codewithsonu.Sprintboottutorial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithsonu.Sprintboottutorial.Entity.Department;





// Repository provide the fuction to perform in our database and our data
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
