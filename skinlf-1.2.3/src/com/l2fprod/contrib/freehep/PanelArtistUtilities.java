/* ====================================================================
 *
 * Skin Look And Feel 1.2.3 License.
 *
 * Copyright (c) 2000-2002 L2FProd.com.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by L2FProd.com
 *        (http://www.L2FProd.com/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "Skin Look And Feel", "SkinLF" and "L2FProd.com" must not
 *    be used to endorse or promote products derived from this software
 *    without prior written permission. For written permission, please
 *    contact info@L2FProd.com.
 *
 * 5. Products derived from this software may not be called "SkinLF"
 *    nor may "SkinLF" appear in their names without prior written
 *    permission of L2FProd.com.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL L2FPROD.COM OR ITS CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * ====================================================================
 */
package com.l2fprod.contrib.freehep;
// was originally org.freehep.swing.graphics;

import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.RectangularShape;

/**
 * This class is a collection of static methods which are useful for
 * implementations of the PanelArtist interface. Most methods return an
 * AffineTransform which will perform some common operation on a window.
 *
 * @author    Charles Loomis
 * @created   27 avril 2002
 * @version   $Id: PanelArtistUtilities.java,v 1.1 2001/11/04 11:10:27 l2fprod
 *      Exp $
 */
public class PanelArtistUtilities {

  /**
   * This returns an affine transform which is appropriate for modifying an
   * existing one for a change in the window size. (NOTE: that this transform
   * should be pre-concatenated with the existing one!) The returned transform
   * will satisfy the following constraints: the centerpoint of the old window
   * will map to the center point of the new window, a uniform scaling will be
   * used in both the x and y-directions, the entire visible region of in the
   * old window will be visible in the new window.
   *
   * @param oldWidth   Description of Parameter
   * @param oldHeight  Description of Parameter
   * @param newWidth   Description of Parameter
   * @param newHeight  Description of Parameter
   * @return           The ResizeTransform value
   */
  public static AffineTransform
      getResizeTransform(int oldWidth, int oldHeight,
      int newWidth, int newHeight) {

    // First calculate the scaling which is necessary.
    double scale =
        Math.min((double) newWidth / (double) oldWidth,
        (double) newHeight / (double) oldHeight);

    // Now calculate the translation which is necessary.
    double tx = 0.5 * (newWidth - scale * oldWidth);
    double ty = 0.5 * (newHeight - scale * oldHeight);

    // Now create the transform and return it.
    return new AffineTransform(scale, 0., 0., scale, tx, ty);
  }

  /**
   * This returns an affine transform which is appropriate for modifying an
   * existing one for a change in the window size. (NOTE: that this transform
   * should be pre-concatenated with the existing one!) The final transform will
   * map the four corners of the old window to the four corners of the new
   * window. In general, the scaling in the x and y direction will be different.
   *
   * @param oldWidth   Description of Parameter
   * @param oldHeight  Description of Parameter
   * @param newWidth   Description of Parameter
   * @param newHeight  Description of Parameter
   * @return           The StretchTransform value
   */
  public static AffineTransform
      getStretchTransform(int oldWidth, int oldHeight,
      int newWidth, int newHeight) {

    // First calculate the scaling which is necessary.
    double scaleX = (double) newWidth / (double) oldWidth;
    double scaleY = (double) newHeight / (double) oldHeight;

    // Now create the transform and return it.
    return new AffineTransform(scaleX, 0., 0., scaleY, 0., 0.);
  }

  /**
   * This returns an affine transform which will keep the center point in the
   * center and scale the x- and y-directions uniformly by the factor given.
   * Note that a value of 1 corresponds to the identify transform, values less
   * than 1 will "zoom out," and values greater than 1 will "zoom in." (NOTE:
   * that this transform should be pre-concatenated with the existing one!)
   *
   * @param zoomFactor  Description of Parameter
   * @param width       Description of Parameter
   * @param height      Description of Parameter
   * @return            The ZoomTransform value
   */
  public static AffineTransform getZoomTransform(double zoomFactor,
      int width,
      int height) {
    double tx = width / 2. * (1. - zoomFactor);
    double ty = height / 2. * (1 - zoomFactor);
    return new AffineTransform(zoomFactor, 0., 0., zoomFactor, tx, ty);
  }


  /**
   * This returns an affine transform which will flip the horizontal axis
   * around. (NOTE: that this transform should be pre-concatenated with the
   * existing one!) The returned transform will maintain the centerpoint of the
   * window and flip the direction of the x-axis.
   *
   * @param width  Description of Parameter
   * @return       The XFlipTransform value
   */
  public static AffineTransform getXFlipTransform(int width) {
    return new AffineTransform(-1., 0., 0., 1., (double) width, 0.);
  }


  /**
   * This returns an affine transform which will flip the vertical axis around.
   * (NOTE: that this transform should be pre-concatenated with the existing
   * one!) The returned transform will maintain the centerpoint of the window
   * and flip the direction of the y-axis.
   *
   * @param height  Description of Parameter
   * @return        The YFlipTransform value
   */
  public static AffineTransform getYFlipTransform(int height) {
    return new AffineTransform(1., 0., 0., -1., 0., (double) height);
  }

