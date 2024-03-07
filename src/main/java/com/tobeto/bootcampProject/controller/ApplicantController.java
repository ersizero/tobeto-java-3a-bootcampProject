package com.tobeto.bootcampProject.controller;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.requests.create.applicant.UpdateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicant.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetApplicantResponseById;
import com.tobeto.bootcampProject.business.responses.create.applicant.UpdateApplicantResponse;
import com.tobeto.bootcampProject.entities.Applicant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/applicants")
public class ApplicantController {
    private ApplicantService applicantService;

    @PostMapping("/create")
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
    @PutMapping("/update/{applicantId}")
    public UpdateApplicantResponse update(@PathVariable int applicantId, @RequestBody UpdateApplicantRequest updateApplicantRequest){
        return applicantService.update(applicantId, updateApplicantRequest);
    }
    @DeleteMapping("/deleteall")
    public void deleteAll() {
        applicantService.deleteAll();
    }

}
