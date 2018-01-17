
package piece;

import javax.swing.ImageIcon;

/**
 *
 * @author jholmieres
 */
public class Fou extends Piece {
    
    public Fou(int positionX, int positionY, int joueur) {
        super(positionX, positionY);
        
        if(joueur == 1) 
            setIcone(new ImageIcon("./src/icons/fouN.png"));
        else
            setIcone(new ImageIcon("./src/icons/fouB.png"));
    }
    
}
