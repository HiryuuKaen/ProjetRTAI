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
public class Cavalier extends Piece {
    
    public Cavalier(int positionX, int positionY, int joueur) {
        super(positionX, positionY);
        
        if(joueur == 1) 
            setIcone(new ImageIcon("./src/icons/cavalierN.png"));
        else
            setIcone(new ImageIcon("./src/icons/cavalierB.png"));
    }
    
}
