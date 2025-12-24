package com.savt.backend.presentation.dto.Response;

import lombok.Data;

@Data
public class EventResponse {
    private Long timestampVideo;
    private String formattedTime; // ex: "10:23" (min:sec)
    private String type;
    private String description;
}