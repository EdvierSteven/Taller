public class Estudiante {
    String Nombre;
    int Edad;
    String Curso;

    public Estudiante(){
        Nombre = "Desconocido";
        Edad = 0;
        Curso = "Sin asignar";
    }
      // Constructor con nombre y edad
      public Estudiante(String nombre, int edad) {
        this.Nombre = nombre;
        this.Edad = edad;
    }
     
     public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); 
        this.Curso = curso;
}
 
public String toString() {
    return "Estudiante: " + Nombre + ", " + Edad + " años, Curso: " + Curso;
}
}

