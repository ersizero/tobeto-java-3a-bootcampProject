package com.tobeto.bootcampProject.business.requests.create.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String password;
    private String position;
}
