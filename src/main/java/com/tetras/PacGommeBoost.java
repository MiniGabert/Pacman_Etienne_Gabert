package com.tetras;

public class PacGommeBoost implements IpacGomme{
    
    private String couleur = "bleu";
    private int taille = 10;

    public PacGommeBoost() {
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
