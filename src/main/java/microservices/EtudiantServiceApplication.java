package microservices;

import microservices.Entities.Etudiant;
import microservices.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EtudiantServiceApplication implements CommandLineRunner {
	@Autowired
	EtudiantRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(EtudiantServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Etudiant e1 = Etudiant.builder().nom("Khaldi").age(23).email("khaldi@gamai.com").build();
		Etudiant e2 = Etudiant.builder().nom("EL Arroud").age(23).email("arroud@gamai.com").build();
		repository.save(e1);
		repository.save(e2);
	}

}