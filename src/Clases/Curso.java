package Clases;

public class Curso {
    private Docente docente;
    private String CourseID;
    private String CourseName;
    private String MasterDescription;
    private String ProgramName;
    private String lenguaje;
    private String campus;

    public Curso() {
    }

    public Curso(Docente docente, String CourseID, String CourseName, String MasterDescription, String ProgramName, String lenguaje, String campus) {
        this.docente = docente;
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.MasterDescription = MasterDescription;
        this.ProgramName = ProgramName;
        this.lenguaje = lenguaje;
        this.campus = campus;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getMasterDescription() {
        return MasterDescription;
    }

    public void setMasterDescription(String MasterDescription) {
        this.MasterDescription = MasterDescription;
    }

    public String getProgramName() {
        return ProgramName;
    }

    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    
    
}
