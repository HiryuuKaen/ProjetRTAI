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
        
        getListePieces().add(new Tour(x,0,joueur));
        getListePieces().add(new Cavalier(x, 1,joueur));
        getListePieces().add(new Fou(x, 2,joueur));
        getListePieces().add(new Roi(x, 3,joueur));
        getListePieces().add(new Reine(x, 4,joueur));
        getListePieces().add(new Fou(x, 5,joueur));
        getListePieces().add(new Cavalier(x, 6,joueur));
        getListePieces().add(new Tour(x,7,joueur));
        
        for(int i = 0; i < 8 ; i++){
            getListePieces().add(new Pion(y,i,joueur));
        }
        
    }

    /**
     * @return the listePieces
     */
    public ArrayList<Piece> getListePieces() {
        return listePieces;
    }
    
    public boolean aPiece(int x, int y){
        for(Piece unePiece : listePieces){
            if((unePiece.getPositionX() == x) && (unePiece.getPositionY() ==y))
                return true;
        }
        return false;
    }
    
    public void jouer(int xE, int yE, int xS, int yS){
        for(Piece unePiece : listePieces){
            if((unePiece.getPositionX() == xE) && (unePiece.getPositionY() ==yE)){
                unePiece.setPositionX(xS);
                unePiece.setPositionY(yS);
                
            }
        }
        
    }
    
}
