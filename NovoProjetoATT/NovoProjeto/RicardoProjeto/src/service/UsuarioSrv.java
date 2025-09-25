package service;

import model.Usuario;
import repository.IUsuarioRepo;
import java.util.List;

public class UsuarioSrv implements IUsuarioSrv {
    private IUsuarioRepo repo;

    public UsuarioSrv(IUsuarioRepo repo) {
        this.repo = repo;
    }

    @Override
    public void salvar(Usuario u) {
        repo.add(u);
    }

    @Override
    public Usuario buscar(int id) {
        return repo.getById(id);
    }

    @Override
    public List<Usuario> listar() {
        return repo.listar();
    }

    @Override
    public void deletar(int id) {
        repo.remove(id);
    }
}