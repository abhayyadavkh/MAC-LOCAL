package com.hybris.training.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import org.apache.log4j.Logger;

public class HybrisTubeEventListener extends AbstractEventListener<HybrisTubeEvent> {

    private static final Logger LOG = Logger.getLogger(HybrisTubeEventListener.class);

    @Override
    protected void onEvent(HybrisTubeEvent event) {
        LOG.info("HybrisTubeEventListener onEvent");

    }


}
