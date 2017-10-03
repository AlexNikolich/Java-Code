package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBiblioBook {

	BiblioBook bibDoc;
	/*
	* Tests should begin with the @Test tag.
	*/
	@Test
	public void documentCreationTest() {
	bibDoc= new BiblioBook ("a", "t", "1999");
	assertEquals("a",bibDoc.getAuthor());
	assertEquals("t", bibDoc.getTitle());
	assertEquals("1999", bibDoc.getYear());
	bibDoc= null;
	}

}
