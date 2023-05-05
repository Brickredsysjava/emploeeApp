package com.brickred.employeeapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @NotNull
    private String city;

    @NotNull
    private  String state;

    @NotNull
//    @Size(min=6,max=6)
    private Integer pinCode;

    @NotNull
    private String country;

}
