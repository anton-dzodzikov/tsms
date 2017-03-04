package solutions.lightprocessing.tsms.application

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = "solutions.lightprocessing.tsms")
class Application {
    static void main(String... args) {
        SpringApplication.run(Application.class, args)
    }
}