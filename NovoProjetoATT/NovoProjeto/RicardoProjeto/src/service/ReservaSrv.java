package service;

import model.Reserva;
import repository.IReservaRepo;
import java.util.List;

public class ReservaSrv implements IReservaSrv {
    private IReservaRepo repo;

    public ReservaSrv(IReservaRepo repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(Reserva r) {
        repo.add(r);
    }

    @Override
    public Reserva buscar(int id) {
        return repo.getById(id);
    }

    @Override
    public List<Reserva> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.remove(id);
    }
}