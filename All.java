package org.example;

public class All {
        public String Species;
        public String Description;
        public String Enviro;
        public All(String Species, String Description ,String Enviro) {
            this.Species = Species;
            this.Description = Description;
            this.Enviro = Enviro;}
        @Override
        public String toString() {
            return Species + " - "+ Description+" - Found in: " +Enviro;
        }
        public String getEnviroS() {
            return Species;
        }

        public String getEnviroE() {
            return Enviro;
        }
    }

