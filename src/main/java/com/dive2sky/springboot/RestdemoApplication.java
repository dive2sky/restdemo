package com.dive2sky.springboot;

import com.dive2sky.springboot.models.User;
import com.dive2sky.springboot.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestdemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestdemoApplication.class, args);
        //app.setBannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext context = app.run(RestdemoApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

        userRepository.save(new User("Kunsu"));
        userRepository.save(new User("Seyeon"));
        userRepository.save(new User("Seoeun"));
	}
}
