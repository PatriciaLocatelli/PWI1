package classes;

import java.time.LocalDate;
import java.util.LinkedList;

public class Cliente extends Pessoa {

    private String endereco;
    private String telefone;
    private LinkedList<VeiculoSegurado> veiculoSegurado;

    public Cliente() {
    }

    public Cliente(String endereco, String telefone, LinkedList<VeiculoSegurado> veiculoSegurado, String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
        this.veiculoSegurado = veiculoSegurado;
    }

    public Cliente(String endereco, String telefone, String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LinkedList<VeiculoSegurado> getVeiculoSegurado() {
        return veiculoSegurado;
    }

    public void setVeiculoSegurado(LinkedList<VeiculoSegurado> veiculoSegurado) {
        this.veiculoSegurado = veiculoSegurado;
    }

    @Override
    public String toString() {
        String veiculos = "";
        for (VeiculoSegurado veiculoSegurado1 : veiculoSegurado) {
            if(veiculoSegurado1 != null)
                veiculos += veiculoSegurado1.toString() + "\n";
        }
        if (getVeiculoSegurado() == null) {
            veiculos =  "Nenhum veículo cadastrado";
        } 
        return super.toString() + " Endereço: " + getEndereco() + " Telefone : " + getTelefone() + "Veículos :" + veiculos;
    }
}
