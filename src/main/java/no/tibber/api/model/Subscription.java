package no.tibber.api.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import io.aexp.nodes.graphql.annotations.GraphQLIgnore;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kalén
 */
public class Subscription implements Serializable {

    @GraphQLIgnore
    private static final long serialVersionUID = 2L;

    public String id;
    public LegalEntity subscriber;
    public OffsetDateTime validFrom;
    public OffsetDateTime validTo;
    public Status status;
    public PriceInfo priceInfo;

    public Subscription() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LegalEntity getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(LegalEntity subscriber) {
        this.subscriber = subscriber;
    }

    public OffsetDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public OffsetDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(OffsetDateTime validTo) {
        this.validTo = validTo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    @Override
    public String toString() {
        return "Subscription [id=" + id + ", subscriber=" + subscriber + ", validFrom=" + validFrom + ", validTo="
                + validTo + ", status=" + status + ", priceInfo=" + priceInfo + "]";
    }

}
