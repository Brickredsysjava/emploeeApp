package com.brickred.employeeapp.controller;

import com.brickred.employeeapp.dto.EmployeeDto;
import com.brickred.employeeapp.exception.EmployeeException;
import com.brickred.employeeapp.model.Employee;
import com.brickred.employeeapp.service.EmployeeService;
import com.brickred.employeeapp.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

     @PostMapping("/add")
    public ResponseEntity<String> registerEmployee(@RequestBody  EmployeeDto employeeDto) throws EmployeeException {

          employeeService.registerEmployee(employeeDto);
        return   ResponseEntity.ok("WELCOME TO BRICKRED");

     }


}
