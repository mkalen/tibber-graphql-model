package no.tibber.api.model;

import java.io.Serializable;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
public enum ConsumptionResolution implements Serializable {

    HOURLY,
    DAILY,
    WEEKLY,
    MONTHLY,
    ANNUAL;

    private static final long serialVersionUID = 1L;

}
