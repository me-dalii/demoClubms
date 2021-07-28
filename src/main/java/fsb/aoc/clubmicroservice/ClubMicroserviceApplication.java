package fsb.aoc.clubmicroservice;

import fsb.aoc.clubmicroservice.entities.Club;
import fsb.aoc.clubmicroservice.repositories.ClubRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClubMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClubMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClubRepository clubRepository){
        Club c1 = new Club(null, "AOC", "Tay");
        Club c2 = new Club(null, "aiesec", "aiesecer");

        return args -> {
            clubRepository.save(c1);
            clubRepository.save(c2);
        };
    }
}
