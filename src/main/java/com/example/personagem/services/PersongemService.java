package com.example.personagem.services;

import com.example.personagem.entities.Personagem;
import com.example.personagem.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PersongemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    //criação de personagem
    public ResponseEntity<List<Personagem>> criarPersonagem(Personagem personagem) {
        if ((personagem.getForca() + personagem.getDefesa()) > 10) {
            throw new IllegalArgumentException("A soma de força e defesa não pode ser maior que 10. ");
        } else if (personagem.getForca() < 1 || personagem.getDefesa() < 1) {
            throw new IllegalArgumentException("força e defesa deve ser maior que 1");
        } else {
            personagemRepository.save(personagem);
            return ResponseEntity.ok().body(personagemRepository.findAll());
        }
    }
    //lista de personagem
        public List<Personagem> getAllPersonagem() {
        return personagemRepository.findAll();
    }


    //buscar personagem
        public Personagem getAllPersonagem(Long id) {
            return personagemRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Personagem não encontrado com o ID: " + id));
        }


        //delete personagem
    public ResponseEntity<?>deletePersonagem(@PathVariable Long id){
        if (!personagemRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        personagemRepository.deleteById(id);
        return ResponseEntity.ok("Personagem deletado com sucesso!");
    }
    //atualizar nome personagem
    public Personagem updateNome(Long id, String novoNome) {
        Optional<Personagem> response = personagemRepository.findById(id);

        if (response.isPresent()) {
            Personagem personagem = response.get();
            personagem.setNome(novoNome);
            return personagemRepository.save(personagem);
        }else {
            return null;
        }
    }

}
