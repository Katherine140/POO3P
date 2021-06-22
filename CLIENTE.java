/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author jenni
 */
public class CLIENTE {
    String ID,NOMBRE,APELLIDO,EDAD, NUMERO;

    public CLIENTE(String ID, String NOMBRE, String APELLIDO, String EDAD, String NUMERO) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.EDAD = EDAD;
        this.NUMERO = NUMERO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    public String getEDAD() {
        return EDAD;
    }

    public void setEDAD(String EDAD) {
        this.EDAD = EDAD;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

}