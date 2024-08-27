import Celulares.IPhone;
import Interfaces.AparelhoTelefonico;
import Interfaces.ReprodutorMusical;
import Interfaces.NavegadorWeb;

public class Main {
    public static void main(String[] args) {

        IPhone meuIPhone = new IPhone();

        meuIPhone.exibirPagina("web.dio.com");
        meuIPhone.selecionarMusica("Like a Stone");
        meuIPhone.ligar("81993060464");
        meuIPhone.pausar();
        meuIPhone.atualizarPagina();
        meuIPhone.atenderChamada();
    }
}