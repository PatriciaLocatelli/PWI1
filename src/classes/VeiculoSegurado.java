package classes;

public class VeiculoSegurado {

    private double kilometragem;
    private String placa;
    private Cliente cliente;
    private Modelo modelo;
    private Apolice apolice;

    private static int contador = 0;

    public VeiculoSegurado() {
    }

    public VeiculoSegurado(double kilometragem, String placa, Cliente cliente, Modelo modelo, Apolice apolice) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        this.cliente = cliente;
        this.modelo = modelo;
        this.apolice = apolice;
        contador++;
    }

    public VeiculoSegurado(double kilometragem, String placa, Modelo modelo, Apolice apolice) {
        this.kilometragem = kilometragem;
        this.placa = placa;
        this.modelo = modelo;
        this.apolice = apolice;
        contador++;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Apolice getApolice() {
        return apolice;
    }

    public void setApolice(Apolice apolice) {
        this.apolice = apolice;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        String aux = "";
        if (getCliente() == null) {
            aux = " Cliente não cadastrado \n";
        } 
        if (getModelo() == null) {
           aux += " Modelo não cadastrado \n";
        } 
        if (getApolice() == null) {
            aux += " Apolice não cadastrada \n";
        } 
        return "Kilometragem: " + getKilometragem() + " Placa: " + getPlaca() + "\n"
                    + aux;
    
    }

}