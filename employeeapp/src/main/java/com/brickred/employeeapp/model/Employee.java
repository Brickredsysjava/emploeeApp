package com.brickred.employeeapp.model;

import lombok.*;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer memberId;

//    @DateTimeFormat(fallbackPatterns = "yyyy/MM/dd")
//    private Date joiningDate;


    private String name;

//    @Size(min=10,max=10)

    private Long mobile;



    private String email;

    @Embedded
    private Address address;



}
