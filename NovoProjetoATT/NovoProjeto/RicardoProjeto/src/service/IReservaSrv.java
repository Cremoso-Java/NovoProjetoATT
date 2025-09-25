package service;

import model.Reserva;
import java.util.List;

public interface IReservaSrv {
    void salvar(Reserva r);
    Reserva buscar(int id);
    List<Reserva> listar();
    void deletar(int id);
}