package org.stashbox.catalogue.generator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stashbox.catalogue.model.ItemNumber;


public class SequentialItemNumberGeneratorTestCase {
	
	@Test
	public void testGetNextNumber(){
		ItemNumberGenerator generator = new SequentialItemNumberGenerator();
		ItemNumber number1 = generator.getNextNumber();
		ItemNumber number2 = generator.getNextNumber();
		assertFalse("The number generator should give a different number each time",
				number1.equals(number2));
	}

}
