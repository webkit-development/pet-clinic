package src.main.java.com.stradtkt.petclinic.services;
import com.stradtkt.petclinic.model.Vet;
import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
