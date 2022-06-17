package com.chronos.chronoscreator.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
@Data
@EqualsAndHashCode(of = "id")
public class Category extends BaseEntity {

    public String nome;
    public String descricao;
}
