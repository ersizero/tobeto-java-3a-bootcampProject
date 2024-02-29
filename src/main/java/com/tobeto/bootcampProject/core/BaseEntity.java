package com.tobeto.bootcampProject.core;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass

public abstract class BaseEntity<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private T id;

    @Column(name = "dateCreated")
    private LocalDate dateCreated;

    @Column (name = "dateUpdated")
    private LocalDate dateUpdated;

    @Column (name = "dateRemoved")
    private LocalDate dateRemoved;
}
