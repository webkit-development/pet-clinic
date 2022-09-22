package src.main.java.com.stradtkt.petclinic.services;
import com.stradtkt.petclinic.model.Pet;
import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
