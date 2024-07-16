package br.dcx.ufpb.anderson.produto;

public class TestaProduto {
    public static void main(String [] args) throws ProdutoInvalidoException {
        try {
            Produto p1 = new Produto(1,"Notebook", 1500.00);
            System.out.println("Produto criado: " + p1.getNome() + " - R$ " + p1.getValor());

            Produto p2 = new Produto(2,"", 1000.00); // Vai lançar exceção
        } catch (ProdutoInvalidoException e) {
            System.out.println("Erro ao criar o produto: " + e.getMessage());
        }

        try {
            Produto p3 = new Produto(4,"Smartphone", -500.00); // Vai lançar exceção
        } catch (ProdutoInvalidoException e) {
            System.out.println("Erro ao criar o produto: " + e.getMessage());
        }
    }
}
