package com.savt.backend.domain.entity;

import com.savt.backend.domain.enums.TypeEvenement;
import lombok.Data;

@Data
public class EvenementMatch {
    private Long timestampVideo;
    private String description;
    private TypeEvenement type;
}