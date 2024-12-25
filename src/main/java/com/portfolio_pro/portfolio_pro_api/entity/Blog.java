package com.portfolio_pro.portfolio_pro_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "blog")
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Lob
    @Column
    private String content;
}
