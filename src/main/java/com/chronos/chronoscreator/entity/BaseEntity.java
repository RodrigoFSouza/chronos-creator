package com.chronos.chronoscreator.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@MappedSuperclass
@EqualsAndHashCode(of = "id")
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    protected UUID id;

    @CreatedDate
    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    protected LocalDateTime createdDate;

    @LastModifiedDate
    @Column(nullable = true, columnDefinition = "TIMESTAMP")
    protected LocalDateTime lastModifiedDate;

    protected String createdUser;
    protected String lastModifiedUser;
}
