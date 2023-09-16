package ExercicioBanco;

public class Conta {
    private Integer numero;

    private Double saldo;

    private Double limite;

    public Conta(Integer numero) {
        this.numero = numero;
        this.saldo = 0D;
        this.limite = 0D;
    }

    public Conta(Integer numero, Double limite) {
        this.numero = numero;
        this.saldo = 0D;
        this.limite = limite;
    }

    public void atualizarSaldo(Double valor) {
        this.saldo += valor; 
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
    }    

}