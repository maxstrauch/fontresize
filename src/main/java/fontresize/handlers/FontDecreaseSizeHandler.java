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
package fontresize.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import fontresize.FontSizeController;

/**
 * Action handler for the mnemonic to decrease the font size.
 * 
 * Source adapted from <code>http://code.google.com/p/eclipse-fonts/</code>,
 * written by <code>Guy Korland</code>.
 * 
 * @author Maximilian Strauch (May 2013)
 */
public class FontDecreaseSizeHandler extends AbstractHandler  {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		FontSizeController.controler.crease(null, -1);
		return null;
	}
	
}