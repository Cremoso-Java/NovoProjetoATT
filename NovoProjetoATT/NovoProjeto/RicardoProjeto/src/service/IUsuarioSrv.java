package service;

import model.Usuario;
import java.util.List;

public interface IUsuarioSrv {
    void salvar(Usuario u);
    Usuario buscar(int id);
    List<Usuario> listar();
    void deletar(int id);
}