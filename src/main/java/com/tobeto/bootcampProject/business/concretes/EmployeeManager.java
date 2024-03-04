package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.requests.create.employee.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.responses.create.employee.CreateEmployeeResponse;
import com.tobeto.bootcampProject.business.responses.create.employee.GetAllEmployeeResponse;
import com.tobeto.bootcampProject.business.responses.create.employee.GetEmployeeResponseById;
import com.tobeto.bootcampProject.core.mapper.ModelMapperService;
import com.tobeto.bootcampProject.entities.Employee;
import com.tobeto.bootcampProject.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public GetEmployeeResponseById getById(int employeeId) {
        Employee getEmployee = employeeRepository.findById(employeeId)
                .orElseThrow(()-> new RuntimeException("Bu id bulunamadı"));
        return modelMapperService.forResponse().map(getEmployee, GetEmployeeResponseById.class);
    }

    @Override
    public List<GetAllEmployeeResponse> getAll() {
        List<Employee> employees = employeeRepository.findAll();
        List<GetAllEmployeeResponse> employeeResponses = employees.stream().map(employee -> modelMapperService
                        .forResponse()
                        .map(employee, GetAllEmployeeResponse.class))
                .collect(Collectors.toList());
        return employeeResponses;
    }
}
