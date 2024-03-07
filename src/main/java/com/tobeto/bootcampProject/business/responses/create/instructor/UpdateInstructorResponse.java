package com.tobeto.bootcampProject.business.responses.create.instructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInstructorResponse {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String nationalIdentity;
    private String email;
    private String companyName;
    private Date dateUpdated;
}
