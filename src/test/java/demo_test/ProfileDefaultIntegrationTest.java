package demo_test;

import demo.ConfigurationForNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Set;

@SpringJUnitConfig(ConfigurationForNumbers.class)
class ProfileDefaultIntegrationTest {

	@Autowired
	private Set<Integer> values;

	@Test
	void autowired_defaultProfile_four() {
		Assertions.assertEquals(Set.of(4), values);
	}
}
