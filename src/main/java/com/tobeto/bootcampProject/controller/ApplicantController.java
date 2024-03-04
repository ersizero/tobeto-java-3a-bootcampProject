package com.tobeto.bootcampProject.controller;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicant.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetApplicantResponseById;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/applicants")
public class ApplicantController {
    private ApplicantService applicantService;

    @PostMapping
    public CreateApplicantResponse create(@RequestBody CreateApplicantRequest createApplicantRequest){
        return applicantService.create(createApplicantRequest);
    }
    @GetMapping("/{applicantId}")
    public GetApplicantResponseById getById(@PathVariable int applicantId) {
        return applicantService.getById(applicantId);
    }
    @GetMapping("/getall")
    public List<GetAllApplicantResponse> getAll() {
        return applicantService.getAll();
    }
}
