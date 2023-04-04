package ua.goodvice.easylib.easylib.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * POJO class which represents a user
 * Lombok @Data annotation was used. This annotation set up setters and getters for every field
 *
 * @author goodvice
 * @version 1.0
 */
@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private int username;

    @Column(name = "password")
    private String password;
}
