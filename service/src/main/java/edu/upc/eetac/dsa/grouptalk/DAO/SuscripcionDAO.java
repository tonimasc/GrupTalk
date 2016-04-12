package edu.upc.eetac.dsa.grouptalk.DAO;

import edu.upc.eetac.dsa.grouptalk.entity.Suscripcion;

import java.sql.SQLException;

/**
 * Created by toni on 5/4/16.
 */
public interface SuscripcionDAO {
    public boolean getSuscripcionByUsuario(String userid, String grupoid) throws SQLException;
    public boolean createSuscripcion(String userid, String grupoid) throws SQLException;
    public boolean deleteSuscripcion(String userid, String grupoid) throws SQLException;
}
