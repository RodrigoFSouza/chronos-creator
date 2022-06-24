package com.chronos.chronoscreator.entity;

import com.chronos.chronoscreator.entity.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "creator_user")
public class User extends BaseEntity {

    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @Column(nullable = false, unique = true, length = 1024)
    private String email;

    @Column(nullable = false, length = 64)
    private String passwd;

    @Column(columnDefinition = "BOOL DEFAULT 't'")
    private boolean status;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Gender gender;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Book> books;
}
