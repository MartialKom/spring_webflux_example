package com.martial.user_webflux.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("utilisateurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class User {

    @Id
    private Integer id;
    @Column("lastname")
    private String lastName;
    @Column("firstname")
    private String firstName;
    private String email;
}
