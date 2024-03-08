package com.tobeto.bootcampProject.entities;

import com.tobeto.bootcampProject.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blacklists")
@EqualsAndHashCode(callSuper = true)
public class Blacklist extends BaseEntity<Integer> {

    @Column(name = "reason")
    private String reason;

    @Column(name = "date")
    private Date date;

    @OneToOne
    @JoinColumn(name = "applicant_id")
    private Applicant applicant;

}
