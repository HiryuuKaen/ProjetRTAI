/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetechec;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author jholmieres
 */
public class Case  extends MouseAdapter{
    
    private int i;
    private int j;
    private PlateauFrame plateau;

    public Case(int i, int j, PlateauFrame unPlateau){
        this.i = i;
        this.j = j;
        this.plateau = unPlateau;
    }
    
    public void mouseClicked(MouseEvent e){
        if(plateau.getControler().getJoueurEnCours() == 0){
            if(plateau.getControler().getJoueur0().aPiece(i, j)){
                System.out.println(i + " " + j);
                plateau.getControler().getJoueur0().jouer(i, j, 5, 5);
                plateau.updateAffichageAll();
            }
        }
    }
}
