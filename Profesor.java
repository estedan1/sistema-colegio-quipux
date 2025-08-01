public class Profesor extends Persona{
    public String nombre;
    public String apellido;
    public int edad;
    public String materia;
    public Float jornada;
    public String estudianteEncargado;


    public Profesor(String nombre, String apellido, int edad, String materia, float jornada, String estudianteEncargado) {
        System.out.println("Se creo un nuevo profesor " + nombre + " " + apellido + ' ' + "edad" + ' ' + edad + " " + materia + " " + ' ' + "jornada" + ' ' + jornada + " " + "Estudiante encargado" + " " + estudianteEncargado);
        super(nombre,apellido,edad);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materia = materia;
        this.jornada = jornada;
        this.estudianteEncargado = estudianteEncargado;

    }

    public void enseñar(boolean enseñar) {
        if (enseñar == false) {
            System.out.println("No esta en clase enseñando");
        } else {
            System.out.println("Si esta en clase enseñando");
        }
    }

    public double[] getnota(){
        Materia materia = new Materia("nombrnombreDeMateria", "codigo", "profesorEncargado", new double[]{0.0});
        double[] nota = materia.getNotas();
        return nota;
    }
    public void evaluar(float nota) {
        if (nota <= 1) {
            System.out.println("perdio el año, es mas va perdiendo hasta el alma");
        } else if (nota > 1 && nota <= 2) {
            System.out.println("esta perdiendo, le toca recuperar");
        } else if (nota > 2 && nota <= 3) {
            System.out.println("estas bien pero no lo suficiente");
        } else if (nota == 5) {
            System.out.println("Excelente");
        } else {
            System.out.println("todavia no tiene la nota");
        }
        }

        }
