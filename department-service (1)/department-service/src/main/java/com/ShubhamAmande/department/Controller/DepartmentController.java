package com.ShubhamAmande.department.Controller;


import com.ShubhamAmande.department.Entity.Department;
import com.ShubhamAmande.department.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDept")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside Save Dept method of Controller");
        return departmentService.saveDept(department);
    }

    @GetMapping("/getDeptById/{departmentId}")
    public Department findDepartmentById(@PathVariable("departmentId") Long departmentId){
        log.info("Inside Get Dept By ID method of Controller");
        return departmentService.findDepartmentById(departmentId);
    }
}
