/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetechec;

import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import piece.*;

/**
 *
 * @author jholmieres
 */
public class PlateauFrame extends JFrame{
    private static final int taille = 8;
    
    private JLabel[][] board;
    private JPanel panelJeu;
    
    private PlateauController controler;
    
    
    
    public PlateauFrame(){
        panelJeu = new JPanel();
        board = new JLabel[taille][taille];
        controler = new PlateauController();
        controler.initController();
        initBoardPanel();
    }
    
    
    public void initBoardPanel(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelJeu.setLayout(new java.awt.GridLayout(8, 8));
        setSize(375,400);
        
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
                    board[i][j] = new JLabel();
                    board[i][j].setBackground(new Color(237,220,171));
                }else{
                    board[i][j] = new JLabel();
                    board[i][j].setBackground(new Color(185,136,3));
                }
                board[i][j].setOpaque(true);
                panelJeu.add(board[i][j]);
                couleur = !couleur;
                board[i][j].addMouseListener(new Case(i,j,this));
            }
            couleur = !couleur;
        } 
        updateAffichageAll();
    }   

    /**
     * @return the controller
     */
    public PlateauController getControler() {
        return controler;
    }
    
    public void updateAffichageAll(){
        
        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                board[i][j].setIcon(null);
            }
        }
        for(Piece unePiece : getControler().getJoueur0().getListePieces()){
            board[unePiece.getPositionX()][unePiece.getPositionY()].setIcon(unePiece.getIcone());
        }
        for(Piece unePiece : getControler().getJoueur1().getListePieces()){
            board[unePiece.getPositionX()][unePiece.getPositionY()].setIcon(unePiece.getIcone());
        }
    }
    
    /*
    public void updateAffichage(int xE, int yE, int xS, int yS){
        board[xE][yE].setIcon(null);
        board[xS][yS].setIcon(null);
    }*/

  
}
