package org.example;

public class Crocs {
    public String Species;
    public String Description;
    public  Crocs(String Species, String Description){
        this.Species = Species;
        this.Description=Description;

    }
    @Override
    public String toString(){
        return Species+ "- "+Description;}
    public String getCrocsS() {

        return Species;
    }
    public String getCrocsD() {

        return Description;
    }
}
