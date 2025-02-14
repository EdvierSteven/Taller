public class Libro {
    String Titulo;
    String autor;
    int numeroPaginas;

    public  Libro(){
        Titulo = "Desconocido";
        autor = "Sin autor";
        numeroPaginas=0;
       
     }
    public Libro(String titulo,String autor,int numeroPaginas){
        this.Titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }
    public void MostrarDetalles(){
        System.out.println("titulo"+ Titulo);
        System.out.println("autor"+ autor);
        System.out.println("numeroPaginas"+ numeroPaginas);
    }
    public static void main(String[] args) {
        Libro libro1= new Libro();
        libro1.MostrarDetalles();
    }
    
    public String toString() {
        return "libro: " + Titulo + " por " + autor + " , " + numeroPaginas + " páginas ";


    }

    }
