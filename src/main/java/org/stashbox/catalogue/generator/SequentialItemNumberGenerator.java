package org.stashbox.catalogue.generator;

import org.stashbox.catalogue.model.ItemNumber;

public class SequentialItemNumberGenerator implements ItemNumberGenerator{
	
	private ItemNumber number = new ItemNumber(1);

	@Override
	public ItemNumber getNextNumber() {
		long longNumber = number.getLongValue();
		longNumber += 1;
		number = new ItemNumber(longNumber);
		return number;
	}

}
