/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetechec;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jholmieres
 */
public class Plateau {
    // Les trois images pour decorer les cases du jeu
    private static final ImageIcon BLANC = new ImageIcon("./src/icons/case_blanche.png");
    private static final ImageIcon NOIR = new ImageIcon("./src/icons/case_noire.png");
    private static final int taille = 8;
    
    private JLabel[][] jboard;
    private JPanel panelJeu;
    
    public Plateau(){
        panelJeu = new JPanel();
        jboard = new JLabel[taille][taille];
        panelJeu.setLayout(new java.awt.GridLayout(10, 10));
        initBoardPanel();
    }
    
    public void initBoardPanel(){
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                System.out.println(BLANC.getImageLoadStatus());
                jboard[i][j].setIcon(BLANC);
            }
        }  
    }
}
