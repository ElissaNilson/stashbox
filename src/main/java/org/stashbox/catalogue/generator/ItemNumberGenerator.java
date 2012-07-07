package org.stashbox.catalogue.generator;

import org.stashbox.catalogue.model.ItemNumber;

public interface ItemNumberGenerator {
	
	public ItemNumber getNextNumber();

}
