package org.stashbox.catalogue.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stashbox.catalogue.model.ItemNumber;
import org.stashbox.catalogue.model.StitchThread;

public class HashMapCatalogueServiceTestCase {

	@Test
	public void testAdd() {
		CatalogueService service = new HashMapCatalogueService();
		StitchThread thread = new StitchThread();
		ItemNumber number = service.add(thread);
		assertNotNull("adding a thread should return an item number", number);
		
	}
	
	@Test
	public void testGet() {
		CatalogueService service = new HashMapCatalogueService();
		StitchThread expectedThread = new StitchThread();
		ItemNumber number = service.add(expectedThread);
		StitchThread returnedThread = service.get(number);
		assertEquals("We expect to retrieve an item that has been added", expectedThread, returnedThread);
		
	}
	
	@Test
	public void testTwoAdds(){
		CatalogueService service = new HashMapCatalogueService();
		StitchThread thread1 = new StitchThread();
		StitchThread thread2 = new StitchThread();
		ItemNumber number1 = service.add(thread1);
		ItemNumber number2 = service.add(thread2);
		assertFalse("we expect that if we add two items, their item numbers are differnt",
				number1.equals(number2));
	}
	
	@Test
	public void testGetTwoItems(){
		CatalogueService service = new HashMapCatalogueService();
		StitchThread thread1 = new StitchThread();
		StitchThread thread2 = new StitchThread();
		ItemNumber number1 = service.add(thread1);
		ItemNumber number2 = service.add(thread2);
		StitchThread returnedThread1 = service.get(number1);
		assertEquals("we expect to be able to retrieve the first entered thread by using it's number",
				thread1, returnedThread1);
		StitchThread returnedThread2 = service.get(number2);
		assertEquals("we expect to be able to retrieve the second entered thread by using it's number",
				thread2, returnedThread2);
		
	}

}
