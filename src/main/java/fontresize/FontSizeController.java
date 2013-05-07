/*
* Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*	 http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
package fontresize;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Main controller class the manage the font size of the
 * Eclipse workspace with a single method (crease(...)).
 * 
 * @author Maximilian Strauch (May 2013)
 */
public class FontSizeController {
	
	/**
	 * A static filed with an instance of this controller
	 */
	final public static FontSizeController controler = new FontSizeController();

	final private ScopedPreferenceStore store = new ScopedPreferenceStore(
			InstanceScope.INSTANCE, "org.eclipse.ui.workbench" );
	
	private FontSizeController() {}
	
	/**
	 * Tries to increase or decrease the general font size in
	 * the Eclipse workspace view.
	 * 
	 * @param shell SWT shell to display an error message or 
	 * <code>null</code> to print the error message to the stdout.
	 * @param step Amount of points to change the font size. To
	 * decrease the font size negative numbers are used.
	 */
	public synchronized void crease(Shell shell, int step) {
		try {

			// Get current text font settings
			String[] font = store.getString(JFaceResources.TEXT_FONT).split("\\|");
			StringBuffer buf = new StringBuffer();
			
			// Go through font settings and replace the font size
			// (a default font string looks like: '1|Monaco|9.0|0|COCOA|1|;')
			for (int i = 0; i < font.length; i++)
				if (i == 2)
					buf.append(String.valueOf(Float.parseFloat(font[i]) + step) + "|");
				else
					buf.append(font[i] + (i < font.length-1 ? "|" : ""));
			
			// Store back changed settings
			store.setValue(JFaceResources.TEXT_FONT, buf.toString());
			
		} catch (Exception e) {
			if (shell != null)
				MessageDialog.openError(shell, "Error", 
						"The font size could not be changed: " + e);
			else
				System.out.println("!ERROR (FontResize) " + e);
		}
	}
	
}
