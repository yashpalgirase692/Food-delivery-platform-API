package com.example.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tokenId;
    private String tokenValue;
    private LocalDateTime tokenCreationDateTime;

    @OneToOne
    @JoinColumn(name = "fk_user_Id")
    User user;

    public AuthenticationToken(User user) {
        this.user = user;
        this.tokenValue = UUID.randomUUID().toString();  // to generate some unique string(token)
        this.tokenCreationDateTime = LocalDateTime.now();
    }
}
