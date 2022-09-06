package DAO;
import Util.connUtil;
import org.example.*;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReptileRepo {
    Connection conn;
    public ReptileRepo(){ conn = connUtil.getConnection();}
    public List<Lizards> getLizards(){
        List<Lizards> allLizards = new ArrayList<>();
        try{
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * FROM Lizards");
            while (rs.next()){
                Lizards loadingLizards= new Lizards(rs.getString("Species"),rs.getString("Description"));
                allLizards.add(loadingLizards);}
            }catch (SQLException e){
                e.printStackTrace();
            }
            return allLizards;
        }
///////
public List<Enviro> getEnviro(String Enviro){
    List<Enviro> allEnviro = new ArrayList<>();
    try{
        //Statement statement =conn.createStatement();
        PreparedStatement statement = conn.prepareStatement("Select * FROM Enviro where Species = ?");

        statement.setString(1,Enviro);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            Enviro loadingEnviro= new Enviro (rs.getString("Enviroment"), rs.getString("Species"));

            allEnviro.add(loadingEnviro);}
    }catch (SQLException e){
        e.printStackTrace();
    }
    return allEnviro;
}
    /////////////
    public List<Snakes> getSnakes(){
        List<Snakes> allSnakes = new ArrayList<>();

        try{
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * FROM Snakes");
            while (rs.next()){
                Snakes loadingSnakes= new Snakes(rs.getString("Species"),rs.getString("Description"));
                allSnakes.add(loadingSnakes);
                }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return allSnakes;
    }
    //////
    public List<Turtles> getTurtles(){
        List<Turtles> allTurtles = new ArrayList<>();
        try{
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * FROM Turtles");
            while (rs.next()){
                Turtles loadingTurts= new Turtles(rs.getString("Species"),rs.getString("Description"));
                allTurtles.add(loadingTurts);}
        }catch (SQLException e){
            e.printStackTrace();
        }
        return allTurtles;
    }
    ////
    public List<Crocs> getCrocs(){
        List<Crocs> allCrocs = new ArrayList<>();
        try{
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("Select * FROM Crocs");
            while (rs.next()){
                Crocs loadingCrocs= new Crocs(rs.getString("Species"),rs.getString("Description"));
                allCrocs.add(loadingCrocs);}
        }catch (SQLException e){
            e.printStackTrace();
        }
        return allCrocs;
    }


        public void addLizard(Lizards r){
            try{
                PreparedStatement statement = conn.prepareStatement("insert into Lizards( Species, Description ) " +
                        "values (?,?)");
                statement.setString(1, r.getLizardS());
                statement.setString(2, r.getLizardD());
                statement.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    public String getLizard(String Species, String Description ) {
        return Species + Description;
    }
   //////////////////////

    public void addCrocs(Crocs r){
        try{
            PreparedStatement statement = conn.prepareStatement("insert into Crocs( Species, Description) " +
                    "values (?,?)");
            statement.setString(1, r.getCrocsS());
            statement.setString(2, r.getCrocsD());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public String getCrocs(String Species, String Description ) {
        return Species + Description;
    }
////////////
public void addSnake(Snakes r){
    try{
        PreparedStatement statement = conn.prepareStatement("insert into Snakes( Species, Description)  " +
                "values (?,?)");
        statement.setString(1, r.getSnakesS());
        statement.setString(2, r.getSnakesD());

        statement.executeUpdate();
    }catch(SQLException e){
        e.printStackTrace();
    }
}
    public String getSnakes(String Species, String Description ) {
        return Species + Description;
    }
/////////////
public void addTurtle(Turtles r){
    try{
        PreparedStatement statement = conn.prepareStatement("insert into Turtles( Species, Description) " +
                "values (?,?)");
        statement.setString(1, r.getTurtlesS());
        statement.setString(2, r.getTurtlesD());
        statement.executeUpdate();
    }catch(SQLException e){
        e.printStackTrace();
    }
}
    public String getTurtles(String Species, String Description ) {
        return Species + Description;
    }
//////////////////////////////////////Write Enviro
public void addEnviro(Enviro k){
    try{
        PreparedStatement statement = conn.prepareStatement("insert into Enviro( Species, Enviroment) " +
                "values (?,?)");
        statement.setString(1, k.getEnviroS());
        statement.setString(2, k.getEnviroE());
        statement.executeUpdate();
    }catch(SQLException e){
        e.printStackTrace();
    }
}
/////////////////////////ALL
public List<All> getAll(){
    List<All> allAll = new ArrayList<>();
    try{
        PreparedStatement statement = conn.prepareStatement("SELECT Reptile.Description, Enviro.Species,Enviroment\n" +
                "FROM Reptile\n" +
                "Join Enviro\n" +
                "ON Reptile.Species =Enviro.Species");
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            All loadingAll= new All (rs.getString("Species"), rs.getString("Description"), rs.getString("Enviroment"));
            allAll.add(loadingAll);}
    }catch (SQLException e){
        e.printStackTrace();
    }
    return allAll;
}


}


