package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ConfigurationForNumbers {

    @Bean
    public Integer returnFour() {
        return 4;
    }

    @Bean
    @Profile("five")
    public Integer returnFive() {
        return 5;
    }

    @Bean
    @Profile("six")
    public Integer returnSix() {
        return 6;
    }
}
