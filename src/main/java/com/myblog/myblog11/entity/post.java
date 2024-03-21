package com.myblog.myblog11.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name =  "posts")

public class post {
    private long id;
    private String tittle;
    private String description;
    private String content;
}
