package com.savt.backend.presentation.dto.Request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddCommentRequest {
    private String auteurNom;
    private String contenu;
    private Long timestampVideo;
}