package com.chronos.chronoscreator.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "publisher")
public class Publisher extends BaseEntity {
    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(name = "foundation_date", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    private List<Book> books;
}
