package meuprojeto;

public class contaTeste {
    public static void main (String[] args){
        conta conta = new conta();
        conta.cliente = "Daniel";
        conta.saldo = 4_000.00;
        conta.exibesaldo();
    }
}
