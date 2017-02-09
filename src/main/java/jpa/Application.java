/**
package jpa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository, AddressBookRepository repo) {
        return (args) -> {
            // save a couple of customers
            repository.save(new BuddyInfo("Jack", "98734"));
            repository.save(new BuddyInfo("Chloe", "82934723"));
            repository.save(new BuddyInfo("Kim", "2389472"));
            repository.save(new BuddyInfo("David", "23984723"));
            repository.save(new BuddyInfo("Michelle", "098213"));

            // fetch all buddies
            log.info("Buddies found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddy : repository.findAll()) {
                log.info(buddy.getName() + " " + buddy.getPhoneNumber());
            }
            log.info("");


            // fetch buddies by last name
            log.info("Buddies found with findByName('Jack'):");
            log.info("--------------------------------------------");
            for (BuddyInfo buddy : repository.findByName("Jack")) {
                log.info(buddy.getName() + " " + buddy.getPhoneNumber());
            }
            log.info("");

            // Save an address book
            AddressBook a = new AddressBook();
            a.addBuddy(new BuddyInfo("Chloe", "82934723"));
            repo.save(a);
            AddressBook a2 = new AddressBook();
            a2.addBuddy(new BuddyInfo("Bob", "ksldj"));
            repo.save(a2);

            // Fetch all address books
            log.info("Address Books found with findAll():");
            log.info("-------------------------------");
            for (AddressBook book : repo.findAll()) {
                log.info(book.getId().toString());
            }
            log.info("");

            // fetch address books by id
            log.info("Address Books found with id=1:");
            log.info("--------------------------------------------");
            for (AddressBook book : repo.findById(1)) {
                log.info(book.getId().toString());
            }
            log.info("");
        };
    }

}

 */