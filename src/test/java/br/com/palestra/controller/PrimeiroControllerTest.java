package br.com.palestra.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.caelum.vraptor.util.test.MockResult;

public class PrimeiroControllerTest {

	private MockResult result;
	private PrimeiroController controller;

	@Before
	public void setUp() {
		result = new MockResult();
		controller = new PrimeiroController(result);
	}

	@Test
	public void testHome() {
		controller.home();
		Assert.assertTrue(result.included().containsKey("message"));
	}
}
