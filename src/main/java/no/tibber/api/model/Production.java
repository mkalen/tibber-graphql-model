package no.tibber.api.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
@Entity
@Table(name="production")
public class Production implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name ="\"from\"")
    public OffsetDateTime from;

    @Id
    @Column(name ="\"to\"")
    public OffsetDateTime to;

    @Column(name = "unit_price")
    public Float unitPrice;

    @Column(name = "unit_price_vat")
    public Float unitPriceVAT;

    public Float production;

    @Enumerated(EnumType.ORDINAL)
    @Column(name ="production_unit_id", columnDefinition = "INT2")
    public Unit productionUnit;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "currency_id", columnDefinition = "INT2")
    public Currency currency;

    @Column(name = "profit")
    public Float profit;

    public Production() {
    }

    public OffsetDateTime getFrom() {
        return from;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public OffsetDateTime getTo() {
        return to;
    }

    public void setTo(OffsetDateTime to) {
        this.to = to;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getUnitPriceVAT() {
        return unitPriceVAT;
    }

    public void setUnitPriceVAT(Float unitPriceVAT) {
        this.unitPriceVAT = unitPriceVAT;
    }

    public Float getProduction() {
        return production;
    }

    public void setProduction(Float production) {
        this.production = production;
    }

    public Unit getProductionUnit() {
        return productionUnit;
    }

    public void setProductionUnit(Unit productionUnit) {
        this.productionUnit = productionUnit;
    }

    public Float getProfit() {
        return profit;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Production other = (Production) obj;
        if (from == null) {
            if (other.from != null)
                return false;
        } else if (!from.equals(other.from))
            return false;
        if (to == null) {
            if (other.to != null)
                return false;
        } else if (!to.equals(other.to))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Consumption [from=" + from + ", to=" + to + ", unitPrice=" + unitPrice + ", unitPriceVAT="
                + unitPriceVAT + ", production=" + production + ", productionUnit=" + productionUnit
                + ", profit=" + profit + ", currency=" + currency + "]";
    }

}
