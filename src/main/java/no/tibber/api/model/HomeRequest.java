package no.tibber.api.model;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "viewer")
public class HomeRequest extends Viewer {

    @GraphQLProperty(name = "home", arguments={
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
        return "ViewerByHome [viewer= " + super.toString() + ", home=" + home + "]";
    }

	

}
