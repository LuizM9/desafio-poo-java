
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione uma música: ");
    }

    @Override
    public void ligar(String number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void atender(String number) {
        System.out.println("Recebendo chamada de " + number);
    }

    @Override
    public void iniciarCorreioVoz(String number, String message) {
        System.out.println("Iniciando correio de voz. ");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo site " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba aberta. ");
    }

    @Override
    public void atualizarPagina(String att) {
        System.out.println("Pagina atualizada. ");
    }
}
