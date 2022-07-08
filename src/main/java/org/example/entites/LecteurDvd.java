package org.example.entites;

public class LecteurDvd {
    Amplificateurs amplificateurs;

    public LecteurDvd() {
    }

    public LecteurDvd(Amplificateurs amplificateurs, Boolean audioSurround, Boolean audioStereo) {
        this.amplificateurs = amplificateurs;
        this.audioSurround = audioSurround;
        this.audioStereo = audioStereo;
    }

    private Boolean audioSurround;
    private Boolean audioStereo;

    public Boolean getAudioSurround() {
        return audioSurround;
    }

    public void setAudioSurround(Boolean audioSurround) {
        this.audioSurround = audioSurround;
    }

    public Boolean getAudioStereo() {
        return audioStereo;
    }

    public void setAudioStereo(Boolean audioStereo) {
        this.audioStereo = audioStereo;
    }

    public void marche () {
        System.out.println("Le lecteurDvd est en marche");
    }

    public void arret () {
        System.out.println("Le lecteurDvd est éteint");
    }

    public void ejecter () {
        System.out.println("Le Dvd est ejecté");
    }

    public void pause () {
        System.out.println("Le Dvd est en pause");
    }

    public void jouer (String film){
        System.out.println("Le film est => " + film);
    }

    public void stop () {
        System.out.println("Le Dvd est arreté");
    }
}
