package com.example.personagem.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "personages")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nomeChar;
    private String classe;
    private int level;
    private int forca;
    private int defesa;
    private char itemMagico;

    public Personagem() {

    }

    public Personagem(Long id, String nome, String nomeChar, String classe, int level, int forca, int defesa, char itemMagico) {
        this.id = id;
        this.nome = nome;
        this.nomeChar = nomeChar;
        this.classe = classe;
        this.level = level;
        this.forca = forca;
        this.defesa = defesa;
        this.itemMagico = itemMagico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeChar() {
        return nomeChar;
    }

    public void setNomeChar(String nomeChar) {
        this.nomeChar = nomeChar;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public char getItemMagico() {
        return itemMagico;
    }

    public void setItemMagico(char itemMagico) {
        this.itemMagico = itemMagico;
    }
}
