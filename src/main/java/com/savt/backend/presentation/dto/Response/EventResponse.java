package com.savt.backend.presentation.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EventResponse {
    private Long timestampVideo;
    private String formattedTime; // ex: "10:23" (min:sec)
    private String type;
    private String description;
}