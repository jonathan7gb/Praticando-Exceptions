package org.praticandoexceptions.view.headersView;

public class EditarVeiculoHeader {

    public void editarVeiculoHeader(String placaCodigo){
        System.out.printf("\n|| ======= EDITAR VEÍCULO [%s] ======= ||\n", placaCodigo.toUpperCase());
    }

    public void editarCodigoHeader(){
        System.out.println("\n|| ========= EDITAR CÓDIGO ========= ||");
    }

    public void editarModeloHeader(){
        System.out.println("\n|| ========= EDITAR MODELO ========= ||");
    }

    public void editarMarcaHeader(){
        System.out.println("\n|| ========= EDITAR MARCA ========= ||");
    }

    public void editarAnoHeader(){
        System.out.println("\n|| ========== EDITAR ANO ========== ||");
    }

    public void editarPlacaHeader(){
        System.out.println("\n|| ========= EDITAR PLACA ========= ||");
    }

    public void editarTipoHeader(){
        System.out.println("\n|| ========== EDITAR TIPO ========== ||");
    }
}
