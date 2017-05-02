/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;

public class Main {
    public static void main(String[] args) {
        CCuenta a;
        double saldoA;

        a = new CCuenta("Felipe Segundo","2222-2222-22-1230456789", 2222,0);
        saldoA = a.estado();
        System.out.println("El saldo actual es"+ saldoA );

        try {
            a.ret(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            a.ing(600);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        System.out.println("Datos de la cuenta: "+ a.nombre + a.cc + a.saldo + a.tipoInteres);
    }
}
