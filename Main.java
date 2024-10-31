//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int temperatura = 39;
        int edad = 12;
        int peso = 40;
        if (temperatura < 38) {
            System.out.println("El niño esta bien");
        } else if (temperatura < 39) {
            System.out.println("Sar un baño frio");
        } else if (temperatura >= 40) {
            System.out.println("Ir al hospital");
        } else if (edad < 3) {
            System.out.println("ir al medico");
        } else if (edad < 12) {
            int paracetamol = 15 * peso;
            System.out.println("Dar " + paracetamol + "mg de paracetamol cada 8h");
        } else if (edad >= 12) {
            int paracetamol = 500;
            System.out.println("Dar " + paracetamol + "mg de paracetamol cada 8h");

        }
    }
}