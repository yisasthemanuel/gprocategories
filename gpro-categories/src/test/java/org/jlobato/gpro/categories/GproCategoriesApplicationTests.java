package org.jlobato.gpro.categories;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.jlobato.gpro.categories.adapter.primary.web.CategoryRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class GproCategoriesApplicationTests.
 */
@SpringBootTest
class GproCategoriesApplicationTests {

	/**
	 * Context loads.
	 * @throws JsonProcessingException 
	 */
	@Test
	void contextLoads() throws JsonProcessingException {
		assertTrue(true);
		
		CategoryRequest req = new CategoryRequest(9, 6, "SUB", "S", "Subproducto");
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(req));
	}

}
