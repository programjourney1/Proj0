package Util;
import java.sql.Connection;

import Service.EnviroService;
import Service.ReptileService;
import org.example.Enviro;
import org.example.Reptiles;
import Util.connUtil;

import java.sql.SQLException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Connection conn= connUtil.getConnection();
        EnviroService rs= null;
        try {
            rs = new EnviroService();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println(" /  \\ ___ ____  ___ ___     ___    ___   ___ ");
        System.out.println(" |  | |   |___|  |   |  |   |      |  \\ |    \\  /");
        System.out.println(" |_/  |_  |      |   |  |   |__  ~ |  | |_    \\/");
        System.out.println(" | \\  |   |      |   |  |   |    ~ |  | |     /\\");
        System.out.println(" |  \\ |__ |      |  _|_ L__ |__    |_/  |___ /  \\");
        System.out.println("---------------------------------------------------");
        ///////////////
        System.out.println("Welcome to The Reptile Encyclopedia.");
        ReptileService rts = new ReptileService();
        ////////////////////////main menu
System.out.println("Choose Action: 1= Read Entries, 2= Write Entry, 3= Search For Environment, 4= Add Environment,5= ALL DATA, 6= ReadMe");
///////////////////////////////////////////////////////////////read
int c;
              c = sc.nextInt();
        if (c == 1){
           Scanner sk = new Scanner(System.in);
            System.out.println("You have selected to read entries");
            System.out.println("Select Type of Reptile: 1= Lizards, 2= Turtles, 3= Crocodilia, 4= Snakes");
           int k;
            k = sk.nextInt();
            if(k== 1)
            { System.out.println("You have selected: Lizards");
                System.out.println(rts.getLizards());
            }
            else if (k== 2)
            { System.out.println("You have selected: Turtles");
                System.out.println(rts.getTurtles());}
            else if (k==3)
            { System.out.println("You have selected: Crocodilia");
                System.out.println(rts.getCrocs());}
            else if (k==4)
            { System.out.println("You have selected: Snakes");
                System.out.println(rts.getSnakes());}
            else{System.out.println("Not a valid input");}
                }
        //////////////////////////////////////////////////////////write
         else if (c == 2) {
            System.out.println("You have selected to write an entry.");
            Scanner sk = new Scanner(System.in);
            Scanner skd = new Scanner(System.in);
            System.out.println("Select Type of Reptile to add: 1= Lizards, 2= Turtles, 3= Crocodilia, 4= Snakes");
            int k;
            k = sk.nextInt();
            if(k== 1)
            {
                System.out.println("You have selected: Lizards \n"+"Please Input Species, and press enter:");
               String Species = sk.next();
                System.out.println("Input Description");
               String Description = skd.nextLine();
                rts.addLizard(Species, Description);
            }
            else if (k== 2)
            { System.out.println("You have selected: Turtles \n"+"Please Input Species, and press enter:");
                String Species = sk.next();
                System.out.println("Input Description");
                String Description = skd.nextLine();
                rts.addTurtle(Species, Description);
            }
            else if (k==3)
            { System.out.println("You have selected: Crocodilia \n"+"Please Input Species, and press enter:");
                String Species = sk.next();
                System.out.println("Input Description");
                String Description = skd.nextLine();
                rts.addCroc(Species, Description);
            }
            else if (k==4)
            { System.out.println("You have selected: Snakes \n"+"Please Input Species, and press enter:");
                String Species = sk.next();
                System.out.println("Input Description");
                String Description = skd.nextLine();
                rts.addSnake(Species, Description);
            }
            else{System.out.println("Not a valid input");}
        }
         ///////////////////////////////////Search Enviro Read
        else if (c == 3) {
            System.out.println("====================================== \n" +
                    "____                     ___           \n" +
                    "|    |\\  | \\      /_____ |  |  ____    \n" +
                    "|_   | \\ |  \\    /   |   |__|  |   |   \n" +
                    "|    |  \\|   \\  /    |   |  \\  |   |   \n" +
                    "|___ |   \\    \\/   __|__ |   \\ |___|   \n" +
                    "====================================== \n" +
                    " ____   ___  ___  __   _____           \n" +
                    " |     |    |  | |  |  |     |  |      \n" +
                    " |___  |_   |__| |__|  |     |__|      \n" +
                    "     | |    |  | |  \\  |     |  |      \n" +
                    " ____| |___ |  | |   \\ |____ |  |      \n" +
                    "=======================================");
            System.out.println("Search for Natural Environment by Species. Type Species name:");
            Scanner skd = new Scanner(System.in);
            String spec;
            spec = skd.next();
            System.out.println(rs.getEnviro(spec));
        }
        //////////////////////////////Enviro Write
        else if (c == 4) {
            System.out.println("You have selected to add a Species and Environment to the Environment database. \n Type Species Name:");
            Scanner skd = new Scanner(System.in);
            Scanner sk = new Scanner(System.in);
            String Species = skd.next();
            System.out.println("Type Species Environment");
            String Enviro = skd.next();
            rts.addEnviro(Species, Enviro);
        }

         ///////////////////////////////Show All
        else if (c==5){
            System.out.println("Showing ALL results stored:");
            System.out.println(rs.getAll());
        }

        //////////////////////////////ReadMe
        else if (c == 6){
                System.out.println("ReadMe: This program is an interactive encyclopedia of reptile facts. " + '\n'+
                        "It is divided by reptile Order and then Species. "+'\n' +"You may input an entry or read previous entries");
            System.out.println("Environment includes Species and their natural Environment. You may add entries to this field as well. \n" +
                    "A full list off all data is also available ");
                }
            else{System.out.println("Not a valid input");}
///////////////////////////////////
        }
    }


