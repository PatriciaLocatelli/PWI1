package classes;

public final class Modelo {

    private String descricao;

    public Modelo() {
    }

    public Modelo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao();
    }

}
