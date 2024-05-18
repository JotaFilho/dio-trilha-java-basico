import java.util.Locale;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scann = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parametro");
        int parametroUm = scann.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametroDois = scann.nextInt();

        try {
            //chamando o método conterndo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois)  throws  ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }


        subtracao(parametroUm, parametroDois);

    }
    static void subtracao(int parametroUm, int parametroDois){
        for (int i = parametroUm; i <= parametroDois; i++){
            System.out.println("Número: " + i);

        }
    }
}
