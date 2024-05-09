package com.santander_dio.poo;

public class Iphone implements AparelhosTelefonicos, NavegadorNaInternet, ReprodutorMusical{

    private String number;
    private String musicURL;

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz(String numero) {
        System.out.println("Iniciando correio de voz para " + numero);
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musicURL) {
        this.musicURL = musicURL;
        System.out.println("Selecionando música " + musicURL);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    
}
