package com.ShubhamAmande.department.Service;


import com.ShubhamAmande.department.Entity.Department;
import com.ShubhamAmande.department.Repositry.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDept(Department department) {
        log.info("Inside Save Dept method of Service");
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside get Dept By id  method of Service");
        return departmentRepo.findById(departmentId).orElse(null);
    }
}
