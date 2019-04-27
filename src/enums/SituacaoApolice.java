package enums;

public enum SituacaoApolice {
    EMNEGOCIACAO(1), CANCELADA(2), QUITADA(3), PARCELADA(4);

    private final int valor;

    SituacaoApolice(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }


}
