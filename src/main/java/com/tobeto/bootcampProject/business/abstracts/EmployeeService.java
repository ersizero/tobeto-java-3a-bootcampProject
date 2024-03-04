package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.requests.create.employee.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.responses.create.employee.CreateEmployeeResponse;
import com.tobeto.bootcampProject.business.responses.create.employee.GetAllEmployeeResponse;
import com.tobeto.bootcampProject.business.responses.create.employee.GetEmployeeResponseById;

import java.util.List;

public interface EmployeeService {
    CreateEmployeeResponse create(CreateEmployeeRequest createEmployeeRequest);

    GetEmployeeResponseById getById(int employeeId);

    List<GetAllEmployeeResponse> getAll();

}
