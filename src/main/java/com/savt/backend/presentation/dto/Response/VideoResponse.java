package com.savt.backend.presentation.dto.Response;

import lombok.Data;
import java.util.List;

@Data
public class VideoResponse {
    private String id;
    private String titre;
    private String urlFichier;
    private Long dureeSecondes;
    private String dateUpload;
    private String statut;

    private UserResponse uploader;

    private List<EventResponse> events;
    private List<CommentResponse> commentaires;
}