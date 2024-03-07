package com.tobeto.bootcampProject.controller;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.requests.create.applicant.UpdateApplicantRequest;
import com.tobeto.bootcampProject.business.requests.create.employee.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.requests.create.employee.UpdateEmployeeRequest;
import com.tobeto.bootcampProject.business.responses.create.applicant.UpdateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.employee.CreateEmployeeResponse;
import com.tobeto.bootcampProject.business.responses.create.employee.GetAllEmployeeResponse;
import com.tobeto.bootcampProject.business.responses.create.employee.GetEmployeeResponseById;
import com.tobeto.bootcampProject.business.responses.create.employee.UpdateEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor

public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping("/create")
    CreateEmployeeResponse create(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
        return employeeService.create(createEmployeeRequest);
    }

    @GetMapping("/{employeeId}")
    GetEmployeeResponseById getById(@PathVariable int employeeId) {
        return employeeService.getById(employeeId);
    }
    @GetMapping("/getall")
    public List<GetAllEmployeeResponse> getAll() {
        return employeeService.getAll();
    }

}
