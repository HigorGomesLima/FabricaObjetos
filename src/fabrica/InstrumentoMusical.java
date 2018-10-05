package fabrica;

public abstract class InstrumentoMusical {
    protected String nome;
    protected int preco;
    protected String tipo;

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

}
