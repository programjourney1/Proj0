package org.example;

public class Snakes {
    public String Species;
    public String Description;
    public  Snakes(String Species, String Description){
        this.Species = Species;
        this.Description=Description;

    }
    @Override
    public String toString(){
        return Species+ "- "+Description;}
    public String getSnakesS() {

        return Species;
    }
    public String getSnakesD() {

        return Description;
    }
}
