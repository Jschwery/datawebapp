package com.schwery.datawebapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "Users_Table")
public class Users {

    @SequenceGenerator(name = "user_sequence_generator",
            sequenceName = "user_sequence_generator",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence_generator")
    @Id
    @Column(name = "User_ID")
    Long userID;


}
