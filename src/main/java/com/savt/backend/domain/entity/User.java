package com.savt.backend.domain.entity;

import com.savt.backend.domain.enums.Role;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
@Data
@Builder
public class Utilisateur {
    @Id
    private String id;

    private String nom;
    private String email;
    private String password;
    private Role role;
}
