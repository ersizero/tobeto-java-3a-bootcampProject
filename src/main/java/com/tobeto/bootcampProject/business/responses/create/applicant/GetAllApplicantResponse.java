package com.tobeto.bootcampProject.business.responses.create.applicant;

import com.tobeto.bootcampProject.entities.Applicant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllApplicantResponse {
    private int id;
    private String userName;
    private String email;
    private String about;
}
