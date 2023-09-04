package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import security.documents.User;
import security.repositories.UserRepo;

@SpringBootApplication
@EnableMongoRepositories
public class Application  implements CommandLineRunner {

	@Autowired
	UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		userRepo.save(new User("String","String"));
		System.out.println("User has been registered...");
	}
}
