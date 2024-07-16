package br.dcx.ufpb.anderson.produto;

public class ProdutoInvalidoException extends Exception {
    public ProdutoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
