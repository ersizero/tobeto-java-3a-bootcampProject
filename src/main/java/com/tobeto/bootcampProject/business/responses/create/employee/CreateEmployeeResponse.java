package com.tobeto.bootcampProject.business.responses.create.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeResponse {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private LocalDate dateCreated;

}
