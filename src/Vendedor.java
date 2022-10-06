import java.util.Date;

public class Vendedor  extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPoritem;

    //linha 9 está meu construtor
    public Vendedor(){
        super();
    }
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPoritem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPoritem() {
        return comissaoPoritem;
    }

    public void setComissaoPoritem(float comissaoPoritem) {
        this.comissaoPoritem = comissaoPoritem;
    }
}
