package forewhile;

public class ExemploContinue {
    public static void main(String args[]){
        for(int contador=1; contador<=100; contador++){
            if(contador%5!=0){
                continue;//multiplo de 5.
            }
            System.out.println(("Contador: "+contador));
        }
    }
}
