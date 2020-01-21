package training.validation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ISBNValidatorTest {
	ISBNValidator validator;
	
	@Before
	public void setUp() {
		System.out.println("@Before");
		validator = new ISBNValidator();
	}
	@After
	public void cleanUp() {
		System.out.println("@After");		
	}
	@BeforeClass
	public static void setUpClass() {
		System.out.println("@BeforeClass");				
	}
	@AfterClass
	public static void cleanUpClass() {
		System.out.println("@AfterClass");				
	}
	
	@Test
	public void testIsValid_param_is_null_then_ret_false(){
		String isbn = null ;
		assertFalse(validator.isValid(isbn, null));
	}
	@Test
	public void testIsValid_param_is_short_then_ret_false(){
		String isbn = "123456789012" ;
		assertFalse(validator.isValid(isbn, null));
	}
	@Test
	public void testIsValid_param_is_invalid_isbn_then_ret_false(){
		String isbn = "123-456-7890-123" ;
		assertFalse(validator.isValid(isbn, null));
	}
	@Test
	public void testIsValid_param_is_valid_isbn_then_ret_true(){
		String isbn = "9784798140926" ;
		assertTrue(validator.isValid(isbn, null));
	}
	@Test
	public void testIsValid_param_is_contain_hyphen_isbn_then_ret_true(){
		String isbn = "978-4798140926" ;
		assertTrue(validator.isValid(isbn, null));
	}

}
