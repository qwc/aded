/* 
 * Project: jisoagrinet
 * File: ADEDPersistency.java
 * Date: 22.07.2012
 * 
 * Copyright (c) 2012, Marcel M. Otte
 * License: LGPL
 */
package to.mmo.aded.storage;

import java.util.Collection;

import to.mmo.adis.structure.Codeset;
import to.mmo.adis.structure.Entity;
import to.mmo.adis.structure.Item;

public interface ADEDPersistency {

	Entity getEntity(String entity);

	Item getItem(String item);

	Codeset getCodeset(String codeset);

	Collection<Item> getAllItems();

	Collection<Entity> getAllEntities();

}
