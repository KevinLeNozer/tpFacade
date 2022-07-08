package org.example.entites;


public class Amplificateurs {

    Tuner tuner;
    LecteurDvd lecteurDvd;
    LecteurCd lecteurCd;

    private String cd;
    private String dvd;
    private Boolean sonStereo;
    private Boolean sonSurround;
    private int volume;

    public void marche() {
        System.out.println("L'amplificateur est en marche");
    }

    public void arret() {
        System.out.println("L'amplificateur est arreté");
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public LecteurDvd getLecteurDvd() {
        return lecteurDvd;
    }

    public void setLecteurDvd(LecteurDvd lecteurDvd) {
        this.lecteurDvd = lecteurDvd;
    }

    public LecteurCd getLecteurCd() {
        return lecteurCd;
    }

    public void setLecteurCd(LecteurCd lecteurCd) {
        this.lecteurCd = lecteurCd;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public Boolean getSonStereo() {
        return sonStereo;
    }

    public void setSonStereo(Boolean sonStereo) {
        this.sonStereo = sonStereo;
    }

    public Boolean getSonSurround() {
        return sonSurround;
    }

    public void setSonSurround(Boolean sonSurround) {
        this.sonSurround = sonSurround;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
