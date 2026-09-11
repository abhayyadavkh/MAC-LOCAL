package com.hybris.training.core.event;


import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class HybrisTubeEvent extends AbstractEvent {
    private String name;

    public HybrisTubeEvent() {
        this.name = null;
    }

    public HybrisTubeEvent(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}