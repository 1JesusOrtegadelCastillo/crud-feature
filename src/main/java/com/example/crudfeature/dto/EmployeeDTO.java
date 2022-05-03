package com.example.crudfeature.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class EmployeeDTO {

    private int id;
    private String name;
    private String lastName;
    private int age;

}
