package com.chronos.chronoscreator.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private LocalDateTime dataCriacao;
    private LocalDateTime dataUltimaAlteracao;
    private String usuarioCricao;
    private String usuarioUltimaAlteracao;
}
