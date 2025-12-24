package com.savt.backend.domain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tracking_data")
public class PositionData {

    @Id
    private String id;

    @Indexed
    private String videoId;

    private Long frameNumber;
    private Float x;
    private Float y;
    private Float speed;

    private String joueurId;
}
