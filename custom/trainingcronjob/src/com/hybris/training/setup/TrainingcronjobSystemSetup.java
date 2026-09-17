/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.training.setup;

import static com.hybris.training.constants.TrainingcronjobConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.hybris.training.constants.TrainingcronjobConstants;
import com.hybris.training.service.TrainingcronjobService;


@SystemSetup(extension = TrainingcronjobConstants.EXTENSIONNAME)
public class TrainingcronjobSystemSetup
{
	private final TrainingcronjobService trainingcronjobService;

	public TrainingcronjobSystemSetup(final TrainingcronjobService trainingcronjobService)
	{
		this.trainingcronjobService = trainingcronjobService;
	}

	@SystemSetup(process = SystemSetup.Process.ALL, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		trainingcronjobService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return TrainingcronjobSystemSetup.class.getResourceAsStream("/trainingcronjob/sap-hybris-platform.png");
	}
}
