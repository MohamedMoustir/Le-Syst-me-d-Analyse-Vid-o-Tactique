package com.savt.backend.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Commentaire {
    private String auteurNom;
    private String contenu;
    private Long timestampVideo;
    private LocalDateTime dateCreation;
}