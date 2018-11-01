package no.tibber.api.model.query;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
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
public class HomeRequest extends Viewer {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    @GraphQLProperty(name = "home", arguments = {
            @GraphQLArgument(name = "id")
    })
    public Home home;

    public HomeRequest() {
        super();
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "HomeRequest [viewer=" + super.toString() + ", home=" + home + "]";
    }

}
