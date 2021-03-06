/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaPrioridad;

/**
 *
 *  E-Mail : shamirdhc31@gmail.com
 *  Blog   : http://javadhc.blogspot.com
 *
 */
 
import javax.swing.JOptionPane;
 
public class ColaArray 
{
    private int MAX;
    private int[] COLA;
    private int FRENTE;
    private int FINAL;
 
    public ColaArray()
    {
        this.MAX = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new int[this.MAX+1];
    }
 
    public ColaArray(int MAX)
    {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FINAL = 0;  
        this.COLA = new int[this.MAX+1];
    }  
     
    public boolean IsColaLlena()
    {
        if(this.FINAL == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 
    public boolean IsColaVacia()
    {
        if(this.FRENTE == this.FINAL)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public void InsertarCola()
    {
        if(this.IsColaLlena())
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTÁ LLENA");
        }
        else
        {
            int ITEM;
 
            ITEM = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL ITEM A AGREGAR"));  
             
            this.FINAL++; 
            this.COLA[FINAL] = ITEM;
                        
        }
    }
 
    public void EliminarCola()
    {
        if(this.FRENTE == this.FINAL)
        {
            JOptionPane.showMessageDialog(null,"LA COLA ESTA VACIA");
        }
        else
        {     
            int var = COLA[FRENTE + 1];
            for(int i=FRENTE;i < FINAL ;i++)
            {
                COLA[i] = COLA[i+1];
            }
             
            FINAL--;
            JOptionPane.showMessageDialog(null,"ELEMENTO ELIMINADO: " + var);
        }
    }
 
    public String MostrarCola()
    {
        if(this.IsColaVacia())
        {
            //JOptionPane.showMessageDialog(null,"LA COLA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR","MOSTRAR DATOS",JOptionPane.WARNING_MESSAGE);
            return "vacia";
        }
        else
        {
            String MOSTRAR = "";
             
            for(int i=FRENTE+1;i<=FINAL;i++)
            {
                MOSTRAR = MOSTRAR + COLA[i]+"\n";
            }
             
            //JOptionPane.showMessageDialog(null,"TOTAL ES : "+this.FINAL+"\n"+"LOS DATOS DE LA COLA SON : \n"+MOSTRAR,"MOSTRAR DATOS",JOptionPane.INFORMATION_MESSAGE);
            return MOSTRAR;
        }
    }
 
    public void VaciarCola()
    {
        FRENTE = 0;
        FINAL = 0;
    }       
}