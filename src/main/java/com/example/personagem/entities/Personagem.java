package com.example.personagem.entities;

import com.example.personagem.enums.TipoClasses;
import jakarta.persistence.*;

        import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personages")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nomePersonagem;
    private TipoClasses classe;
    private int level;
    private int forca;
    private int defesa;

    @OneToMany(mappedBy = "personagem", cascade = CascadeType.ALL)
    private List<ItemMagico> itensMagicos = new ArrayList<>();



    public Personagem() {
    }

    public Personagem(Long id, String nome, String nomePersonagem, TipoClasses classe, int level, int forca, int defesa) {
        this.id = id;
        this.nome = nome;
        this.nomePersonagem = nomePersonagem;
        this.classe = classe;
        this.level = level;
        this.forca = forca;
        this.defesa = defesa;
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

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public TipoClasses getClasse() {
        return classe;
    }

    public void setClasse(TipoClasses classe) {
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

    public List<ItemMagico> getItensMagicos() {
        return itensMagicos;
    }

    public void setItensMagicos(List<ItemMagico> itensMagicos) {
        this.itensMagicos = itensMagicos;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nomePersonagem='" + nomePersonagem + '\'' +
                ", classe='" + classe + '\'' +
                ", level=" + level +
                ", forcaTotal=" + getForca() +
                ", defesaTotal=" + getDefesa() +
                '}';
    }
}



