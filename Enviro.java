package org.example;

public class Enviro {
    public String Species;
public String Enviro;
    public Enviro(String Species, String Enviro) {
        this.Species = Species;
        this.Enviro = Enviro;}
    @Override
    public String toString() {
        return Species + " for:" +Enviro;
    }


    public String getEnviroS() {
        return Species;
    }

    public String getEnviroE() {
        return Enviro;
    }
}
