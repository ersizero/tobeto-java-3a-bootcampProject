package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.requests.create.applicant.UpdateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicant.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetApplicantResponseById;
import com.tobeto.bootcampProject.business.responses.create.applicant.UpdateApplicantResponse;
import com.tobeto.bootcampProject.entities.Applicant;

import java.util.List;

public interface ApplicantService {
    CreateApplicantResponse create(CreateApplicantRequest createApplicantRequest);

    GetApplicantResponseById getById(int applicantId);

    List<GetAllApplicantResponse> getAll();

    UpdateApplicantResponse update(int applicantId, UpdateApplicantRequest updateApplicantRequest);
    void deleteAll();
}
