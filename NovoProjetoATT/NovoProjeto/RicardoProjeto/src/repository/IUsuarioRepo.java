package repository;

import model.Usuario;

import java.util.List;

public interface IUsuarioRepo {
    void add(Usuario u);

    Usuario getById(int id);

    List<Usuario> getAll();

    void remove(int id);

    List<Usuario> listar();
}