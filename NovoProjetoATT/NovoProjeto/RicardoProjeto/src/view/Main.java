package view;

import repository.*;
import service.*;
import controller.*;

public class Main {
    public static void main(String[] args) {
        // repos
        IUsuarioRepo usuarioRepo = new UsuarioRepo();
        IReservaRepo reservaRepo = new ReservaRepo();
        IPagamentoRepo pagamentoRepo = new PagamentoRepo();

        // servicos
        IUsuarioSrv usuarioSrv = new UsuarioSrv(usuarioRepo);
        IReservaSrv reservaSrv = new ReservaSrv(reservaRepo);
        IPagamentoSrv pagamentoSrv = new PagamentoSrv(pagamentoRepo);

        // controllers
        UsuarioCtrl usuarioCtrl = new UsuarioCtrl(usuarioSrv);
        ReservaCtrl reservaCtrl = new ReservaCtrl(reservaSrv);
        PagamentoCtrl pagamentoCtrl = new PagamentoCtrl(pagamentoSrv);

        // menu
        Menu menu = new Menu(usuarioCtrl, reservaCtrl, pagamentoCtrl);
        menu.exibir();
    }
}