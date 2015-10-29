package edu.upc.eetac.dsa.grouptalk.entity;

/**
 * Created by toni on 28/10/15.
 */
public class Temas {
    private String idtema;
    private String idgrupo;
    private String Subject;
    private long creationTimestamp;
    private long lastModified;

    public String getIdtema() {
        return idtema;
    }

    public void setIdtema(String idtema) {
        this.idtema = idtema;
    }

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }
}
