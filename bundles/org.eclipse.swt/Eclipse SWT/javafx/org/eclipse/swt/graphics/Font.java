/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.graphics;

import org.eclipse.swt.SWTError;
import org.eclipse.swt.SWTException;

/**
 * Instances of this class manage operating system resources that define how
 * text looks when it is displayed. Fonts may be constructed by providing a
 * device and either name, size and style information or a <code>FontData</code>
 * object which encapsulates this data.
 * <p>
 * Application code must explicitly invoke the <code>Font.dispose()</code>
 * method to release the operating system resources managed by each instance
 * when those instances are no longer required.
 * </p>
 * 
 * @see FontData
 * @see <a href="http://www.eclipse.org/swt/snippets/#font">Font snippets</a>
 * @see <a href="http://www.eclipse.org/swt/examples.php">SWT Examples:
 *      GraphicsExample, PaintExample</a>
 * @see <a href="http://www.eclipse.org/swt/">Sample code and further
 *      information</a>
 */
public final class Font extends Resource {
	
	private FontData[] fontData;

	/**
	 * Constructs a new font given a device and font data which describes the
	 * desired font's appearance.
	 * <p>
	 * You must dispose the font when it is no longer required.
	 * </p>
	 * 
	 * @param device
	 *            the device to create the font on
	 * @param fd
	 *            the FontData that describes the desired font (must not be
	 *            null)
	 * 
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if device is null and there is
	 *                no current device</li>
	 *                <li>ERROR_NULL_ARGUMENT - if the fd argument is null</li>
	 *                </ul>
	 * @exception SWTError
	 *                <ul>
	 *                <li>ERROR_NO_HANDLES - if a font could not be created from
	 *                the given font data</li>
	 *                </ul>
	 */
	public Font(Device device, FontData fd) {
		super(device);
		fontData = new FontData[] { fd };
		// TODO
	}

	/**
	 * Constructs a new font given a device and an array of font data which
	 * describes the desired font's appearance.
	 * <p>
	 * You must dispose the font when it is no longer required.
	 * </p>
	 * 
	 * @param device
	 *            the device to create the font on
	 * @param fds
	 *            the array of FontData that describes the desired font (must
	 *            not be null)
	 * 
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if device is null and there is
	 *                no current device</li>
	 *                <li>ERROR_NULL_ARGUMENT - if the fds argument is null</li>
	 *                <li>ERROR_INVALID_ARGUMENT - if the length of fds is zero</li>
	 *                <li>ERROR_NULL_ARGUMENT - if any fd in the array is null</li>
	 *                </ul>
	 * @exception SWTError
	 *                <ul>
	 *                <li>ERROR_NO_HANDLES - if a font could not be created from
	 *                the given font data</li>
	 *                </ul>
	 * 
	 * @since 2.1
	 */
	public Font(Device device, FontData[] fds) {
		super(device);
		fontData = fds;
		// TODO
	}

	/**
	 * Constructs a new font given a device, a font name, the height of the
	 * desired font in points, and a font style.
	 * <p>
	 * You must dispose the font when it is no longer required.
	 * </p>
	 * 
	 * @param device
	 *            the device to create the font on
	 * @param name
	 *            the name of the font (must not be null)
	 * @param height
	 *            the font height in points
	 * @param style
	 *            a bit or combination of NORMAL, BOLD, ITALIC
	 * 
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if device is null and there is
	 *                no current device</li>
	 *                <li>ERROR_NULL_ARGUMENT - if the name argument is null</li>
	 *                <li>ERROR_INVALID_ARGUMENT - if the height is negative</li>
	 *                </ul>
	 * @exception SWTError
	 *                <ul>
	 *                <li>ERROR_NO_HANDLES - if a font could not be created from
	 *                the given arguments</li>
	 *                </ul>
	 */
	public Font(Device device, String name, int height, int style) {
		super(device);
		FontData fd = new FontData(name, height, style);
		fontData = new FontData[] { fd };
		// TODO
	}

	@Override
	void destroy() {
		// TODO
	}

	/**
	 * Returns an array of <code>FontData</code>s representing the receiver. On
	 * Windows, only one FontData will be returned per font. On X however, a
	 * <code>Font</code> object <em>may</em> be composed of multiple X fonts. To
	 * support this case, we return an array of font data objects.
	 * 
	 * @return an array of font data objects describing the receiver
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_GRAPHIC_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                </ul>
	 */
	public FontData[] getFontData() {
		return fontData;
	}

	/**
	 * Returns <code>true</code> if the font has been disposed, and
	 * <code>false</code> otherwise.
	 * <p>
	 * This method gets the dispose state for the font. When a font has been
	 * disposed, it is an error to invoke any other method (except
	 * {@link #dispose()}) using the font.
	 * 
	 * @return <code>true</code> when the font is disposed and
	 *         <code>false</code> otherwise
	 */
	@Override
	public boolean isDisposed() {
		// TODO
		return false;
	}

}
