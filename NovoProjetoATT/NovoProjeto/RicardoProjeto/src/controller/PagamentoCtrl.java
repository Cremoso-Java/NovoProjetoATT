package controller;

import model.Pagamento;
import service.IPagamentoSrv;
import java.util.List;

public class PagamentoCtrl {
    private IPagamentoSrv srv;

    public PagamentoCtrl(IPagamentoSrv srv) {
        this.srv = srv;
    }

    public void cadastrar(Pagamento p) {
        srv.salvar(p);
    }

    public Pagamento buscar(int id) {
        return srv.buscar(id);
    }

    public List<Pagamento> listar() {
        return srv.listar();
    }

    public void remover(int id) {
        srv.deletar(id);
    }
}