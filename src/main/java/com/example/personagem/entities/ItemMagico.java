package com.example.personagem.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "itemMagicos")
public class ItemMagico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeItem;
    private String tipoItem;
    private String forcaItem;
    private String defesaItem;

    public ItemMagico() {

    }

    public ItemMagico(Long id, String nomeItem, String tipoItem, String forcaItem, String defesaItem) {
        this.id = id;
        this.nomeItem = nomeItem;
        this.tipoItem = tipoItem;
        this.forcaItem = forcaItem;
        this.defesaItem = defesaItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getForcaItem() {
        return forcaItem;
    }

    public void setForcaItem(String forcaItem) {
        this.forcaItem = forcaItem;
    }

    public String getDefesaItem() {
        return defesaItem;
    }

    public void setDefesaItem(String defesaItem) {
        this.defesaItem = defesaItem;
    }
}
