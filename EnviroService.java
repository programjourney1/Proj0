package Service;
import DAO.ReptileRepo;
import org.example.Enviro;

import java.sql.SQLException;
import java.util.List;

public class EnviroService {
    ReptileRepo rr;


    public EnviroService() throws SQLException{
        rr=new ReptileRepo();
    }
    public EnviroService(ReptileRepo rr){
        this.rr=rr;
    }
   public List<Enviro> getEnviro(String E){
       return rr.getEnviro(E);

    }
    public void addEnviro(String Species, String Enviro){


        Enviro newEnviro = new Enviro(Species, Enviro);
        rr.addEnviro(newEnviro);}


    public String getAll() {
        return String.valueOf(rr.getAll());
    }
}


