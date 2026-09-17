/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.training.service;

public interface TrainingcronjobService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
