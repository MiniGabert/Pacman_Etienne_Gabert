package com.tetras;

public class Pacman {

    // volatile protège de la lecture lors d'une écriture
    private static volatile Pacman instance;

    private Pacman() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Pacman getInstance() {
        if (instance == null) {
            synchronized (Pacman.class) {
                if (instance == null) {
                    instance = new Pacman();
                }
            }
        }
        return instance;
    }

}