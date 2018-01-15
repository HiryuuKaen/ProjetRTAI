/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetechec;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jholmieres
 */
public class PlateauFrame extends JFrame{
    // Les trois images pour decorer les cases du jeu
    private static final ImageIcon BLANC = new ImageIcon("./src/icons/case_blanche.png");
    private static final ImageIcon NOIR = new ImageIcon("./src/icons/case_noire.png");
    private static final int taille = 8;
    
    private JLabel[][] jboard;
    private JPanel panelJeu;
    
    public PlateauFrame(){
        panelJeu = new JPanel();
        jboard = new JLabel[taille][taille];
        
        initBoardPanel();
    }
    
    
    
    
    
    public void initBoardPanel(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelJeu.setLayout(new java.awt.GridLayout(8, 8));
        setSize(375,390);
        
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelJeu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelJeu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        
        boolean couleur = true;
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                if(couleur){
                    jboard[i][j] = new JLabel();
                    jboard[i][j].setIcon(BLANC);
                }else{
                    jboard[i][j] = new JLabel();
                    jboard[i][j].setIcon(NOIR);
                }
                panelJeu.add(jboard[i][j]);
                couleur = !couleur;
            }
            couleur = !couleur;
        }
    }
}
