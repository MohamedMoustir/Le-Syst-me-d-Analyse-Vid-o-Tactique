package com.savt.backend.presentation.dto.Request;


import lombok.Data;

@Data
public class AddCommentRequest {
    private String auteurNom;
    private String contenu;
    private Long timestampVideo;
}