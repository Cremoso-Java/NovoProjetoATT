package controller;

import model.Usuario;
import service.IUsuarioSrv;
import java.util.List;

public class UsuarioCtrl {
    private IUsuarioSrv srv;

    public UsuarioCtrl(IUsuarioSrv srv) {
        this.srv = srv;
    }

    public void cadastrar(Usuario u) {
        srv.salvar(u);
    }

    public Usuario buscar(int id) {
        return srv.buscar(id);
    }

    public List<Usuario> listar() {
        return srv.listar();
    }

    public void remover(int id) {
        srv.deletar(id);
    }
}