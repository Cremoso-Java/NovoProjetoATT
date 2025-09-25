package service;

import model.Pagamento;
import java.util.List;

public interface IPagamentoSrv {
    void salvar(Pagamento p);
    Pagamento buscar(int id);
    List<Pagamento> listar();
    void deletar(int id);
}