package edu.upc.eetac.dsa.grouptalk.DAO;

import edu.upc.eetac.dsa.grouptalk.entity.Temas;

import java.sql.SQLException;

/**
 * Created by toni on 5/4/16.
 */
public interface TemasDAO {
    public Temas createTema(String idgrupo, String subject) throws SQLException;
    public Temas getTemaById(String idtema) throws SQLException;
    public boolean deleteTema(String idtema) throws SQLException;
}
