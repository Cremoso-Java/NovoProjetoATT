package controller;

import model.Reserva;
import service.IReservaSrv;
import java.util.List;

public class ReservaCtrl {
    private IReservaSrv srv;

    public ReservaCtrl(IReservaSrv srv) {
        this.srv = srv;
    }

    public void cadastrar(Reserva r) {
        srv.salvar(r);
    }

    public Reserva buscar(int id) {
        return srv.buscar(id);
    }

    public List<Reserva> listar() {
        return srv.listar();
    }

    public void remover(int id) {
        srv.deletar(id);
    }
}