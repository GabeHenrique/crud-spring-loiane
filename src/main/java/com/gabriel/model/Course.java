package com.gabriel.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;
    @Column(length = 150, nullable = false)
    private String name;
    @Column(length = 100, nullable = false)
    private String category;

    public Course(String name, String category) {
        this.name = name;
        this.category = category;
    }
}


