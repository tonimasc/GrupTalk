package edu.upc.eetac.dsa.grouptalk.entity;

/**
 * Created by toni on 28/10/15.
 */
public class Grupos {
    private String idgrupo;
    private String fullname;
    private long creationTimestamp;

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }
}

