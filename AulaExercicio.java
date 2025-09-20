package devdojo.aulas.maratonajava.introducao;

public class AulaExercicio {
    public static void main(String[] args) {
        double wage = 70000;
        double result;
        if (wage <= 34712){
            result = wage * 0.097;
        }else if(wage >=34713 && wage <= 68507){
            result = wage * 0.3735;
        }else{
            result = wage * 0.4950;
        }
        System.out.println("O imposto a ser pago é " + result + " e o salário anual é " + wage);
    }
}
