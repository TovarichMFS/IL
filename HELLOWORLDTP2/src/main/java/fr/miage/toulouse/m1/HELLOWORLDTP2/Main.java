/**
 * Copyright © ${project.inceptionYear} Dimitri (${email})
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.miage.toulouse.m1.HELLOWORLDTP2;

import org.apache.log4j.Logger;
import fr.miage.toulouse.m1.HELLOWORLDTP2.Hello;

public class Main {
    /**
     * Logger
     */
    private static final Logger LOGGER = Logger.getLogger(Main.class);

	/**
	 * Méthode MAIN
	 * @param args
	 */
	public static void main(String[] args) {
		Hello hello = new Hello("LOL");
		LOGGER.info("ceci est un message de niveau info");
		hello.afficher("LUL");

	}

}
