/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;

public class CCuenta {
    String nombre;
    String cc;
    String pass; //contraseña del acceso web
    double saldo;
    double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cc=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        nombre=nom;
    }

    public String obtenerNombre()
    {
        return nombre;
    }

    public double estado()
    {
        return saldo;
    }

    public void ing(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void ret(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    public double porcentaje(double tantoPorCiento){
        double result = saldo*tantoPorCiento/100;
        return result;
        
    }
}
