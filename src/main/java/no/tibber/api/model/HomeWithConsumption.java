package no.tibber.api.model;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;
import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "home")
public class HomeWithConsumption extends Home {

    @GraphQLIgnore
    private static final long serialVersionUID = 3L;

    @GraphQLArguments({
        @GraphQLArgument(name = "resolution", type = "EnergyResolution"),
        @GraphQLArgument(name = "first", type = "Integer", optional = true),
        @GraphQLArgument(name = "last", type = "Integer", optional = true),
        @GraphQLArgument(name = "before", optional = true),
        @GraphQLArgument(name = "after", optional = true),
        @GraphQLArgument(name = "filterEmptyNodes", type = "Boolean", value = "false")
    })
    public HomeConsumptionConnection consumption;

    public HomeWithConsumption() {
    }

    public HomeConsumptionConnection getConsumption() {
        return consumption;
    }

    public void setConsumption(HomeConsumptionConnection consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "HomeWithConsumption [consumption=" + consumption + "]";
    }

}
