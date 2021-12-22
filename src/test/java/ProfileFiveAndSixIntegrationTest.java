import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig(ConfigurationForNumbers.class)
@ActiveProfiles("five, six")
class ProfileFiveAndSixIntegrationTest {

	@Autowired
	private List<Integer> values;

	@Test
	void autowired_profileFiveAndSix_for() {
		assertTrue(values.contains(5));
		assertTrue(values.contains(6));
	}
}
