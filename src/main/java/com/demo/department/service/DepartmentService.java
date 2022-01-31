package com.demo.department.service;

import com.demo.department.entity.Department;
import com.demo.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside DepartmentService::saveDepartment");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        log.info("Inside DepartmentService::getDepartmentById");
        return departmentRepository.getDepartmentByDepartmentId(id);
    }
}
