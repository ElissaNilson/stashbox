package org.stashbox.catalogue.service;

import java.util.HashMap;
import java.util.Map;

import org.stashbox.catalogue.generator.ItemNumberGenerator;
import org.stashbox.catalogue.generator.SequentialItemNumberGenerator;
import org.stashbox.catalogue.model.ItemNumber;
import org.stashbox.catalogue.model.StitchThread;

public class HashMapCatalogueService implements CatalogueService{
	private Map<ItemNumber, StitchThread> threadMap = new HashMap<>();
	private ItemNumberGenerator generator = new SequentialItemNumberGenerator();

	@Override
	public ItemNumber add(StitchThread thread) {
		ItemNumber itemNumber = generator.getNextNumber();
		threadMap.put(itemNumber, thread);
		return itemNumber;
	}

	@Override
	public StitchThread get(ItemNumber number) {
		return threadMap.get(number);
	}

}
