package com.tobeto.bootcampProject.entities;

import com.tobeto.bootcampProject.core.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = true)
public  class User extends BaseEntity<Integer> {

    @Column(name ="user_name")
    private String userName;

    @Column (name ="first_name")
    private String firstName;

    @Column (name ="last_name")
    private String lastName;

    @Column (name ="date_of_birth")
    private Date dateOfBirth;

    @Column (name ="national_identity")
    private String nationalIdentity;

    @Column (name ="email")
    private String email;

    @Column (name ="password")
    private String password;
}