  /**
   * This returns an affine transform which will center the given point in the
   * window. (NOTE: that this transform should be pre-concatenated with the
   * existing one!) The returned transform will move the given point to the
   * center and maintain the x and y scales.
   *
   * @param newX    Description of Parameter
   * @param newY    Description of Parameter
   * @param width   Description of Parameter
   * @param height  Description of Parameter
   * @return        The CenteringTransform value
   */
  public static AffineTransform
      getCenteringTransform(int newX, int newY,
      int width, int height) {
    return new AffineTransform(1., 0., 0., 1.,
        width / 2. - newX,
        height / 2. - newY);
  }

  /**
   * This returns an affine transform which will rotate the contents of the
   * window by 90 degrees. (NOTE: that this transform should be pre-concatenated
   * with the existing one!) The returned transform will rotate the contents of
   * the window by 90 degrees while keeping the centerpoint the same. The x and
   * y-scaling will be adjusted to keep the same area visible.
   *
   * @param width   Description of Parameter
   * @param height  Description of Parameter
   * @return        The CCWRotateTransform value
   */
  public static AffineTransform
      getCCWRotateTransform(int width, int height) {

    return new AffineTransform(0.,
        -((double) height) / width,
        ((double) width) / height,
        0.,
        0.,
        (double) height);
  }

  /**
   * This returns an affine transform which will rotate the contents of the
   * window by -90 degrees. (NOTE: that this transform should be
   * pre-concatenated with the existing one!) The returned transform will rotate
   * the contents of the window by -90 degrees while keeping the centerpoint the
   * same. The x and y-scaling will be adjusted to keep the same area visible.
   *
   * @param width   Description of Parameter
   * @param height  Description of Parameter
   * @return        The CWRotateTransform value
   */
  public static AffineTransform
      getCWRotateTransform(int width, int height) {

    return new AffineTransform(0.,
        ((double) height) / width,
        -((double) width) / height,
        0.,
        (double) width,
        0.);
  }

  /**
   * This modifies the supplied affine transform so that the rectangle given by
   * realBounds will fit inside of the rectangle given by windowBounds. The
   * center of the realBounds rectangle will coincide with that of the
   * windowBounds rectangle. NOTE: THIS ONLY CORRECTLY HANDLES THE CASE WHEN THE
   * USER SPACE RECTANGLE IS CENTERED ON THE ORIGIN.
   *
   * @param transform     the transform which will be modified
   * @param realBounds    the user space rectangle
   * @param windowBounds  the window to map the user rectangle to
   */
  public static void getFittingTransform(AffineTransform transform,
      RectangularShape realBounds,
      RectangularShape
      windowBounds) {

    if (realBounds == null || windowBounds == null) {
      transform.setToIdentity();
    }
    else {

      // Get the dimensions of the windows.
      double realWidth = realBounds.getWidth();
      double realHeight = realBounds.getHeight();
      double windowWidth = windowBounds.getWidth();
      double windowHeight = windowBounds.getHeight();

      if (realWidth > 0 && realHeight > 0) {

        // Get the necessary scaling factor.
        double scaleWidth = windowWidth / realWidth;
        double scaleHeight = windowHeight / realHeight;
        double scale = Math.min(scaleWidth, scaleHeight);

        transform.setTransform(scale, 0., 0., -scale,
            windowWidth / 2., windowHeight / 2.);
      }
      else {
        transform.setToIdentity();
      }
    }
  }

  /**
   * This modifies the supplied affine transform so that the rectangle given by
   * realBounds will fit exactly inside the rectangle given by windowBounds. The
   * origins of the realBounds and the windowBounds coincide; the opposite
   * corner corresponds to (x0+dx,y0-dy) for the real coordinates.
   *
   * @param transform     the transform which will be modified
   * @param realBounds    the user space rectangle
   * @param windowBounds  the window to map the user rectangle to
   */
  public static void getFillingTransform(AffineTransform transform,
      RectangularShape realBounds,
      RectangularShape
      windowBounds) {

    if (realBounds == null || windowBounds == null) {
      transform.setToIdentity();
    }
    else {

      // Get the dimensions of the windows.
      double realWidth = realBounds.getWidth();
      double realHeight = realBounds.getHeight();
      double windowWidth = windowBounds.getWidth();
      double windowHeight = windowBounds.getHeight();

      if (realWidth > 0 && realHeight > 0) {

        // Get the necessary scaling factor.
        double scaleWidth = windowWidth / realWidth;
        double scaleHeight = windowHeight / realHeight;

        transform.setTransform(scaleWidth, 0., 0., -scaleHeight,
            -scaleWidth * realBounds.getX(),
            scaleHeight * realBounds.getY());
      }
      else {
        transform.setToIdentity();
      }
    }
  }

  /**
   * This returns the "local" bounds of a component. This does the same
   * calculation as the method of the same name in SwingUtilities, but this
   * doesn't create a new Rectangle, but instead overwrites the one passed in.
   *
   * @param bounds  rectangle to modify with the given component's bounds (will
   *      create new Rectangle if this is null)
   * @param c       component to get the bounds from
   * @return        convenience reference to the rectangle passed in (or the
   *      created rectangle)
   */
  public static Rectangle getLocalBounds(Rectangle bounds, Container c) {

    // Create a new Rectangle only if necessary.
    if (bounds == null) {
      bounds = new Rectangle();
    }

    // Get the insets of the components.
    Insets insets = c.getInsets();

    // Set the origin to (0,0) and the width and height to those
    // of the given component.
    bounds.setBounds(0, 0,
        c.getWidth() - (insets.left + insets.right),
        c.getHeight() - (insets.top + insets.bottom));

    // Return the given rectangle (or the created one if this was
    // necessary).
    return bounds;
  }

}
