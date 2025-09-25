package repository;

import model.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaRepo implements IReservaRepo {
    private List<Reserva> lista = new ArrayList<>();

    @Override
    public void add(Reserva r) {
        lista.add(r);
    }

    @Override
    public Reserva getById(int id) {
        for (Reserva r : lista) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    @Override
    public List<Reserva> getAll() {
        return lista;
    }

    @Override
    public List<Reserva> listar() {
        return lista;
    }




    public void remove(int id) {
        lista.removeIf(r -> r.getId() == id);
    }
}