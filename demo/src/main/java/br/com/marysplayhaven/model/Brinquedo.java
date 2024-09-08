package br.com.marysplayhaven.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;
    private String imagem;
    private String marca;
    private String descricao;

    @ElementCollection(targetClass = Beneficio.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "brinquedo_beneficios")
    @Column(name = "beneficio")
    private List<Beneficio> beneficios;

    @ElementCollection(targetClass = Categoria.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "brinquedo_categorias")
    @Column(name = "categoria")
    private List<Categoria> categorias;

    // Construtor vazio
    public Brinquedo() {
    }

    // Construtor com parâmetros (exclua se não for necessário)
    public Brinquedo(String nome, double preco, String imagem, String marca, String descricao,
                     List<Beneficio> beneficios, List<Categoria> categorias) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
        this.marca = marca;
        this.descricao = descricao;
        this.beneficios = beneficios;
        this.categorias = categorias;
    }

    // Getters e Setters

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    // Métodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brinquedo brinquedo = (Brinquedo) o;
        return Objects.equals(id, brinquedo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
