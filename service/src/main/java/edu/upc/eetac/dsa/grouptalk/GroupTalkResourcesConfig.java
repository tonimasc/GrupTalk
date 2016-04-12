package edu.upc.eetac.dsa.grouptalk;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by toni on 7/4/16.
 */
public class GroupTalkResourcesConfig extends ResourceConfig {
    public GroupTalkResourcesConfig() {
        packages("edu.upc.eetac.dsa.grouptalk");
    }
}
