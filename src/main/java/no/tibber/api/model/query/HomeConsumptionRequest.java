package no.tibber.api.model.query;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;
import no.tibber.api.model.HomeWithConsumption;
import no.tibber.api.model.Viewer;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "viewer")
public class HomeConsumptionRequest extends Viewer {

    @GraphQLIgnore
    private static final long serialVersionUID = 2L;

    @GraphQLProperty(name = "home", arguments = {
            @GraphQLArgument(name = "id")
    })
    public HomeWithConsumption home;

    public HomeConsumptionRequest() {
        super();
    }

    public HomeWithConsumption getHome() {
        return home;
    }

    public void setHome(HomeWithConsumption home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "HomeRequest [viewer=" + super.toString() + ", home=" + home + "]";
    }

}
