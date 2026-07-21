package epn.edu;

import epn.edu.Modelo.Inventor;
import epn.edu.Repository.InventorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestServicio implements CommandLineRunner {

    @Autowired
    private InventorRepository repositorio;

    public static void main(String[] args) {
        SpringApplication.run(TestServicio.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        for (Inventor i : repositorio.findAll()) {
            System.out.println(i.getNombre());
        }
    }
}