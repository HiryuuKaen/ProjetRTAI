/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetechec;

import java.util.ArrayList;
import piece.*;

/**
 *
 * @author jholmieres
 */
class Joueur {
    
    private ArrayList<Piece> listePieces;
    
    public Joueur(int joueur){
        listePieces = new ArrayList<>();
        initJ(joueur);
    }
    
    public void initJ(int joueur){
        
        int x;
        int y;
        
        if(joueur == 1){
            x = 0;
            y = 1;
        } else {
            x = 7;
            y = 6;
        }
        
        getListePieces().add(new Tour(x,0));
        getListePieces().add(new Cavalier(x, 1));
        getListePieces().add(new Fou(x, 2));
        getListePieces().add(new Roi(x, 3));
        getListePieces().add(new Reine(x, 4));
        getListePieces().add(new Fou(x, 5));
        getListePieces().add(new Cavalier(x, 6));
        getListePieces().add(new Tour(x,7));
        
        for(int i = 0; i < 8 ; i++){
            getListePieces().add(new Pion(y,i));
        }
        
    }

    /**
     * @return the listePieces
     */
    public ArrayList<Piece> getListePieces() {
        return listePieces;
    }
    
}
