package demo_test;

import demo.ConfigurationForNumbers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(ConfigurationForNumbers.class)
@ActiveProfiles("six")
class ProfileSixIntegrationTest {

	@Autowired
	private Set<Integer> values;

	@Test
	void autowired_sixProfile_fourAndFive() {
		assertEquals(Set.of(4, 6), values);
	}
}
