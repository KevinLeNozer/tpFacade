package org.example.entites;

public class LecteurCd {

    Amplificateurs amplificateurs;

    public LecteurCd() {
    }

    public LecteurCd(Amplificateurs amplificateurs) {
        this.amplificateurs = amplificateurs;
    }

    public void marche () {
        System.out.println("Le lecteurCd est en marche");
    }

    public void arret () {
        System.out.println("Le lecteurCd est arreté");
    }

    public void ejecter () {
        System.out.println("Le cd est ejecté");
    }

    public void pause () {
        System.out.println("Le cd est en pause");
    }

    public void jouer (){
        System.out.println("Le cd est jouer");
    }

    public void stop () {
        System.out.println("Le cd est arreté");
    }

}
