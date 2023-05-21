package com.ShubhamAmande.department.Repositry;

import com.ShubhamAmande.department.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {


   // Department findDepartmentById(Long departmentId);
}
