/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iom4tv;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Rafael Cardoso
 */
public class IOM4TV extends JFrame{

    
    private JButton connectButton,
            disconnectButton,
            rotateBtn,
            antirotateBtn,
            mudarCorBtn,
            andarNoCliqueBtn,
            connectIOM,
            disconnectIOM, 
            listPorts;
    
    
    public IOM4TV(){
    
        this.setLayout(new GridLayout(2, 1));

        // Botoes do GUI
        connectButton = new JButton("Buscar e conectar o Sphero");
        disconnectButton = new JButton("Desconecta do Spheros");
        antirotateBtn = new JButton("Girar Sphero sentido Anti-Horário");
        rotateBtn = new JButton("Girar Sphero sentido Horário");
        mudarCorBtn = new JButton("Mudar de cor!");
        andarNoCliqueBtn = new JButton("Rolar o Sphero");

        connectIOM = new JButton("Conectar IOM");
        disconnectIOM = new JButton("Desconectar IOM");
        listPorts = new JButton("Listar portas IOM");
    
        
                //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        // Adiciona botões na interface
        this.add(connectButton).setFocusable(false);
        this.add(disconnectButton).setFocusable(false);
        this.add(antirotateBtn).setFocusable(false);
        this.add(rotateBtn).setFocusable(false);
        this.add(mudarCorBtn).setFocusable(false);
        this.add(andarNoCliqueBtn).setFocusable(false);
        this.add(connectIOM).setFocusable(false);
        this.add(disconnectIOM).setFocusable(false);
        this.add(listPorts).setFocusable(false);

        this.pack();
        this.setVisible(true);
        this.setSize(2500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IOM4TV iom4tv = new IOM4TV();
    }
    
}
