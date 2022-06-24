package com.chronos.chronoscreator.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "category")
public class Category extends BaseEntity {

    @Column(nullable = false, unique = true, length = 255)
    public String name;

    @Column(nullable = false, length = 255)
    public String description;
}
