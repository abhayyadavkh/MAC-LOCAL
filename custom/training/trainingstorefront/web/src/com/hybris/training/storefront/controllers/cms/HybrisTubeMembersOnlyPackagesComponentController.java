package com.hybris.training.storefront.controllers.cms;


import com.hybris.training.core.model.HybrisTubeMembersOnlyPackagesComponentModel;
import com.hybris.training.storefront.controllers.ControllerConstants;
import de.hybris.platform.addonsupport.controllers.cms.AbstractCMSAddOnComponentController;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller("HybrisTubeMembersOnlyPackagesComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.HybrisTubeMembersOnlyPackagesComponent)
public class HybrisTubeMembersOnlyPackagesComponentController extends AbstractCMSAddOnComponentController<HybrisTubeMembersOnlyPackagesComponentModel>
{

    private static final Logger LOGGER = Logger.getLogger(HybrisTubeMembersOnlyPackagesComponentController.class);
    @Override
    protected void fillModel(final HttpServletRequest request, final Model model, final HybrisTubeMembersOnlyPackagesComponentModel component)
    {
        LOGGER.debug("Filling model for HybrisTubeMembersOnlyPackagesComponent: " + component.getUid()+" With Title as: "+component.getHybrisTubeTitle()+" and Hybris Tube Summary as: "+component.getHybrisTubeInfoSummary());
        model.addAttribute("hybrisTubeAvailablePackagesLinks", component.getHybrisTubeAvailablePackagesLinks());

        model.addAttribute("hybrisTubeBannerImage", component.getHybrisTubeBannerImage());

        model.addAttribute("hybrisTubeTitle", component.getHybrisTubeTitle());

        model.addAttribute("hybrisTubeInfoSummary", component.getHybrisTubeInfoSummary());
    }

    @Override
    protected String getView(HybrisTubeMembersOnlyPackagesComponentModel component) {

        return ControllerConstants.Views.Cms.ComponentPrefix + StringUtils.lowerCase(getTypeCode(component));
    }

}
