package br.dcx.ufpb.anderson.produto;

import java.util.Objects;
public class Produto {
    private int id;
    private String nome;
    private double valor;

    public Produto(int id, String nome, double valor) throws ProdutoInvalidoException {
        if (nome == null || nome.isEmpty()) {
            throw new ProdutoInvalidoException("O nome do produto não pode ser nulo ou vazio.");
        }
        if (valor < 0) {
            throw new ProdutoInvalidoException("O valor do produto não pode ser negativo.");
        }
        if (id < 0 || id == 0) {
            throw new ProdutoInvalidoException("O ID do produto não pode ser negativo ou zero.");
        }
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return this.id;
    }

    public double getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", valor=" + this.valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id && Double.compare(valor, produto.valor) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, valor);
    }
}
