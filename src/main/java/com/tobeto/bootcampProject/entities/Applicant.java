package com.tobeto.bootcampProject.entities;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "applicants")
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = true)

public class Applicant extends User {

    @Column(name = "about")
    private String about;

}
