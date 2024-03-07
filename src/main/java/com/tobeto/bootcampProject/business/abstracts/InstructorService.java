package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.responses.create.instructor.CreateInstructorResponse;
import com.tobeto.bootcampProject.business.responses.create.instructor.GetAllInstructorResponse;
import com.tobeto.bootcampProject.business.responses.create.instructor.GetInstructorResponseById;

import java.util.List;

public interface InstructorService {
    CreateInstructorResponse create(CreateInstructorRequest createInstructorRequest);

    GetInstructorResponseById getById(int instructorId);

    List<GetAllInstructorResponse> getAll();

}
