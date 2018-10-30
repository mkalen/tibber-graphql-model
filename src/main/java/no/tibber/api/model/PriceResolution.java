package no.tibber.api.model;

import java.io.Serializable;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
public enum PriceResolution implements Serializable {

    HOURLY,
    DAILY;

    private static final long serialVersionUID = 1L;

}
