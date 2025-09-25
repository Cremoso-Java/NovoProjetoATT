package service;

import model.Pagamento;
import repository.IPagamentoRepo;
import java.util.List;

public class PagamentoSrv implements IPagamentoSrv {
    private IPagamentoRepo repo;

    public PagamentoSrv(IPagamentoRepo repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(Pagamento p) {
        repo.add(p);
    }

    @Override
    public Pagamento buscar(int id) {
        return repo.getById(id);
    }

    @Override
    public List<Pagamento> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.remove(id);
    }
}