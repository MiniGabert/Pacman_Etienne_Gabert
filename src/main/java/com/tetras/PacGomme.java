package com.tetras;

public class PacGomme implements IpacGomme {


    private String couleur = "jaune";
    private int taille = 5;

    public PacGomme() {
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}