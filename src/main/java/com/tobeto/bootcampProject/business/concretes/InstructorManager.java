package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.InstructorService;
import com.tobeto.bootcampProject.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.responses.create.instructor.CreateInstructorResponse;
import com.tobeto.bootcampProject.business.responses.create.instructor.GetAllInstructorResponse;
import com.tobeto.bootcampProject.business.responses.create.instructor.GetInstructorResponseById;
import com.tobeto.bootcampProject.core.mapper.ModelMapperService;
import com.tobeto.bootcampProject.entities.Instructor;
import com.tobeto.bootcampProject.repositories.InstructorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class InstructorManager implements InstructorService {
    private InstructorRepository instructorRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreateInstructorResponse create(CreateInstructorRequest createInstructorRequest) {
        Instructor instructorToBeCreated = modelMapperService.forRequest().map(createInstructorRequest, Instructor.class);
        instructorRepository.save(instructorToBeCreated);
        CreateInstructorResponse response = modelMapperService.forResponse()
                .map(instructorToBeCreated, CreateInstructorResponse.class);
        return response;
    }

    @Override
    public GetInstructorResponseById getById(int instructorId) {
        Instructor getInstructor = instructorRepository.findById(instructorId)
                .orElseThrow(()-> new RuntimeException("Bu id bulunamadı"));
        return modelMapperService.forResponse().map(getInstructor, GetInstructorResponseById.class);
    }
    @Override
    public List<GetAllInstructorResponse> getAll() {
        List<Instructor> instructors = instructorRepository.findAll();
        List<GetAllInstructorResponse> instructorResponses = instructors.stream().map(instructor -> modelMapperService
                        .forResponse()
                        .map(instructor, GetAllInstructorResponse.class))
                .collect(Collectors.toList());
        return instructorResponses;
    }
}
