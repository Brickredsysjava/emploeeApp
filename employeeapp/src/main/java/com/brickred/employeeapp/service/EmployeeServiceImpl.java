package com.brickred.employeeapp.service;

import com.brickred.employeeapp.dto.EmployeeDto;
import com.brickred.employeeapp.exception.EmployeeException;
import com.brickred.employeeapp.model.Employee;
import com.brickred.employeeapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void registerEmployee(EmployeeDto employeeDto) throws EmployeeException {
        if(employeeDto != null) {
            //employee from employeeDTo
            Employee employee = Employee.builder()
//                    .joiningDate(employeeDto.getJoiningDate())
                    .name(employeeDto.getName())
                    .mobile(employeeDto.getMobile())
                    .email(employeeDto.getEmail())
                    .address(employeeDto.getAddress())
                    .build();
            //saving employee to DB in Employee table
            employeeRepository.save(employee);
            //success message

        }else{
            //throw exception
            throw new EmployeeException("Please give proper input");
        }
    }

    @Override
    public Employee getbyId() throws EmployeeException {
        return null;
    }

    @Override
    public List<Employee> getallMember() throws EmployeeException {
        return null;
    }

    @Override
    public Employee deleteEmployeebyID(Integer id) throws EmployeeException {
        return null;
    }

    @Override
    public Employee updateEmployeeDetails(EmployeeDto employeeDto) throws EmployeeException {
        return null;
    }
}
