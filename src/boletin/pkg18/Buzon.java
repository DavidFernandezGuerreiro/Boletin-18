
package boletin.pkg18;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Buzon {

    public int numeroDeCorreos(ArrayList<Correo>lis){
        System.out.println("Mostra o número de correos.");
        System.out.println("Numero de correos: "+lis.size());
        return 0;
    }
    
    public void engade(ArrayList<Correo>lis){ //LO QUE TENGO ENTRE PARENTESIS ES LO QUE RECIVO.
        //Engade un correo.
        String recojer=JOptionPane.showInputDialog("Escribe correo: ");
        Correo obx=new Correo(recojer,false);
        lis.add(obx);
    }
    
    public boolean porLer(ArrayList<Correo>lis){
        System.out.println("\nMostra os correos que quedan por leer.");
        for(int i=0;i<lis.size();i++){
            if(lis.get(i).isLeido()==false){
                System.out.println(lis.get(i).getContidoCorreo()+" -> CORREO NO LEIDO");
            }
        }
        return false;
    }
    
    public String amosaPrimerNoLeido(ArrayList<Correo>lis){
        System.out.println("\nMostra o primer correo non leido.");
        for(int i=0;i<lis.size();i++){
            if(lis.get(i).isLeido()==false){
                System.out.println(lis.get(1));
                break;
            }
        }
        String h=null;
        return h;
    }
    
    public String amosa(int k,ArrayList<Correo>lis){
        System.out.println("\nMostra o correo, engadindo a posición, se foi leído ou non.");
        boolean mensaxe;
        mensaxe=lis.get(k-1).isLeido(); //Menos uno. Por la posición 0.
        System.out.println("O correo número "+k+" --> "+mensaxe);
        
        return null;
    }
    
    public void elimina(int k,ArrayList<Correo>lis){
        System.out.println("\nElimina o elemento que quera, engadindo a súa posición e logo mostra os que non forón borrados.");
        lis.remove(k-1); //Menos uno. Por la posición 0.
        Iterator it=lis.iterator();
        while(it.hasNext()) 
            System.out.println(it.next());
    }

}
