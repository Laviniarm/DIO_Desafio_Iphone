package aparelho;

import papeis.AparelhoTelefonico;
import papeis.NavegadorInternet;
import papeis.RepodutorMusicial;

public class Iphone implements RepodutorMusicial, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando via Repodutor Musicial");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando via Repodutor Musicial");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica via Repodutor Musicial");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando via Aparelho Telefonico");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo via Aparelho Telefonico");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz via Aparelho Telefonico");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina via Navegador de Internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via Navegador de Internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina via Navegador de Internet");
    }
}
