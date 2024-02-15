import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculatedMedia(List<Integer> notes){
        int soma = 0;
        for (Integer note : notes) {
            soma += note;
        }
        return (double) soma / notes.size();
    }
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int notaAleatoria = random.nextInt(10);
            notas.add(notaAleatoria);
        }
        double mediaFinal = calculatedMedia(notas);
        System.out.println("Nota final: " + mediaFinal);
    }



}