package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.responses.create.applicant.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.responses.create.applicant.GetApplicantResponseById;
import com.tobeto.bootcampProject.core.mapper.ModelMapperService;
import com.tobeto.bootcampProject.entities.Applicant;
import com.tobeto.bootcampProject.repositories.ApplicantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ApplicantManager implements ApplicantService {
    private ApplicantRepository applicantRepository;
    private ModelMapperService modelMapperService;

    @Override
    public CreateApplicantResponse create(CreateApplicantRequest createApplicantRequest) {
        Applicant applicantToBeCreate = modelMapperService.forRequest()
                .map(createApplicantRequest, Applicant.class);
        applicantRepository.save(applicantToBeCreate);
        CreateApplicantResponse response = modelMapperService.forResponse()
                .map(applicantToBeCreate, CreateApplicantResponse.class);
        return response;
    }

    @Override
    public GetApplicantResponseById getById(int applicantId) {
        Applicant getApplicant = applicantRepository.findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id bulunamadı"));
        return modelMapperService.forResponse().map(getApplicant, GetApplicantResponseById.class);
    }

    @Override
    public List<GetAllApplicantResponse> getAll() {
        List<Applicant> applicants = applicantRepository.findAll();
        List<GetAllApplicantResponse> applicantResponses = applicants.stream().map(applicant -> modelMapperService
                        .forResponse()
                        .map(applicant, GetAllApplicantResponse.class))
                .collect(Collectors.toList());
        return applicantResponses;
    }
}
