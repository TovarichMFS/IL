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

/**
 * @author tovarich
 * 
 */
public class Hello { 
	/**
	 * Chaine de base
	 */
	private String chaineinit;

	/**
	 * @param chaineinit
	 */
	public Hello(String chaineinit) {
		this.setChaineinit(chaineinit);
	}

	/**
	 * @return chaineinit
	 */
	public String getChaineinit() {
		return chaineinit;
	}

	/**
	 * Modifie la chaineinit
	 * @param chaineinit
	 */
	public void setChaineinit(String chaineinit) {
		this.chaineinit = chaineinit;
	}
	
	/**
	 * Affiche chaineinit + chaine
	 * @param chaine
	 */
	public void afficher(String chaine) {
		System.out.println(this.getChaineinit() + " " + chaine);
	}

}
