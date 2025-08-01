import java.util.Scanner;
public class Alumno extends Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private String tipoDeInteligencia;
    private int iq;
    private String profesorEncargado;

    public Alumno(String nombre, String apellido, int edad, String tipoDeInteligencia, int iq, String profesorEncargado) {
        System.out.println("Se creo un nuevo Alumno " + nombre + " " + apellido + " " + edad + " " + tipoDeInteligencia + " " +  iq + " " + profesorEncargado);
        super(nombre,apellido,edad);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipoDeInteligencia = tipoDeInteligencia;
        this.iq = iq;
        this.profesorEncargado = profesorEncargado;
    }


    public void hacerTarea() {
    }
        Scanner scanner = new Scanner(System.in);
        Materia materia = new Materia("nombrnombreDeMateria", "codigo", "profesorEncargado", new double[]{0.0});

    {
        System.out.println("Hacer la tarea? (true o false): ");
        boolean hacerLaTarea = scanner.nextBoolean();

        if (hacerLaTarea) {
            System.out.println("hizo la tarea, se le sube la nota ");


        }else{
            System.out.println("imposible que no tengas tareas, ya las hiciste?");
            System.out.println("no hizo la tarea, muy mal ");
            }

    }
public void estudiar(){
        System.out.println("estudiaste, ahora tienes mas iq");
}
    }




