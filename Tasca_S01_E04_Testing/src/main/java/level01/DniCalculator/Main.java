package level01.DniCalculator;

public class Main {
    public static void main(String[] args){
        DniCalculator idCalculator = new DniCalculator();

        String IdUser = "654A2586";
        char letter = idCalculator.calculateLetter(IdUser);

        System.out.println("The DNI is: " + IdUser + letter );
    }
}
