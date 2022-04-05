package com.react.reactboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@RestController
@SpringBootApplication
public class ReactBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactBoardApplication.class, args);
	}

	@Bean
	MappingJackson2JsonView jsonView() {
		return new MappingJackson2JsonView();
	}

}
