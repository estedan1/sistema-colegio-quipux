public class Materia {
    private String nombreDeMateria;
    private String codigo;
    private String profesorEncargado;
    private double[] notas;


    public Materia(String nombreDeMateria, String codigo, String profesorEncargado, double [] notas) {
        System.out.println("Se creo una nueva materia" + " " + nombreDeMateria + " " + codigo + " " + profesorEncargado);
        this.nombreDeMateria = nombreDeMateria;
        this.codigo = codigo;
        this.profesorEncargado = profesorEncargado;
        this.notas = notas;
    }
    public Materia() {
        this("Sin nombre","a", "No definido",new double[]{0.1} );
        this.nombreDeMateria = nombreDeMateria;
        this.codigo = codigo;
        this.profesorEncargado = profesorEncargado;
    }

    public Materia(String nombreDeMateria) {
        this(nombreDeMateria,"a", "Juan",new double[]{0.1} );
    }

    public Materia (String nombreDeMateria,String codigo) {
        this(nombreDeMateria, codigo, "No definido", new double[]{0.1});
    }

    public Materia (String nombreDeMateria,String codigo, String profesorEncargado) {
        this(nombreDeMateria, codigo, profesorEncargado, new double[]{0.1});
    }

    public double[] getNotas(){
    return this.notas;
}
    public double[] setNota(double[] notas) {
    return notas;
    }
}

