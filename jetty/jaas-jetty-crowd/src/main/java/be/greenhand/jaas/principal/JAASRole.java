// ========================================================================
// Copyright (c) 2003-2009 Mort Bay Consulting Pty. Ltd.
// ------------------------------------------------------------------------
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// and Apache License v2.0 which accompanies this distribution.
// The Eclipse Public License is available at 
// http://www.eclipse.org/legal/epl-v10.html
// The Apache License v2.0 is available at
// http://www.opensource.org/licenses/apache2.0.php
// You may elect to redistribute this code under either of these licenses. 
// ========================================================================

package be.greenhand.jaas.principal;


public class JAASRole extends JAASPrincipal {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public JAASRole(String name) {
		super(name);
	}

	public boolean equals(Object o) {
		if (!(o instanceof JAASRole))
			return false;

		return getName().equals(((JAASRole) o).getName());
	}
}
