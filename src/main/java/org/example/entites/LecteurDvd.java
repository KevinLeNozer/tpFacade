package org.example.entites;

public class LecteurDvd {
    Amplificateurs amplificateurs;

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
        System.out.println("Le lecteurDvd est arreté");
    }

    public void ejecter () {
        System.out.println("Le Dvd est ejecté");
    }

    public void pause () {
        System.out.println("Le Dvd est en pause");
    }

    public void jouer (){
        System.out.println("Le Dvd est jouer");
    }

    public void stop () {
        System.out.println("Le Dvd est arreté");
    }
}
