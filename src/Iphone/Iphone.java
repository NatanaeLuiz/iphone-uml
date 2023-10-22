package Iphone;

import Apps.browser.AppInternet;
import Apps.music.AppMusic;
import Apps.phone.AppPhone;

public class Iphone implements AppMusic, AppInternet, AppPhone {
    @Override
    public void reproduce() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void pause() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionar musica");
    }

    public void page() {
        System.out.println("Abrindo pagina web");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova pagina");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void call() {
        System.out.println("Fazer ligação");
    }

    @Override
    public void attend() {
        System.out.println("Atender ligação");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciar correio de voz");
    }
}
