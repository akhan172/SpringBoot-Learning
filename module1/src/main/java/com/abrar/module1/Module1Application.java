package com.abrar.module1;

import com.abrar.module1.Service.CakeBaker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {
    private final CakeBaker cb;
    public Module1Application(CakeBaker cb){
        this.cb=cb;
    }
	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        cb.bakeCake();
    }
}
