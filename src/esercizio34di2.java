public class esercizio34di2 {

    private static String CheckValue(int value){
        String resultado = value % 5 == 0 ? "FizzBuzz" : "Buzz";
        return resultado;
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            System.out.println(CheckValue(i));
        }

    }
}
