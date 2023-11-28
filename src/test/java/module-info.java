module demo_test {

	requires spring.profile.demo;

	// Spring dependencies
	requires spring.beans;
	requires spring.core;

	// test dependencies
	requires spring.test;
	requires org.junit.jupiter.api;
	requires org.junit.jupiter.engine;

	// opens for JUnit
	opens demo_test to org.junit.platform.commons, spring.core;
}
