/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.transform;


/**
 * A TransformationException is thrown when any step of a transformation went
 * wrong. The originating exception should be attached to increase traceability. 
 * 
 * @author Thomas.Eichstaedt-Engelen
 */
public class TransformationException extends Exception {
	
	/** generated serial Version UID */
	private static final long serialVersionUID = -535237375844795145L;
	
	public TransformationException(String message) {
		super(message);
	}
	
	public TransformationException(String message, Throwable cause) {
		super(message, cause);
	}

}
