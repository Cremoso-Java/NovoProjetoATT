package model;

public class Dono extends Usuario {
    private String cpf;

    public Dono(int id, String nome, String email, String tel, String cpf) {
        super(id, nome, email, tel);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Dono { " +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", tel='" + getTel() + '\'' +
                ", cpf='" + cpf + '\'' +
                " }";
    }
}