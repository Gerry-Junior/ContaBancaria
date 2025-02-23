public class ContaDadosValores {
    private double saldo;

    public ContaDadosValores() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("\nFoi depositado R$" + valor + " ");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean retirarSaldo(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Foi retirado R$ " + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
        public double getSaldo(){
            return saldo;
        }

        public void setSaldo(double saldo){
            this.saldo = saldo;
        }
    }


