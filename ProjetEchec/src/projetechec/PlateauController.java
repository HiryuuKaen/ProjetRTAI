/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetechec;

/**
 *
 * @author jholmieres
 */
public class PlateauController {
    private Joueur[] joueur;
    private int joueurEnCours;
    
    public PlateauController(){
        joueur = new Joueur[2];
    }
    
    public void initController() {
        joueur[0] = new Joueur(1);
        joueur[1] = new Joueur(2);
        setJoueurEnCours(0);
    }

    /**
     * @return the joueurEnCours
     */
    public int getJoueurEnCours() {
        return joueurEnCours;
    }

    /**
     * @param joueurEnCours the joueurEnCours to set
     */
    public void setJoueurEnCours(int joueurEnCours) {
        this.joueurEnCours = joueurEnCours;
    }
    
    public Joueur getJoueur0() {
        return joueur[0];
    }
    public Joueur getJoueur1() {
        return joueur[1];
    }
    
}
