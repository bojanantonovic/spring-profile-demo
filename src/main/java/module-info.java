module spring.profile.demo {
	exports demo;

	requires spring.beans;
	requires spring.context;
	requires spring.core;

	opens demo to spring.core;
}
