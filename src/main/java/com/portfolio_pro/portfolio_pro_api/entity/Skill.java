package com.portfolio_pro.portfolio_pro_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
}
