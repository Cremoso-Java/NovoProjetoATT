package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public  class UsuarioRepo implements IUsuarioRepo {
    private List<Usuario> lista = new ArrayList<>();


    public void add(Usuario u) {
        lista.add(u);
    }


    public Usuario getById(int id) {
        for (Usuario u : lista) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    @Override
    public List<Usuario> listar() {
        return new ArrayList<>(lista);
    }



    public List<Usuario> getAll() {
        return lista;
    }


    public void remove(int id) {
        lista.removeIf(u -> u.getId() == id);
    }


}