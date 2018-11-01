package no.tibber.api.model;

import java.io.Serializable;
import java.util.List;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "home")
public class HomeConsumptionConnection implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    //public HomeConsumptionPageInfo pageInfo;
    public List<Consumption> nodes;
    public List<HomeConsumptionEdge> edges;

    public HomeConsumptionConnection() {
    }

    public List<Consumption> getNodes() {
        return nodes;
    }

    public void setNodes(List<Consumption> nodes) {
        this.nodes = nodes;
    }

    public List<HomeConsumptionEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<HomeConsumptionEdge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "HomeConsumptionConnection [nodes=" + nodes + ", edges=" + edges + "]";
    }

}
