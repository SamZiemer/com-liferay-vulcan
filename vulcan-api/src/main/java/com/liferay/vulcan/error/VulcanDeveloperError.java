/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.vulcan.error;

/**
 * @author Alejandro Hernández
 * @author Jorge Ferrer
 */
public class VulcanDeveloperError extends Error {

	public static class CannotCalculateURI extends VulcanDeveloperError {

		public CannotCalculateURI(Class<?> modelClass) {
			super(
				"Cannot calculate URI for model class " + modelClass.getName());
		}

	}

	public static class CannotFindMessageMapper extends VulcanDeveloperError {

		public CannotFindMessageMapper(String mediaType, Class<?> modelClass) {
			super(
				"Cannot find MessageMapper for media type " + mediaType +
					" of class " + modelClass.getName());
		}

	}

	public static class MustHaveValidGenericType extends VulcanDeveloperError {

		public MustHaveValidGenericType(Class clazz) {
			super(
				"Class " + clazz.getName() + " must have a valid generic type");
		}

	}

	private VulcanDeveloperError(String message) {
		super(message);
	}

}