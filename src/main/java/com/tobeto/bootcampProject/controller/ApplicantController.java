package com.tobeto.bootcampProject.controller;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicant.CreateApplicantResponse;
import com.tobeto.bootcampProject.entities.Applicant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/applicants")
public class ApplicantController {
    private ApplicantService applicantService;

    @PostMapping
    public CreateApplicantResponse create(@RequestBody CreateApplicantRequest createApplicantRequest){
        return applicantService.create(createApplicantRequest);

    }
}
