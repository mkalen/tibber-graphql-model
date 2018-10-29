package no.tibber.api.model;

import java.util.Arrays;

import io.aexp.nodes.graphql.annotations.GraphQLProperty;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@GraphQLProperty(name = "viewer")
public class Viewer {

    public String login;
    public String name;
    public AccountType[] accountType;

    public Viewer() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountType[] getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType[] accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Viewer [login=" + login + ", name=" + name + ", accountType=" + Arrays.toString(accountType) + "]";
    }

}
