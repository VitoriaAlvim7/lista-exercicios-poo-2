package estruturaSequencial.troco;

public class Troco {

    private float precoProduto;
    private int quantidade;
    private float valorPago;

    public Troco(float precoProduto, int quantidade, float valorPago) {
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.valorPago = valorPago;
    }

    public float calcularTroco() {
        float totalCompra = precoProduto * quantidade;
        return valorPago - totalCompra;
    }
}
