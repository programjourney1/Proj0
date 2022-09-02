package org.example;

public class Turtles {
    public String Species;
    public String Description;
    public  Turtles(String Species, String Description){
        this.Species = Species;
        this.Description=Description;

    }
    @Override
    public String toString(){
        return Species+ "- "+Description;}
    public String getTurtlesS() {

        return Species;
    }
    public String getTurtlesD() {

        return Description;
    }
}
