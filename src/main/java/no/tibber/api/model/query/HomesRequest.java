package no.tibber.api.model.query;

import java.util.List;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;
import no.tibber.api.model.Home;
import no.tibber.api.model.Viewer;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "viewer")
public class HomesRequest extends Viewer {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    public List<Home> homes;

    public HomesRequest() {
        super();
    }

    public List<Home> getHomes() {
        return homes;
    }

    public void setHomes(List<Home> homes) {
        this.homes = homes;
    }

    @Override
    public String toString() {
        return "HomesRequest [viewer=" + super.toString() + ", homes=" + homes + "]";
    }

}
