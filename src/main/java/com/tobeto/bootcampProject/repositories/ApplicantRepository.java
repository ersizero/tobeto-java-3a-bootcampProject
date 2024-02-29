package com.tobeto.bootcampProject.repositories;

import com.tobeto.bootcampProject.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
}
