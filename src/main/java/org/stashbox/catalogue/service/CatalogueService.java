package org.stashbox.catalogue.service;

import org.stashbox.catalogue.model.ItemNumber;
import org.stashbox.catalogue.model.StitchThread;

public interface CatalogueService {
	
	public ItemNumber add(StitchThread thread);
		
	public StitchThread get(ItemNumber number);
	
}
