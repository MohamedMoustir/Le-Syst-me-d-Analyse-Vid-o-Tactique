package com.savt.backend.presentation.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PositionResponse {
    private Long frameNumber;
    private Float x;
    private Float y;
    private Float speed;
    private String joueurNom;
}
