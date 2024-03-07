package com.tobeto.bootcampProject.controller;

import com.tobeto.bootcampProject.business.abstracts.InstructorService;
import com.tobeto.bootcampProject.business.requests.create.instructor.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.responses.create.instructor.CreateInstructorResponse;
import com.tobeto.bootcampProject.business.responses.create.instructor.GetAllInstructorResponse;
import com.tobeto.bootcampProject.business.responses.create.instructor.GetInstructorResponseById;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/instructors")
@AllArgsConstructor
public class InstructorController {
    private InstructorService instructorService;
    @PostMapping("/create")
    CreateInstructorResponse create(@RequestBody CreateInstructorRequest createInstructorRequest){
        return instructorService.create(createInstructorRequest);
    }
    @GetMapping("/{instructorId}")
    GetInstructorResponseById getById(@PathVariable int instructorId) {
        return instructorService.getById(instructorId);
    }
    @GetMapping("/getall")
    public List<GetAllInstructorResponse> getAll() {
        return instructorService.getAll();
    }
}

