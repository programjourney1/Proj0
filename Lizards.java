package org.example;

public class Lizards {
    public String Species;
    public String Description;


    public Lizards(String Species, String Description) {
        this.Species = Species;
        this.Description = Description;
    }

    /////////////

    @Override
    public String toString() {
        return Species + "- " + Description;
    }
    public String getLizardS() {

        return Species;
    }
    public String getLizardD() {

        return Description;
    }

    public void setSpecies(String Species){this.Species=Species;}

}
