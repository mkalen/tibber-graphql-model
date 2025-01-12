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
public class HomeProductionConnection implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    //public PageInfo pageInfo;
    public List<Production> nodes;
    //public List<HomeProductionEdge> edges;

    public HomeProductionConnection() {
    }

    public List<Production> getNodes() {
        return nodes;
    }

    public void setNodes(List<Production> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "HomeProductionConnection [nodes=" + nodes + "]";
    }

}
