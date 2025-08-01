
public class Main {
    public static void main(String[] args) {

        Profesor creaProfesor = new Profesor("Nelson","Uribe",23,"Matematicas", 1.50F,"Esteban");
        System.out.println("se creo el profesor");

        Alumno creaAlumno = new Alumno("Esteban","Ceballos",16,"Emocional",180,"Nelson");
        Materia creaMateria = new Materia("Español","q","Chucho", new double[]{4.1});
    }

}
