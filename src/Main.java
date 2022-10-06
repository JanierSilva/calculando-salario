import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Janier");
        v.setSalario(1000.0f);
        v.setCpf("00011122233");
        v.setDataNascimento(new Date());
        v.setComissaoPoritem(10.0f);
        v.setTotalItensVendidos(10);

        System.out.println("O salário do Vendedor é: " + v.calcularSalario());

        Motorista m =  new Motorista();
    }
}