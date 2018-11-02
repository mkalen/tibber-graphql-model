package no.tibber.api.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

public class Price implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 2L;

    public Currency currency;
    public Float total;
    public Float energy;
    public Float tax;
    public OffsetDateTime startsAt;

    public Price() {
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getEnergy() {
        return energy;
    }

    public void setEnergy(Float energy) {
        this.energy = energy;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public OffsetDateTime getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(OffsetDateTime startsAt) {
        this.startsAt = startsAt;
    }

    @Override
    public String toString() {
        return "Price [currency=" + currency + ", total=" + total + ", energy=" + energy + ", tax=" + tax
                + ", startsAt=" + startsAt + "]";
    }

}
