package ua.goodvice.easylib.easylib.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private int username;

    @Column(name = "password")
    private String password;
}
