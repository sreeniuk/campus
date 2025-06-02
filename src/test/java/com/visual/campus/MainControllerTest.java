package com.visual.campus;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class MainControllerTest {
	
	MainController controller = new MainController();
	

	@Test
	void testGetNames() {
       
		// Act
        List<String> names = controller.getNames(true);

        // Assert
        assertNotNull(names, "Returned list should not be null");
        assertEquals(4, names.size(), "List should contain 4 names");
        assertTrue(names.contains("Alice"), "List should contain 'Alice'");
        assertTrue(names.contains("Bob"), "List should contain 'Bob'");
        assertEquals(List.of("Alice", "Bob", "Charlie", "David"), names, "Names should match expected order");
	}

}