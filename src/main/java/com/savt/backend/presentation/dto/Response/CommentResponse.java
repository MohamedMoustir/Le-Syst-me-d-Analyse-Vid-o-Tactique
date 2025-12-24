package com.savt.backend.presentation.dto.Response;

import lombok.Data;

@Data
public class CommentResponse {
    private String auteurNom;
    private String contenu;
    private String formattedTime;
    private String dateCreation;
}
