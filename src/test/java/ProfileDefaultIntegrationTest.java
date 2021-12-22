import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ConfigurationForNumbers.class)
class ProfileDefaultIntegrationTest {

	@Autowired
	private int value;

	@Test
	void autowired_defaultProfile_for() {
		Assertions.assertEquals(4, value);
	}
}
