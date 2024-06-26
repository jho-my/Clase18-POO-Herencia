package org.jhonatan.herencia;

/**
 *
 * @author Jhonatan
 */
public class AlumnoInternacional extends Alumno {//hereda de alumno

    private String pais;
    private double notaIdiamas;

    //constructor
    public AlumnoInternacional() {

    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);//constrcutor del padre en este caso alumno
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);//constrcutor del padre en este caso alumno
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiamas() {
        return notaIdiamas;
    }

    public void setNotaIdiamas(double notaIdiamas) {
        this.notaIdiamas = notaIdiamas;
    }

}
