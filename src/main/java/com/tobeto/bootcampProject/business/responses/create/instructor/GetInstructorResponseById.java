package com.tobeto.bootcampProject.business.responses.create.instructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetInstructorResponseById {

    private String userName;
    private String email;
    private String companyName;
}
