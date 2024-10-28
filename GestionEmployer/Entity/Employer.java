package com.example.GestionEmployer.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String prenom;
    private Date datedeNaissance;

    public Employer() {
    }

    public Employer(int id, String name, String prenom, Date datedeNaissance, int age) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.datedeNaissance = datedeNaissance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDatedeNaissance(Date datedeNaissance) {
        this.datedeNaissance = datedeNaissance;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDatedeNaissance() {
        return datedeNaissance;
    }
}
