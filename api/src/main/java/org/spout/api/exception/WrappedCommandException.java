/*
 * This file is part of Spout.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Spout is licensed under the Spout License Version 1.
 *
 * Spout is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Spout is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.api.exception;

/**
 * Thrown to wrap any exceptions caught during execution of a command
 */
public class WrappedCommandException extends CommandException {
	private static final long serialVersionUID = 9124773905653368232L;

	public WrappedCommandException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		StringBuilder b = new StringBuilder(super.getMessage() + "\n");
		for (StackTraceElement s : getStackTrace()) {
			b.append(s.toString()).append("\n");
		}
		return b.toString();
	}
}