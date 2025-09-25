package model;

public class Reserva {
    private int id;
    private Usuario usuario;
    private Imovel imovel;
    private String dataReserva;

    public Reserva(int id, Usuario usuario, Imovel imovel, String dataReserva) {
        this.id = id;
        this.usuario = usuario;
        this.imovel = imovel;
        this.dataReserva = dataReserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String toString() {
        return "Reserva { " +
                "id=" + id +
                ", usuario=" + usuario.getNome() +
                ", imovel=" + imovel.getEndereco() +
                ", dataReserva='" + dataReserva + '\'' +
                " }";
    }
}