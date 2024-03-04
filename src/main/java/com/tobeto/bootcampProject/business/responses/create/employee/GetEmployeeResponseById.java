package com.tobeto.bootcampProject.business.responses.create.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeResponseById {
    private String userName;
    private String email;
    private String position;
}
