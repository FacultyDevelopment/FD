package Clases;

import java.io.File;
import java.util.ArrayList;

public class Docente {
    private String FirstName;
    private String LastName;
    private String NombreCompleto;
    private String CorreoPrincipal;
    private ArrayList <String> CorreosSecundarios = new ArrayList<>();
    private String Pais;
    private String LaureateID;
    private String Campus;
    private String EmployeeID;
    private String PhoneNumber;
    private String University;
    private String EnrollmentID;
    private ArrayList <String> cursos = new ArrayList<>(); //Cambiar el tipo por Curso
    private ArrayList <String> lenguajes = new ArrayList<>();
    private File cv;
    
    public Docente() {
    }

    public Docente(String FirstName, String LastName, String CorreoPrincipal, String Pais, String LaureateID, String Campus, String EmployeeID, String PhoneNumber, String University, String EnrollmentID) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CorreoPrincipal = CorreoPrincipal;
        this.Pais = Pais;
        this.LaureateID = LaureateID;
        this.Campus = Campus;
        this.EmployeeID = EmployeeID;
        this.PhoneNumber = PhoneNumber;
        this.University = University;
        this.EnrollmentID = EnrollmentID;
        this.NombreCompleto = FirstName + " " + LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCorreoPrincipal() {
        return CorreoPrincipal;
    }

    public void setCorreoPrincipal(String CorreoPrincipal) {
        this.CorreoPrincipal = CorreoPrincipal;
    }

    public ArrayList<String> getCorreosSecundarios() {
        return CorreosSecundarios;
    }

    public void setCorreosSecundarios(ArrayList<String> CorreosSecundarios) {
        this.CorreosSecundarios = CorreosSecundarios;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getLaureateID() {
        return LaureateID;
    }

    public void setLaureateID(String LaureateID) {
        this.LaureateID = LaureateID;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public String getEnrollmentID() {
        return EnrollmentID;
    }

    public void setEnrollmentID(String EnrollmentID) {
        this.EnrollmentID = EnrollmentID;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }
    
    
}
