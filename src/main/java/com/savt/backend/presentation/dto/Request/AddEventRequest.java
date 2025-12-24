package com.savt.backend.presentation.dto.Request;

import lombok.Data;

@Data
public class AddEventRequest {
    private Long timestampVideo;
    private String type;
    private String description;
}