package com.savt.backend.presentation.dto.Response;

import lombok.Data;

@Data
public class PositionResponse {
    private Long frameNumber;
    private Float x;
    private Float y;
    private Float speed;
    private String joueurNom;
}
