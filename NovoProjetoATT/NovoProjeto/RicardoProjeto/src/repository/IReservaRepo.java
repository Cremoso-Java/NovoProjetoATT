package repository;

import model.Reserva;
import java.util.List;

public interface IReservaRepo {
    void add(Reserva r);
    Reserva getById(int id);
    List<Reserva> getAll();
    void remove(int id);
    List<Reserva> listar();
}