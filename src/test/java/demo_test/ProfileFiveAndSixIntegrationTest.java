package demo_test;

import demo.ConfigurationForNumbers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(ConfigurationForNumbers.class)
@ActiveProfiles(profiles = {"five", "six"})
class ProfileFiveAndSixIntegrationTest {

	@Autowired
	private Set<Integer> values;

	@Test
	void autowired_profileFiveAndSix_for() {
		assertEquals(Set.of(4, 5, 6), values);
	}
}
