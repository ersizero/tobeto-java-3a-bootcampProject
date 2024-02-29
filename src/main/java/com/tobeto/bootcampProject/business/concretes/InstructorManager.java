package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.InstructorService;
import com.tobeto.bootcampProject.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.responses.create.instructor.CreateInstructorResponse;
import com.tobeto.bootcampProject.core.mapper.ModelMapperService;
import com.tobeto.bootcampProject.entities.Instructor;
import com.tobeto.bootcampProject.repositories.InstructorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InstructorManager implements InstructorService {
    private InstructorRepository insturctorRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreateInstructorResponse create(CreateInstructorRequest createInstructorRequest) {
        Instructor instructorToBeCreated = modelMapperService.forRequest().map(createInstructorRequest, Instructor.class);
        insturctorRepository.save(instructorToBeCreated);
        CreateInstructorResponse response = modelMapperService.forResponse()
                .map(instructorToBeCreated, CreateInstructorResponse.class);
        return response;
    }
}
