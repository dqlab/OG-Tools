/*
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */

package com.opengamma.tools.gradle.release

import org.gradle.api.Project

trait ReleaseExtensionCreator
{
	private Project target

	/**
	 * Add the {@link ReleaseExtension} extension to the this Project iif it has not already been added.
	 */
	void createReleaseExtension()
	{
		target = (Project) this.project

		if( ! target.extensions.findByType(ReleaseExtension))
			doCreateReleaseExtension()
	}

	private void doCreateReleaseExtension()
	{
		target.extensions.create(ReleasePlugin.RELEASE_EXTENSION_NAME, ReleaseExtension)
	}
}
