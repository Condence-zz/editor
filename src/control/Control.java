/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;  
import javax.swing.JFrame; 
public class Control {
    private String nomArchivo;
    private String texto;
 
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public boolean nuevoArchivo(JFrame frame){ 
        return true;
    }
    public void abrirArchivo(JFrame frame){
        
    }
    public void guardarArchivo(JFrame frame){
        
    }
    public void guardarArchivoComo(JFrame frame){
        
    }
    public boolean eliminarArchivo(JFrame frame){
        
        return true;
    }
    public int reemplazar(JFrame frame){
        
        return 0;
    }
    public void contar(JFrame frame){
        
    }
}
