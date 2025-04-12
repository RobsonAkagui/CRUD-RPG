package com.example.personagem.controller;


import com.example.personagem.entities.Personagem;
import com.example.personagem.services.PersongemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagens")
@Tag(name = "Personagens")
public class PersonagemController {

    @Autowired
    private PersongemService persongemService;

    @PostMapping
    @Operation(summary = "Criar um novo Personagem")
    public ResponseEntity<Personagem> criarPersonagem(@RequestBody Personagem personagem) {
        return PersongemService.criarPersonagem(personagem);
    }

    @GetMapping
    @Operation(summary = "Lista dos Personagens")
    public List<Personagem> ListaDePersonagens() {
        return PersongemService.ListaDePersonagens;
    }
    @GetMapping("/{id}")
    @Operation(summary = "Buscar personagem por ID")
    public ResponseEntity<Personagem> buscarPorId(@PathVariable Long id) {
        Personagem personagem = PersongemService.buscarPorId(id);
        if (personagem != null) {
            return ResponseEntity.ok(personagem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}/nome")
    @Operation(summary = "Atualizar o nome de um personagem")
    public ResponseEntity<Personagem> atualizarNome(@PathVariable Long id, @RequestParam String novoNome) {
        Personagem atualizado = PersongemService.atualizarNome(id, novoNome);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um personagem")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        PersongemService.deletar(id);
        return ResponseEntity.noContent().build();
    }


}
