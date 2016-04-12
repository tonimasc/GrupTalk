package edu.upc.eetac.dsa.grouptalk.entity;

/**
 * Created by toni on 7/4/16.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.util.List;

/**
 * Created by marc on 5/10/15.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Suscripcion {
    private String userid;
    private String grupoid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGrupoid() {
        return grupoid;
    }

    public void setGrupoid(String grupoid) {
        this.grupoid = grupoid;
    }
}
