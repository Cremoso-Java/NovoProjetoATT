package repository;

import model.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class PagamentoRepo implements IPagamentoRepo {
    private List<Pagamento> lista = new ArrayList<>();

    @Override
    public void add(Pagamento p) {
        lista.add(p);
    }

    @Override
    public Pagamento getById(int id) {
        for (Pagamento p : lista) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Pagamento> getAll() {
        return lista;
    }

    @Override
    public void remove(int id) {
        lista.removeIf(p -> p.getId() == id);
    }

    @Override
    public List<Pagamento> listar() {

        return lista;


    }

}