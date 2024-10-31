
public class Main {
    public static void main(String[] args) {
    int notaProva = 0;
    int numLLiurament = 0;
    int Totalliruament = 10;
    int notalliurament = 0;
    int notapracticas = 10;
    boolean seguida = true;

    double setciento = Totalliruament * 0.7;
    double nuevciento = Totalliruament * 0.9;
    double ochciento = Totalliruament * 0.8;

    if (notaProva < 7) {
        System.out.println("Suspendido");
        return;
    } else if (numLLiurament < setciento) {
        seguida = false;
        System.out.println("Suspendido");
    } else if (numLLiurament == Totalliruament) {
        notalliurament = 10;
    } else if (numLLiurament >= nuevciento) {
        notalliurament = 8;
    } else if (numLLiurament >= ochciento) {
        notalliurament = 6;
    }else if (numLLiurament >= setciento) {
        notalliurament = 4;
    }

    double notafinal = (notaProva * 0.2) + (notalliurament * 0.1) + (notapracticas * 0.7);

    if (notafinal < 5) {
        System.out.println("Suspendido");
    } else if (seguida == true) {
        System.out.println("seguir evalucacion continua");
    } else if (seguida == false) {
        System.out.println("Hacer los ejercicios perparatorios");
    }

    }
}
