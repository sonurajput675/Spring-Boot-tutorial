package com.codewithsonu.Sprintboottutorial.Controller;

import java.util.List;

import com.codewithsonu.Sprintboottutorial.error.DepartmentNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithsonu.Sprintboottutorial.Entity.Department;
import com.codewithsonu.Sprintboottutorial.Service.DepartmentService;

import jakarta.validation.Valid;



@RestController
public class DepartmentController  {

     private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    // create logger for imlementation by slf4j 
    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(DepartmentController.class);

 // post data api to post the data in database 
    @PostMapping("/departments")
    public Department saveDepartment( @Valid @RequestBody Department department){
        LOGGER.info("save the department inside the H2 database ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/data")
    public List<Department> fetchtheDepartments(){
        return departmentService.fetchtheDepartments();
    }

    // give the data by get mapping api  by @PathVariable annotation
    @GetMapping("/databyid/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmenId) throws DepartmentNotFoundException {
        LOGGER.info("Fetch the data inside the department");
        return departmentService.fetchtheDepartmentById(departmenId);
    }
    // delete the recored by id
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long deparmentId){
        departmentService.deleteByID(deparmentId);
        return "Succefully deleted this depatment  id user";
    }

    @PutMapping("/update/{id}")
    public Department updtateDepartment(@PathVariable("id") Long departmentId,
    @RequestBody Department department){
        return departmentService.updtateDepartment(departmentId,department);

    }

    
    @GetMapping("/department/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
 
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
