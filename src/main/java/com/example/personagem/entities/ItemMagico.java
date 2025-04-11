package com.example.personagem.entities;


import com.example.personagem.enums.TipoItens;
import jakarta.persistence.*;

@Entity
@Table(name = "itemMagicos")
public class ItemMagico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeItem;
    private TipoItens tipo;
    private String forcaItem;
    private String defesaItem;

    @ManyToOne
    @JoinColumn(name = "personagem_id")
    private Personagem personagem;

    public ItemMagico() {

    }

    public ItemMagico(String nomeItem, TipoItens tipo, String forcaItem, String defesaItem) {
        this.nomeItem = nomeItem;
        this.tipo = tipo;
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

    public TipoItens getTipo() {
        return tipo;
    }

    public void setTipo(TipoItens tipo) {
        this.tipo = tipo;
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
