/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioalimentacao;

import br.teste.frame.Principal.MenuView;

/**
 *
 * @author nil_b
 */
public class ComercioAlimentacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, String[] ip) {
         java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
           
              new MenuView().setVisible(true);
            }
        });
    }
}

