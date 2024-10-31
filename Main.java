
public class Main {
    public static void main(String[] args) {
        int edad = 4;
        int ciclo = 0;
        int curso = 0;

        if (edad <3) {
            System.out.println("Es muy pequeño!!!");
        } else if (edad >= 3 && edad < 6) {
            ciclo = 0;
        } else if (edad == 6) {
            curso = 1;
            ciclo = 1;
        } else if (edad == 7) {
            curso = 2;
            ciclo = 1;
        } else if (edad == 8) {
            curso = 3;
            ciclo = 2;
        } else if (edad == 9) {
            curso = 4;
            ciclo = 2;
        } else if (edad == 10) {
            curso = 5;
            ciclo = 3;
        } else if (edad == 11) {
            curso = 6;
            ciclo = 3;
        } else {
            System.out.println("Es muy grande!!");
        }

        if (ciclo == 0) {
            System.out.println("Es de Educacion infantil");
        } else if (ciclo == 1) {
            System.out.println("Es de Educacion primaria ciclo inicial, el curso es: "+ curso);
        } else if (ciclo == 2) {
            System.out.println("Es de Educacion primaria ciclo medio, el curso es: "+ curso);
        } else if (ciclo == 3) {
            System.out.println("Es de Educacion primaria ciclo superior, el curso es : "+ curso);
        }



    }
}
