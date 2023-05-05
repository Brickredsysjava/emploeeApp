package com.brickred.employeeapp.dto;

import com.brickred.employeeapp.model.Address;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Embedded;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {

//    @DateTimeFormat(fallbackPatterns = "yyyy/MM/dd")
//    private Date joiningDate;

    @NotNull
    private String name;


    private Long mobile;


    private String email;


    private Address address;



}
