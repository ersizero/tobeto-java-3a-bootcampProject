package com.tobeto.bootcampProject.repositories;

import com.tobeto.bootcampProject.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Integer> {
}
