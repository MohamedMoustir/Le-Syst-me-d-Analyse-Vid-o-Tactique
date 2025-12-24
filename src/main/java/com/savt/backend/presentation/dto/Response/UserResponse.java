package com.savt.backend.presentation.dto.Response;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class UserResponse {
    private String id;
    private String nom;
    private String email;
    private String role;
    private String token;
}