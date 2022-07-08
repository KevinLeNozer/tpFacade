package org.example;

import org.example.facade.FacadeHomeCinema;

public class Main {
    public static void main(String[] args) {
        FacadeHomeCinema facadeHomeCinema = new FacadeHomeCinema();
        facadeHomeCinema.regarderFilm();
        facadeHomeCinema.arreterFilm();
        facadeHomeCinema.ecouterCd();
        facadeHomeCinema.arreterCd();
        facadeHomeCinema.ecouterRadio();
        facadeHomeCinema.arreterRadio();

    }
}