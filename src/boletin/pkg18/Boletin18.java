
package boletin.pkg18;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Correo>listaCorreo=new ArrayList<Correo>();
        
        listaCorreo.add(new Correo ("aa",true)); //0
        listaCorreo.add(new Correo ("bb",false)); //1
        listaCorreo.add(new Correo ("cc",true)); //2
        listaCorreo.add(new Correo ("dd",false)); //3
        
        Buzon obxB=new Buzon();
        obxB.numeroDeCorreos(listaCorreo);
        obxB.engade(listaCorreo);
        obxB.porLer(listaCorreo);
        obxB.amosaPrimerNoLeido(listaCorreo);
        obxB.amosa(2, listaCorreo);
        obxB.elimina(1, listaCorreo);
        
    }
    
}
