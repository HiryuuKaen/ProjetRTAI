/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piece;

/**
 *
 * @author jholmieres
 */
public abstract class Piece {
    private int positionX;
    private int positionY;
    
    public Piece(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
