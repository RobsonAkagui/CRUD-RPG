package com.example.personagem.controller;


import com.example.personagem.entities.ItemMagico;
import com.example.personagem.services.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
@Tag(name = "Item Magico")

public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    @Operation(summary = "criar um novo item magico")
    public ResponseEntity<ItemMagico> criarItem(@RequestBody ItemMagico itemMagico){
        return itemService.criarItem(itemMagico);
    }

    @GetMapping
    @Operation(summary = "Lista de todos os itens")
    public ResponseEntity<List<ItemMagico>> listarItem(){
        return itemService.listarItem();
    }
    @GetMapping("/{id}")
    @Operation(summary = "Buscar Item Mágico por ID")
    public ResponseEntity<ItemMagico> buscarItemPorId(@PathVariable Long id) {
        ItemMagico item = itemService.buscarItemPorId(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
