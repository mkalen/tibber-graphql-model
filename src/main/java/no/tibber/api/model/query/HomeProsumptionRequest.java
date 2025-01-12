package no.tibber.api.model.query;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;
import no.tibber.api.model.HomeWithProsumption;
import no.tibber.api.model.Viewer;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "viewer")
public class HomeProsumptionRequest extends Viewer {

    @GraphQLIgnore
    private static final long serialVersionUID = 3L;

    @GraphQLProperty(name = "home", arguments = {
            @GraphQLArgument(name = "id")
    })
    public HomeWithProsumption home;

    public HomeProsumptionRequest() {
        super();
    }

    public HomeWithProsumption getHome() {
        return home;
    }

    public void setHome(HomeWithProsumption home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "HomeProsumptionRequest [viewer=" + super.toString() + ", home=" + home + "]";
    }

}
