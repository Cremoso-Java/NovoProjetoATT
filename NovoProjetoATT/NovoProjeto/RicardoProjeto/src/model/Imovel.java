package model;

public class Imovel {
    private int id;
    private String endereco;
    private double preco;
    private Dono dono;

    public Imovel(int id, String endereco, double preco, Dono dono) {
        this.id = id;
        this.endereco = endereco;
        this.preco = preco;
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String toString() {
        return "Imovel { " +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", preco=" + preco +
                ", dono=" + dono.getNome() +
                " }";
    }
}