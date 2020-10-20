package demo.springframework.petclinic.bootstrap;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demo.springframework.petclinic.model.Owner;
import demo.springframework.petclinic.model.Pet;
import demo.springframework.petclinic.model.PetType;
import demo.springframework.petclinic.model.Vet;
import demo.springframework.petclinic.service.OwnerService;
import demo.springframework.petclinic.service.PetTypeService;
import demo.springframework.petclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("run()");

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType typeDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType typeCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 disneyland");
        owner1.setCity("city1");
        owner1.setPhone("123456789");

        Pet owner1Pet1 = new Pet();
        owner1Pet1.setType(typeDog);
        owner1Pet1.setOwner(owner1);
        owner1Pet1.setBirthDate(LocalDate.now());
        owner1Pet1.setName("Rosco");

        owner1.getPets().add(owner1Pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("321 disneyland");
        owner2.setCity("city2");
        owner2.setPhone("987654321");

        Pet owner2Pet2 = new Pet();
        owner2Pet2.setType(typeCat);
        owner2Pet2.setOwner(owner1);
        owner2Pet2.setBirthDate(LocalDate.now());
        owner2Pet2.setName("cattype");

        owner2.getPets().add(owner2Pet2);

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

    }

}
