/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piece;

import javax.swing.ImageIcon;

/**
 *
 * @author jholmieres
 */
public abstract class Piece {
    private int positionX;
    private int positionY;
    private ImageIcon icone;
    
    public Piece(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /**
     * @return the positionX
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * @param positionX the positionX to set
     */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    /**
     * @return the positionY
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * @param positionY the positionY to set
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     * @return the icone
     */
    public ImageIcon getIcone() {
        return icone;
    }

    /**
     * @param icone the icone to set
     */
    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    }


}
