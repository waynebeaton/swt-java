/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.widgets;

import javafx.application.Platform;

import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Image;

/**
 * Instances of this class represent a non-selectable user interface object that
 * displays a string or image. When SEPARATOR is specified, displays a single
 * vertical or horizontal line.
 * <p>
 * Shadow styles are hints and may not be honored by the platform. To create a
 * separator label with the default shadow style for the platform, do not
 * specify a shadow style.
 * </p>
 * <dl>
 * <dt><b>Styles:</b></dt>
 * <dd>SEPARATOR, HORIZONTAL, VERTICAL</dd>
 * <dd>SHADOW_IN, SHADOW_OUT, SHADOW_NONE</dd>
 * <dd>CENTER, LEFT, RIGHT, WRAP</dd>
 * <dt><b>Events:</b></dt>
 * <dd>(none)</dd>
 * </dl>
 * <p>
 * Note: Only one of SHADOW_IN, SHADOW_OUT and SHADOW_NONE may be specified.
 * SHADOW_NONE is a HINT. Only one of HORIZONTAL and VERTICAL may be specified.
 * Only one of CENTER, LEFT and RIGHT may be specified.
 * </p>
 * <p>
 * IMPORTANT: This class is <em>not</em> intended to be subclassed.
 * </p>
 * 
 * @see <a href="http://www.eclipse.org/swt/snippets/#label">Label snippets</a>
 * @see <a href="http://www.eclipse.org/swt/examples.php">SWT Example:
 *      ControlExample</a>
 * @see <a href="http://www.eclipse.org/swt/">Sample code and further
 *      information</a>
 * @noextend This class is not intended to be subclassed by clients.
 */
public class Label extends Control {

	/**
	 * Constructs a new instance of this class given its parent and a style
	 * value describing its behavior and appearance.
	 * <p>
	 * The style value is either one of the style constants defined in class
	 * <code>SWT</code> which is applicable to instances of this class, or must
	 * be built by <em>bitwise OR</em>'ing together (that is, using the
	 * <code>int</code> "|" operator) two or more of those <code>SWT</code>
	 * style constants. The class description lists the style constants that are
	 * applicable to the class. Style bits are also inherited from superclasses.
	 * </p>
	 * 
	 * @param parent
	 *            a composite control which will be the parent of the new
	 *            instance (cannot be null)
	 * @param style
	 *            the style of control to construct
	 * 
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the parent is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the parent</li>
	 *                <li>ERROR_INVALID_SUBCLASS - if this class is not an
	 *                allowed subclass</li>
	 *                </ul>
	 * 
	 * @see SWT#SEPARATOR
	 * @see SWT#HORIZONTAL
	 * @see SWT#VERTICAL
	 * @see SWT#SHADOW_IN
	 * @see SWT#SHADOW_OUT
	 * @see SWT#SHADOW_NONE
	 * @see SWT#CENTER
	 * @see SWT#LEFT
	 * @see SWT#RIGHT
	 * @see SWT#WRAP
	 * @see Widget#checkSubclass
	 * @see Widget#getStyle
	 */
	public Label(Composite parent, int style) {
		super(parent, style);
		init();
	}

	private void init() {
		if (!Platform.isFxApplicationThread()) {
			getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					init();
				}
			});
			return;
		}
		javafx.scene.control.Label label = new javafx.scene.control.Label();

		switch (style) {
		case SWT.CENTER:
			label.setStyle("-fx-alignment: center;");
			break;
		}
		
		setNode(label);
	}
	
	private javafx.scene.control.Label getNode() {
		return (javafx.scene.control.Label)node;
	}
	
	/**
	 * Returns a value which describes the position of the text or image in the
	 * receiver. The value will be one of <code>LEFT</code>, <code>RIGHT</code>
	 * or <code>CENTER</code> unless the receiver is a <code>SEPARATOR</code>
	 * label, in which case, <code>NONE</code> is returned.
	 * 
	 * @return the alignment
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public int getAlignment() {
		// TODO
		return 0;
	}

	/**
	 * Returns the receiver's image if it has one, or null if it does not.
	 * 
	 * @return the receiver's image
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public Image getImage() {
		// TODO
		return null;
	}

	/**
	 * Returns the receiver's text, which will be an empty string if it has
	 * never been set or if the receiver is a <code>SEPARATOR</code> label.
	 * 
	 * @return the receiver's text
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public String getText() {
		// TODO
		return null;
	}

	/**
	 * Controls how text and images will be displayed in the receiver. The
	 * argument should be one of <code>LEFT</code>, <code>RIGHT</code> or
	 * <code>CENTER</code>. If the receiver is a <code>SEPARATOR</code> label,
	 * the argument is ignored and the alignment is not changed.
	 * 
	 * @param alignment
	 *            the new alignment
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public void setAlignment(int alignment) {
		// TODO
	}

	/**
	 * Sets the receiver's image to the argument, which may be null indicating
	 * that no image should be displayed.
	 * 
	 * @param image
	 *            the image to display on the receiver (may be null)
	 * 
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_INVALID_ARGUMENT - if the image has been
	 *                disposed</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public void setImage(Image image) {
		// TODO
	}

	/**
	 * Sets the receiver's text.
	 * <p>
	 * This method sets the widget label. The label may include the mnemonic
	 * character and line delimiters.
	 * </p>
	 * <p>
	 * Mnemonics are indicated by an '&amp;' that causes the next character to
	 * be the mnemonic. When the user presses a key sequence that matches the
	 * mnemonic, focus is assigned to the control that follows the label. On
	 * most platforms, the mnemonic appears underlined but may be emphasised in
	 * a platform specific manner. The mnemonic indicator character '&amp;' can
	 * be escaped by doubling it in the string, causing a single '&amp;' to be
	 * displayed.
	 * </p>
	 * 
	 * @param string
	 *            the new text
	 * 
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the text is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public void setText(String string) {
		getNode().setText(string);
	}

}
