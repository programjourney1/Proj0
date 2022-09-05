package Service;
import DAO.ReptileRepo;
import org.example.*;

import java.sql.SQLException;
import java.util.*;
public class ReptileService {
    ReptileRepo r;
    EnviroService ee;
    public ReptileService()  {
        r = new ReptileRepo();
        try {
            ee= new EnviroService();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List <Lizards> getLizards(){return r.getLizards();}
    public List <Snakes> getSnakes(){return r.getSnakes();}
    public List <Crocs> getCrocs(){return r.getCrocs();}
    public List <Turtles> getTurtles(){return r.getTurtles();}
//////////////////////add
    public void addLizard(String Species, String Description){
        String existingLizard = r.getLizard(Species, Description);

            Lizards newLizard = new Lizards(Species, Description);
            r.addLizard(newLizard);}
//////////////
    public void addCroc(String Species, String Description){
        String existingCrocs = r.getCrocs(Species, Description);

        Crocs newCroc = new Crocs(Species, Description);
        r.addCrocs(newCroc);}
/////////
public void addSnake(String Species, String Description){
    String existingSnake = r.getCrocs(Species, Description);

    Snakes newSnake = new Snakes(Species, Description);
    r.addSnake(newSnake);}
    //////////
    public void addTurtle(String Species, String Description){
        String existingTurtle = r.getTurtles(Species, Description);

        Turtles newTurtle = new Turtles(Species, Description);
        r.addTurtle(newTurtle);}

   public List <Enviro> getEnviro(String Enviro) {
      String En = r.getEnviro(Enviro).toString();
      return r.getEnviro(En);
    }

    public void addEnviro(String species, String enviro) {
        Enviro newEnviro= new Enviro(species, enviro);
        r.addEnviro(newEnviro);
    }
}



