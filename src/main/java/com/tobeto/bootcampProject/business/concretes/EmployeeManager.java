package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.requests.create.employee.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.responses.create.employee.CreateEmployeeResponse;
import com.tobeto.bootcampProject.core.mapper.ModelMapperService;
import com.tobeto.bootcampProject.entities.Employee;
import com.tobeto.bootcampProject.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreateEmployeeResponse create(CreateEmployeeRequest createEmployeeRequest) {
        Employee employeeToBeCreated = modelMapperService.forRequest().map(createEmployeeRequest, Employee.class);
        employeeRepository.save(employeeToBeCreated);
        CreateEmployeeResponse response = modelMapperService.forResponse()
                .map(employeeToBeCreated, CreateEmployeeResponse.class);
        return response;
    }
}
