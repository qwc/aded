/* 
 * Project: jisoagrinet
 * File: ADEDStorage.java
 * Date: 22.07.2012
 * 
 * Copyright (c) 2012, Marcel M. Otte
 * License: LGPL
 */
package to.mmo.aded.storage;

import to.mmo.adis.structure.Codeset;
import to.mmo.adis.structure.Entity;
import to.mmo.adis.structure.Item;

public interface ADEDStorage {

	void putADEDVersion(String version);

	void putEntity(Entity entity);

	void putItem(Item item);

	void putCodeset(Codeset codeset);

}
