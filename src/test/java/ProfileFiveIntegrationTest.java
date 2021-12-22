import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ConfigurationForNumbers.class)
@ActiveProfiles("five")
class ProfileFiveIntegrationTest {

	@Autowired
	private int value;

	@Test
	void autowired_fiveProfile_for() {
		Assertions.assertEquals(5, value);
	}

}
