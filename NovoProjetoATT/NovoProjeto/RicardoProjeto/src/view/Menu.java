package view;

import controller.UsuarioCtrl;
import controller.ReservaCtrl;
import controller.PagamentoCtrl;
import model.*;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private UsuarioCtrl usuarioCtrl;
    private ReservaCtrl reservaCtrl;
    private PagamentoCtrl pagamentoCtrl;

    public Menu(UsuarioCtrl usuarioCtrl, ReservaCtrl reservaCtrl, PagamentoCtrl pagamentoCtrl) {
        this.usuarioCtrl = usuarioCtrl;
        this.reservaCtrl = reservaCtrl;
        this.pagamentoCtrl = pagamentoCtrl;
    }

    public void exibir() {
        int op = -1;

        while (op != 0) {
            System.out.println("\n=== MENU AIRBNB ===");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Listar Usuarios");
            System.out.println("3 - Fazer Reserva");
            System.out.println("4 - Listar Reservas");
            System.out.println("5 - Registrar Pagamento");
            System.out.println("6 - Listar Pagamentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> cadastrarUsuario();
                case 2 -> listarUsuarios();
                case 3 -> cadastrarReserva();
                case 4 -> listarReservas();
                case 5 -> cadastrarPagamento();
                case 6 -> listarPagamentos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }
        }
    }

    private void cadastrarUsuario() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Tel: ");
        String tel = sc.nextLine();

        Usuario u = new Usuario(id, nome, email, tel);
        usuarioCtrl.cadastrar(u);
        System.out.println("Usuario cadastrado!");
    }

    private void listarUsuarios() {
        for (Usuario u : usuarioCtrl.listar()) {
            System.out.println(u);
        }
    }

    private void cadastrarReserva() {
        System.out.print("ID Reserva: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("ID Usuario: ");
        int idUsuario = sc.nextInt();
        sc.nextLine();
        Usuario u = usuarioCtrl.buscar(idUsuario);

        if (u == null) {
            System.out.println("Usuario nao encontrado!");
            return;
        }

        System.out.print("Endereco Imovel: ");
        String end = sc.nextLine();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        Dono d = new Dono(99, "DonoPadrao", "dono@email", "0000", "123");
        Imovel imovel = new Imovel(100, end, preco, d);

        System.out.print("Data Reserva: ");
        String data = sc.nextLine();

        Reserva r = new Reserva(id, u, imovel, data);
        reservaCtrl.cadastrar(r);
        System.out.println("Reserva feita!");
    }

    private void listarReservas() {
        for (Reserva r : reservaCtrl.listar()) {
            System.out.println(r);
        }
    }

    private void cadastrarPagamento() {
        System.out.print("ID Pagamento: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("ID Reserva: ");
        int idReserva = sc.nextInt();
        sc.nextLine();

        Reserva r = reservaCtrl.buscar(idReserva);
        if (r == null) {
            System.out.println("Reserva nao encontrada!");
            return;
        }

        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        Pagamento p = new Pagamento(id, r, valor);
        pagamentoCtrl.cadastrar(p);
        System.out.println("Pagamento registrado!");
    }

    private void listarPagamentos() {
        for (Pagamento p : pagamentoCtrl.listar()) {
            System.out.println(p);
        }
    }
}