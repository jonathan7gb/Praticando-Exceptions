package org.praticandoexceptions.view.menusView;

import org.praticandoexceptions.model.enums.MarcaVeiculo;
import org.praticandoexceptions.view.InputUsuario;
import org.praticandoexceptions.view.cadastroView.InserirCodigo;
import org.praticandoexceptions.view.cadastroView.InserirMarca;
import org.praticandoexceptions.view.cadastroView.InserirModelo;
import org.praticandoexceptions.view.cadastroView.InserirPlaca;
import org.praticandoexceptions.view.headersView.ListarVeiculosHeader;

public class MenuListar {

    ListarVeiculosHeader listarVeiculosHeader = new ListarVeiculosHeader();
    InputUsuario inputUsuario = new InputUsuario();
    InserirMarca inserirMarca = new InserirMarca();
    InserirModelo inserirModelo = new InserirModelo();
    InserirCodigo inserirCodigo = new InserirCodigo();
    InserirPlaca inserirPlaca = new InserirPlaca();

    public int menuListar(){
        listarVeiculosHeader.listarVeiculosHeader();
        System.out.println("|| 1 - Listar Todos");
        System.out.println("|| 2 - Listar por Tipo");
        System.out.println("|| 3 - Listar por Marca");
        System.out.println("|| 4 - Buscar pelo Modelo ");
        System.out.println("|| 5 - Buscar pela Placa");
        System.out.println("|| 6 - Buscar pelo Código");
        System.out.println("|| 0 - Voltar ao Menu Principal");
        System.out.println("|| =================================== ||");

        int opcao = inputUsuario.inputUsuario();
        return opcao;
    }

    public int menuListarPorTipo(){
        listarVeiculosHeader.listarVeiculosTipoHeader();
        System.out.println("|| 1 - Carros");
        System.out.println("|| 2 - Motos");
        System.out.println("|| 3 - Caminhões");
        System.out.println("|| 4 - Vans");
        System.out.println("|| 0 - Voltar ao menu de Listagem");

        int opcao = inputUsuario.inputUsuario();
        return opcao;
    }

    public MarcaVeiculo menuListarPorMarca(){
        listarVeiculosHeader.listarVeiculosMarcaHeader();
        MarcaVeiculo marca = inserirMarca.inserirMarca();
        return marca;
    }

    public String menuBuscarPeloModelo(){
        String modelo = "";

        listarVeiculosHeader.buscarVeiculosModeloHeader();
        modelo = inserirModelo.inserirModelo();

        return modelo;
    }

    public String menuBuscarPeloCodigo(){
        String codigo = "";

        listarVeiculosHeader.buscarVeiculosCodigoHeader();
        codigo = inserirCodigo.inserirCodigo();

        return codigo;
    }

    public String menuBuscarPelaPlaca(){
        String placa = "";

        listarVeiculosHeader.buscarVeiculosPlacaHeader();
        placa = inserirPlaca.inserirPlaca();

        return placa;
    }
}
