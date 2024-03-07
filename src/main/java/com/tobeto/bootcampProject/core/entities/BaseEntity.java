package com.tobeto.bootcampProject.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

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
    private Date dateCreated;

    @Column (name = "dateUpdated")
    private Date dateUpdated;

    @Column (name = "dateRemoved")
    private Date dateRemoved;
}
