package com.ifti.ems_backend.service.impl;

import com.ifti.ems_backend.dto.EmployeeDto;
import com.ifti.ems_backend.entity.Employee;
import com.ifti.ems_backend.mapper.EmployeeMapper;
import com.ifti.ems_backend.repository.EmployeeRepository;
import com.ifti.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee =  employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
