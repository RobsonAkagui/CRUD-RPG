package com.example.personagem.services;


import com.example.personagem.entities.ItemMagico;
import com.example.personagem.repositories.ItemMagicoRepository;
import com.example.personagem.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service

public class ItemService {

    @Autowired
    private ItemMagicoRepository itemMagicoRepository;

    @Autowired
    private PersonagemRepository personagemRepository;

    public ItemMagico createItemMagico(ItemMagico item){


    }
}
/*
    //criação item magico
    public ResponseEntity<ItemMagico> createItemMagico(@RequestBody ItemMagico itemMagico){
        ItemMagico  newItemMagico = ItemMagicoRepository.save(itemMagico);
        return ResponseEntity.ok(newItemMagico);
    }
    //lista items
    public ResponseEntity<List<ItemMagico>> getAllItemMagicos(){
        List<ItemMagico> AllItemMagicos = itemMagicoRepository.findAll();
        return ResponseEntity.ok(AllItemMagicos);
    }
    //busca item
    public ResponseEntity<ItemMagico> getItemMagicoById(@PathVariable long id){
        Optional<ItemMagico> itemMagico = itemMagicoRepository.findById(id);
        if(itemMagico.isPresent()){
            return ResponseEntity.ok(itemMagico.get());
        }else {
            return ResponseEntity.notFound().build();
        }

    }
*/