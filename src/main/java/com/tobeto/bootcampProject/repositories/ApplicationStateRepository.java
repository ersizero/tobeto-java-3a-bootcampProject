package com.tobeto.bootcampProject.repositories;

import com.tobeto.bootcampProject.entities.ApplicationState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationStateRepository extends JpaRepository<ApplicationState,Integer> {
}
