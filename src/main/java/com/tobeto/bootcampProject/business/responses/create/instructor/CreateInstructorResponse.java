package com.tobeto.bootcampProject.business.responses.create.instructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInstructorResponse {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String companyName;
    private LocalDate dateCreated;

}
