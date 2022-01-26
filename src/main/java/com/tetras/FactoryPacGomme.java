package com.tetras;

public class FactoryPacGomme {
    private static int iterateur = 0;

    public static IpacGomme getPacGomme() {
        iterateur ++;
        if (iterateur % 15 == 0){
            return new PacGommeBoost();
        }
        else{
            return new PacGomme();
        }            
    }
}