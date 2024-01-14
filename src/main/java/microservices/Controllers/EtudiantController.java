package microservices.Controllers;


import microservices.Entities.Etudiant;
import microservices.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // JSON
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    EtudiantRepository repository;
    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long x) {
        return repository.findById(x).get();
    }
    @PostMapping
    public Etudiant saveEtudiant(@RequestBody Etudiant e) {
        return repository.save(e);
    }

}
// see u later; fiya joo3 bghit nat3acha :( okay? bye bye bae oki

