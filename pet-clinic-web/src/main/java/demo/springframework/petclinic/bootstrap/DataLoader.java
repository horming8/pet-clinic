package demo.springframework.petclinic.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demo.springframework.petclinic.model.Owner;
import demo.springframework.petclinic.model.Vet;
import demo.springframework.petclinic.service.OwnerService;
import demo.springframework.petclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(DataLoader.class);

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("run()");

        Long oid = 0L;
        Owner owner1 = new Owner();
        owner1.setId(++oid);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(++oid);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        Long vid = 0L;
        Vet vet1 = new Vet();
        vet1.setId(++vid);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(++vid);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

    }

}
