package no.tibber.api.model;

import java.io.Serializable;

/**
 * Tibber GraphQL API model.
 * 
 * @author Martin Kal�n
 */
public enum AppScreen implements Serializable {

    HOME,
    REPORTS,
    CONSUMPTION,
    COMPARISON,
    DISAGGREGATION,
    HOME_PROFILE,
    CUSTOMER_PROFILE,
    METER_READING,
    NOTIFICATIONS,
    INVOICES;

    private static final long serialVersionUID = 1L;

}
