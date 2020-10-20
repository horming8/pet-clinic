package demo.springframework.petclinic.bootstrap;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demo.springframework.petclinic.model.Owner;
import demo.springframework.petclinic.model.Pet;
import demo.springframework.petclinic.model.PetType;
import demo.springframework.petclinic.model.Speciality;
import demo.springframework.petclinic.model.Vet;
import demo.springframework.petclinic.service.OwnerService;
import demo.springframework.petclinic.service.PetTypeService;
import demo.springframework.petclinic.service.SpecialityService;
import demo.springframework.petclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
            SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("run()");
        if (specialityService.findAll().isEmpty()) {
            loadData();
        }

    }

    private void loadData() {
        Speciality s1 = new Speciality();
        s1.setDescription("radiology");
        s1 = specialityService.save(s1);

        Speciality s2 = new Speciality();
        s2.setDescription("surgery");
        s2 = specialityService.save(s2);

        Speciality s3 = new Speciality();
        s3.setDescription("dentistry");
        s3 = specialityService.save(s3);

        PetType typeDog = new PetType();
        typeDog.setName("Dog");
        typeDog = petTypeService.save(typeDog);

        PetType typeCat = new PetType();
        typeCat.setName("Cat");
        typeCat = petTypeService.save(typeCat);

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
        vet1.getSpecialities().add(s1);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(s2);
        vetService.save(vet2);
    }

}
