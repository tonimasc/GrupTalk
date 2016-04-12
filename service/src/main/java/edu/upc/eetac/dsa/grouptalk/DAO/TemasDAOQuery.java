package edu.upc.eetac.dsa.grouptalk.DAO;

/**
 * Created by toni on 5/4/16.
 */
public interface TemasDAOQuery {
    public final static String UUID = "select REPLACE(UUID(),'-','')";
    public final static String CREATE_TEMA = "insert into temas (idtema, idgrupo, subject) values (UNHEX(?), unhex(?), ?)";
    public final static String GET_TEMA_BY_ID = "select hex(idtema) as idtema, hex(idgrupo) as idgrupo, subject, last_modified, creation_timestamp from temas where idtema=unhex(?)";
    public final static String DELETE_TEMA = "delete from temas where idtema=unhex(?)";
}
