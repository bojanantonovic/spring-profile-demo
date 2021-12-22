import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProfilesUnitTest {

	private AnnotationConfigApplicationContext context;

	@BeforeEach
	void init() {
		context = new AnnotationConfigApplicationContext();
		context.register(ConfigurationForNumbers.class);
	}

	@AfterEach
	void close() {
		context.close();
	}

	@Test
	void testDefaultProfile() {
		// act
		var value = context.getBean(Integer.class);

		assertEquals(4, value);
	}

	@Test
	void testProfileFive() {
		// arrange
		context.getEnvironment().setActiveProfiles("five");
		context.refresh();

		// act
		var value = context.getBean(Integer.class);

		assertEquals(5, value);
	}

	@Test
	void testProfileSix() {
		// arrange
		context.getEnvironment().setActiveProfiles("six");
		context.refresh();

		// act
		var value = context.getBean(Integer.class);

		assertEquals(6, value);
	}
}
