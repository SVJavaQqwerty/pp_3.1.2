package ru.svlid.servingwebcontent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brend;
    private String seria;
    private String generation;

    public Car(){

    }

    public Car(Long id, String brend, String seria, String generation) {
        this.brend = brend;
        this.seria = seria;
        this.generation = generation;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getBrend() {
        return brend;
    }

    public String getSeria() {
        return seria;
    }

    public String getGeneration() {
        return generation;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String toString() {
        return brend + " " + seria + " " + generation;
    }
}
