package com.example.digimon;

public class PDigimon {
    int imgDigiEscolhido;
    String digiEscolhido;
    String digimon;

    public PDigimon(int imgDigiEscolhido, String digiEscolhido, String digimon) {
        this.imgDigiEscolhido = imgDigiEscolhido;
        this.digiEscolhido = digiEscolhido;
        this.digimon = digimon;
    }

    public int getImgDigiEscolhido() { return imgDigiEscolhido; }

    public void setImgDigiEscolhido(int imgDigiEscolhido) { this.imgDigiEscolhido = imgDigiEscolhido; }

    public String getDigiEscolhido() { return digiEscolhido; }

    public void setDigiEscolhido(String digiEscolhido) { this.digiEscolhido = digiEscolhido; }

    public String getDigimon() { return digimon; }

    public void setDigimon(String digimon) { this.digimon = digimon; }

    @Override
    public String toString() { return this.imgDigiEscolhido + " \n " + this.digiEscolhido + "\n " + this.digimon; }
}
