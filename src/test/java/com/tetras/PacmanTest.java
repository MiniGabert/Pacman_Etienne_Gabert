/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PacmanTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    class PacmanInstanciator implements Runnable {
        @Override
        public void run() {
            System.out.println(Pacman.getInstance());
        }
    };

    @Test
    void testSingleton() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(new PacmanInstanciator());
        executor.submit(new PacmanInstanciator());

        executor.awaitTermination(2, TimeUnit.SECONDS);

        while (outContent.size() == 0) {
            // Wait sysout done
            Thread.sleep(2);
        }
        //
        String[] outputList = outContent.toString().split("\\n");
        assertEquals(2, outputList.length);
        assertEquals(outputList[0], outputList[1]);
    }

    @Test
    void TestPacGomme(){

        IpacGomme executor1 = FactoryPacGomme.getPacGomme();
        IpacGomme executor2 = FactoryPacGomme.getPacGomme();
        IpacGomme executor3 = FactoryPacGomme.getPacGomme();
        IpacGomme executor4 = FactoryPacGomme.getPacGomme();
        IpacGomme executor5 = FactoryPacGomme.getPacGomme();
        IpacGomme executor6 = FactoryPacGomme.getPacGomme();
        IpacGomme executor7 = FactoryPacGomme.getPacGomme();
        IpacGomme executor8 = FactoryPacGomme.getPacGomme();
        IpacGomme executor9 = FactoryPacGomme.getPacGomme();
        IpacGomme executor10 = FactoryPacGomme.getPacGomme();
        IpacGomme executor11 = FactoryPacGomme.getPacGomme();
        IpacGomme executor12 = FactoryPacGomme.getPacGomme();
        IpacGomme executor13 = FactoryPacGomme.getPacGomme();
        IpacGomme executor14 = FactoryPacGomme.getPacGomme();
        IpacGomme executor15 = FactoryPacGomme.getPacGomme();
        IpacGomme executor16 = FactoryPacGomme.getPacGomme();

        assertTrue(executor1 instanceof PacGomme);
        assertTrue(executor2 instanceof PacGomme);
        assertTrue(executor3 instanceof PacGomme);
        assertTrue(executor4 instanceof PacGomme);
        assertTrue(executor5 instanceof PacGomme);
        assertTrue(executor6 instanceof PacGomme);
        assertTrue(executor7 instanceof PacGomme);
        assertTrue(executor8 instanceof PacGomme);
        assertTrue(executor9 instanceof PacGomme);
        assertTrue(executor10 instanceof PacGomme);
        assertTrue(executor11 instanceof PacGomme);
        assertTrue(executor12 instanceof PacGomme);
        assertTrue(executor13 instanceof PacGomme);
        assertTrue(executor14 instanceof PacGomme);
        assertTrue(executor14.getCouleur() == "jaune");
        assertTrue(executor15 instanceof PacGommeBoost);
        assertTrue(executor15.getCouleur() == "bleu");
        
    }

}
