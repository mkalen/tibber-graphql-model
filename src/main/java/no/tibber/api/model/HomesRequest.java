package no.tibber.api.model;

import java.util.Arrays;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "viewer")
public class HomesRequest extends Viewer {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    @GraphQLProperty(name = "home")
    public Home[] homes;

    public HomesRequest() {
        super();
    }

    public Home[] getHomes() {
        return homes;
    }

    public void setHomes(Home[] homes) {
        this.homes = homes;
    }

    @Override
    public String toString() {
        return "HomesRequest [homes=" + Arrays.toString(homes) + "]";
    }

}
