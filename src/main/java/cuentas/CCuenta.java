/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *Esta clase permite construir objetos que simulan una cuenta bancaria, con un nombre, un número de cuenta, un saldo y un tipo de interés asociados
 * La clase permite efectuar ingresos y retiradas de dinero y con ello modificar el saldo existente.
 * 
 * @author Eloy_
 */
public class CCuenta {
    
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Este método devuelve el nombre del propietario del objeto de la clase CCuenta
     * 
     * @return devuelve un String del nombre del propietario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método permite establecer el nombre del propietario de la cuenta
     * 
     * @param nombre introducir por teclado el nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este metodo devuelve el número de cuenta del objeto CCuenta
     * 
     * @return devuelve un String del número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Este método permite introducir o establecer un número de cuenta 
     * 
     * @param cuenta introducir por teclado el número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Este método devuelve el saldo existente en la cuenta en ese momento
     * 
     * @return devuelve un número de tipo double equivalente al saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Este método permite establecer el saldo de la cuenta
     * 
     * @param saldo introducir por teclado el valor del saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método devuelve el tipo de interés vigente en ese momento para la cuenta asociada
     * 
     * @return the tipoInterés devuelve un número de tipo double con el valor del tipo de intetés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Este método permite establecer un tipo de interés asociado a una cuenta
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Este método es el constructor por defecto de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Este método es un constructor de la clase CCuenta
     * @param nom String con el nombre del propieatario de la cuenta
     * @param cue String con el número de cuenta
     * @param sal double con el saldo actual de la cuenta
     * @param tipo double del tipo de interés asociado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Este método devuelve el saldo actual de la cuenta
     * @return double con el valor del saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Este método permite realizar un ingreso en la cuenta y aumentar su saldo en dicha cantidad
     * @param cantidad double con el valor del ingreso
     * @throws Exception el método lanza una excepción si se ingresa una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Este método permite realizar un retiro de dinero y con ello disminuye el saldo en la cantidad retirada
     * @param cantidad double con el valor de la retirada
     * @throws Exception el método puede lanzar una excepción si la cantidad introducida es negativa y si la cantidad es mayor al saldo actual en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
}
