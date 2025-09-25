package model;

public class Pagamento {
    private int id;
    private Reserva reserva;
    private double valor;
    private PagamentoSituacao situacao;

    public Pagamento(int id, Reserva reserva, double valor) {
        this.id = id;
        this.reserva = reserva;
        this.valor = valor;
        this.situacao = PagamentoSituacao.PENDENTE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PagamentoSituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(PagamentoSituacao situacao) {
        this.situacao = situacao;
    }

 
    public String toString() {
        return "Pagamento { " +
                "id=" + id +
                ", reserva=" + reserva.getId() +
                ", valor=" + valor +
                ", situacao=" + situacao +
                " }";
    }
}