
import java.io.*;
import java.util.*;

/**
 * - supervisarPaciente: pide el DNI del paciente y mediante un boolean verficamos si necesita tratamiento
 * - atenderCita: pide el ID de la cita y la registra
 * - realizarTratamiento:  recibe el ID del tratamiento y lo realiza 
 * - hacerHospitalizaciones: solicita el ID de Hospitalización y lo registra
 * - recetarMedicamento: solicita el ID de Medicamento y lo registra
 * - comprobarSeguro: solicita el ID de Paciente y comprueba si está asegurado
 */
public class Doctor {

    /**
     * Default constructor
     */
    public Doctor() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String especialidad;

    /**
     * 
     */
    private int telefono;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String dni;

    /**
     * @param DNI 
     * @return
     */
    private boolean supervisarPaciente(String DNI) {
        // TODO implement here
        return false;
    }

    /**
     * @param ID
     */
    private void atenderCita(int ID) {
        // TODO implement here
    }

    /**
     * @param ID
     */
    private void realizarTratamiento(int ID) {
        // TODO implement here
    }

    /**
     * @param ID
     */
    private void hacerHospitalizaciones(int ID) {
        // TODO implement here
    }

    /**
     * @param ID
     */
    private void recetarMedicamento(int ID) {
        // TODO implement here
    }

    /**
     * @param id 
     * @return
     */
    public boolean comprobarSeguro(Paciente id) {
        // TODO implement here
        return false;
    }

}