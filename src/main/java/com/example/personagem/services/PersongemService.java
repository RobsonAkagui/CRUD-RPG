package com.example.personagem.services;

import com.example.personagem.entities.Personagem;
import com.example.personagem.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersongemService {

    @Autowired
    private PersonagemRepository personagemRepository;


    public ResponseEntity<Personagem> createPersonagem(@RequestBody Personagem personagem) {
        Personagem newPersonagem = personagemRepository.save(personagem);
        return ResponseEntity.ok(newPersonagem);
    }

}
