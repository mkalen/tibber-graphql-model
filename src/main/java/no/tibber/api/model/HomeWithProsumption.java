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
public class HomeWithProsumption extends Home {

    @GraphQLIgnore
    private static final long serialVersionUID = 4L;

    @GraphQLArguments({
        @GraphQLArgument(name = "resolution", type = "EnergyResolution"),
        @GraphQLArgument(name = "first", type = "Integer", optional = true),
        @GraphQLArgument(name = "last", type = "Integer", optional = true),
        @GraphQLArgument(name = "before", optional = true),
        @GraphQLArgument(name = "after", optional = true),
        @GraphQLArgument(name = "filterEmptyNodes", type = "Boolean", value = "false")
    })
    public HomeConsumptionConnection consumption;
    @GraphQLArguments({
        @GraphQLArgument(name = "resolution", type = "EnergyResolution"),
        @GraphQLArgument(name = "first", type = "Integer", optional = true),
        @GraphQLArgument(name = "last", type = "Integer", optional = true),
        @GraphQLArgument(name = "before", optional = true),
        @GraphQLArgument(name = "after", optional = true),
        @GraphQLArgument(name = "filterEmptyNodes", type = "Boolean", value = "false")
    })
    public HomeProductionConnection production;

    public HomeWithProsumption() {
    }

    public HomeConsumptionConnection getConsumption() {
        return consumption;
    }

    public void setConsumption(HomeConsumptionConnection consumption) {
        this.consumption = consumption;
    }

    public HomeProductionConnection getProduction() {
        return production;
    }

    public void setProduction(HomeProductionConnection production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "HomeWithProsumption [consumption=" + consumption + ", production=" + production + "]";
    }

}
