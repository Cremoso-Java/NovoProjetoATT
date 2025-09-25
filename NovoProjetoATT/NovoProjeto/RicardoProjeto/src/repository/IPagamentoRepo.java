package repository;

import model.Pagamento;
import java.util.List;

public interface IPagamentoRepo {
    void add(Pagamento p);
    Pagamento getById(int id);
    List<Pagamento> getAll();
    void remove(int id);
    List<Pagamento> listar();
}