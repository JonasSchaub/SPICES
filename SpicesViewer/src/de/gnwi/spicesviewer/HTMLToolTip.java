/**
 * SPICES (Simplified Particle Input ConnEction Specification) Viewer
 * Copyright (C) 2018  Achim Zielesny (achim.zielesny@googlemail.com)
 * 
 * Source code is available at <https://github.com/zielesny/SPICES>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.gnwi.spicesviewer;

/**
 * An abstract library that provides a method to create html formatted Strings 
 * for tool tips with a predefined width 
 * (see {@link de.gnwi.spicesviewer.Constants#TOOL_TIP_WIDTH}).
 * 
 * @author Jonas Schaub
 */
public abstract class HTMLToolTip {
    
    /**
     * Gives back a html formatted String for tool tips 
     * that has a width of {@link de.gnwi.spicesviewer.Constants#TOOL_TIP_WIDTH}.
     * 
     * @param aText to be formatted (may be empty but not null! 'null' texts will 
     * be turned into empty Strings)
     * @return a html document of a given width based on the parameter
     */
    public static String createTip(String aText) {
        if (aText == null)
            aText = "";
        String tmpHTMLText = "<html>" +
                                    "<p width=\"" + Constants.TOOL_TIP_WIDTH + "\">" + 
                                        aText + 
                                    "</p>" +
                            "</html>";
        return tmpHTMLText;
    }
}