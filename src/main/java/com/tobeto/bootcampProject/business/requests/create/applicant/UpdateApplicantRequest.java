package com.tobeto.bootcampProject.business.requests.create.applicant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateApplicantRequest {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String password;
    private String about;
    private Date dateUpdated;
}
