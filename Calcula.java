public class Calcula {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public void exibir_sequencia(int tamanho){
        for (int i = 0; i < tamanho; i++) {
            System.out.print("(" + i + "):" + fibo(i) + "\t");
        }


    }

}
